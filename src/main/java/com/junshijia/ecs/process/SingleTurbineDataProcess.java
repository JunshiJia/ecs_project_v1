package com.junshijia.ecs.process;

import com.junshijia.ecs.calculation.ExtraTenMinCal;
import com.junshijia.ecs.calculation.TenMinCal;
import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.domain.ExtraTenData2DB;
import com.junshijia.ecs.domain.TenMinData2DB;
import com.junshijia.ecs.util.EcsUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class SingleTurbineDataProcess {
    private int turbineId;
    //private String wtId;
    private ReadCSV read;
    private FetchMainControlData fetch;
    private TenMinCal tenMinCal;
    private ExtraTenMinCal extraTenMinCal;
    private Session session;
    private Transaction tx;
    //counter
    private int counter;

    public SingleTurbineDataProcess(int turbineId){
        this.turbineId = turbineId;
        //this.wtId = wtId;
        this.read = new ReadCSV();
        this.fetch = new FetchMainControlData(
                read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(), read.getTenMinMap());
        this.session = null;
        this.tenMinCal = new TenMinCal();
        this.extraTenMinCal = new ExtraTenMinCal();
    }

    public void tenMinRoutine(){
        long startTime = 0;
        long endTime = 0;
        long during = 0;
        long total = 0;
        //starts loop
        //while(true) {
            for(counter = 0; counter < 599; counter++) {
                startTime = System.currentTimeMillis();
                //1.get modbus data
                this.fetch.readFromSlave2Domain();
                //2.modbus data 2 db every second
                this.realTimeData2db();
                //3.deal with time
                endTime = System.currentTimeMillis();
                during = endTime - startTime;
                System.out.println("each cycle using time: "+during);
                if(counter == 0){
                    //init extra ten min calculation data
                    this.extraTenMinCal.InitData(new ExtraTenData2DB(""+this.turbineId),
                            this.fetch.getUpdateData(),this.fetch.getOneSecData());
                }else if(counter == 598) {
                    startTime = System.currentTimeMillis();
                    //3.cal normal ten min data
                    this.tenMinCal.setDataAndCalculate(this.fetch.getTenMinMemoryData(),new TenMinData2DB());
                    //4.cal extra ten min data
                    this.extraTenMinCal.setDataTenMinLaterAndCalculate(this.fetch.getTenMinMemoryData(),
                            this.fetch.getUpdateData(),this.fetch.getOneSecData());
                    //5.datas 2 db
                    System.out.println(this.tenMinCal.getData2DB().toString());
                    this.tenMinDatas2db();
                    //6.renew memory data
                    this.fetch.renewMemory();
                    //watch time
                    endTime = System.currentTimeMillis();
                    during = endTime-startTime;
                    total+=during;
                    System.out.println("10 min calculate time = "+during+"ms");
                    System.out.println("total time = "+total+"ms");
                }
                //this.session.close();
                //w8 until 1 second
                this.waitRoutine(during);
                endTime = System.currentTimeMillis();
                System.out.println("after sleep use time: "+(endTime-startTime));
                total += endTime - startTime;
            }
    //    }

    }

    private void realTimeData2db(){
        boolean flag = true;
        while(flag) {
            try {
                //2.set data time
                //1.begin db session
                this.session = EcsUtils.getSession();
                this.tx = session.beginTransaction();
                this.fetch.getUpdateData().setId(this.turbineId);
                this.fetch.getUpdateData().setWtId(this.turbineId);
                this.fetch.getUpdateData().setTime(new Date());
                this.fetch.getOneSecData().setTime(new Date());
                this.fetch.getAnyOneSecData().setTime(new Date());
                //3.save one sec data and update data
                this.session.update(this.fetch.getUpdateData());
                this.session.save(this.fetch.getOneSecData());
                this.session.save(this.fetch.getAnyOneSecData());
                this.tx.commit();
                session.close();
                flag = false;
            } catch (HibernateException e) {
                e.printStackTrace();
                this.dbExceptionHandle();
            }
        }
    }


    private void tenMinDatas2db(){
        boolean flag = true;
        while(flag) {
            try {
                //1.begin db session
                this.session = EcsUtils.getSession();
                this.tx = session.beginTransaction();
                //save one sec data and update data
                this.session.save(this.tenMinCal.getData2DB());
                this.session.save(this.extraTenMinCal.getData2DB());
                this.tx.commit();
                this.session.close();
                flag = false;
            } catch (HibernateException e) {
                e.printStackTrace();
                this.dbExceptionHandle();
            }
        }
    }

    private void waitRoutine(long time){
        if(time > 950){
            System.out.println("too slow");
        }else {
            time = 950 - time;
            System.out.println("sleep: "+time);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void dbExceptionHandle(){
        this.counter = 0;
        System.out.println("db error...");
        this.session.close();
        try {
            Thread.sleep(500000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
