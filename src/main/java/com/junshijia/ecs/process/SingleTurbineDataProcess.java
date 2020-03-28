package com.junshijia.ecs.process;

import com.junshijia.ecs.calculation.ExtraTenMinCal;
import com.junshijia.ecs.calculation.TenMinCal;
import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.db_name.AutoTableName;
import com.junshijia.ecs.domain.ExtraTenData2DB;
import com.junshijia.ecs.domain.TenMinData2DB;
import com.junshijia.ecs.util.EcsUtils;
import com.serotonin.modbus4j.exception.ErrorResponseException;
import com.serotonin.modbus4j.exception.ModbusTransportException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.SQLGrammarException;

import java.util.Date;

public class SingleTurbineDataProcess {
    //field from user input
    private int turbineId;
    private String ip;
    private ReadCSV read;
    private FetchMainControlData fetch;
    private TenMinCal tenMinCal;
    private ExtraTenMinCal extraTenMinCal;
    private Session session;
    private Transaction tx;
    //counter
    private int counter;
    //table name
    private AutoTableName tableName;

    public SingleTurbineDataProcess(int turbineId, String ip){
        this.turbineId = turbineId;
        this.ip = ip;
        this.read = new ReadCSV();
        this.fetch = new FetchMainControlData(this.ip,
                read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(), read.getTenMinMap());
        this.session = null;
        this.tenMinCal = new TenMinCal();
        this.extraTenMinCal = new ExtraTenMinCal();
        this.tableName = new AutoTableName(turbineId);
    }

    public void tenMinRoutine(){
        long startTime = 0;
        long endTime = 0;
        long during = 0;
        long total = 0;
        boolean modbusFlag = true;
        //starts loop
        while(true) {
            for(counter = 0; counter < 599; counter++) {
                startTime = System.currentTimeMillis();
                //1.get modbus data
                while(modbusFlag) {
                    try {
                        this.fetch.readFromSlave2DomainThrow();
                        System.out.println(this.fetch.getUpdateData().getHMI_IReg210()+"--------------------");

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        modbusFlag = false;
                    } catch (ErrorResponseException | ModbusTransportException e) {
                        this.modbusErrorHandle();
                        e.printStackTrace();
                    }
                }
                //2.modbus data 2 db every second
                this.realTimeData2db();
                //3.deal with time
                endTime = System.currentTimeMillis();
                during = endTime - startTime;
                System.out.println("each cycle using time: "+during);
                if(counter == 2){
                    //init extra ten min calculation data
                    this.extraTenMinCal.InitData(
                            this.fetch.getUpdateData());
                }else if(counter == 598) {
                    startTime = System.currentTimeMillis();
                    //3.cal normal ten min data
                    this.tenMinCal.setDataAndCalculate(this.fetch.getTenMinMemoryData(),new TenMinData2DB());
                    //4.cal extra ten min data
                    this.extraTenMinCal.setDataTenMinLaterAndCalculate(this.turbineId, this.fetch.getTenMinMemoryData(),
                            this.fetch.getUpdateData());
                    //5.datas 2 db
                    System.out.println(this.tenMinCal.getData2DB().toString());
                    this.tenMinDatas2db();
                    //6.renew memory data
                    this.fetch.renewMemory();
                    //7.关闭session以免链接数太多

                    //watch time
                    endTime = System.currentTimeMillis();
                    during = endTime-startTime;
                    total+=during;
                    System.out.println("10 min calculate time = "+during+"ms");
                    System.out.println("total time = "+total+"ms");
                }

                modbusFlag = true;


                this.waitRoutine(during);
                endTime = System.currentTimeMillis();
                System.out.println("after sleep use time: "+(endTime-startTime));
                total += endTime - startTime;
            }
        }
    }

    private void realTimeData2db(){
        boolean flag = true;
        while(flag) {
            try {
                //any one sec and update first
                this.tableName.setTableNames(1);
                this.session = EcsUtils.getFactory().openSession(this.tableName);
                session.clear();
                this.tx = session.beginTransaction();
                //set time and id
                this.fetch.getUpdateData().setId(this.turbineId);
                this.fetch.getUpdateData().setWtid("WT"+this.turbineId);
                this.fetch.getUpdateData().setTime(new Date());
                this.fetch.getAnyOneSecData().setWtid("WT"+this.turbineId);
                this.fetch.getAnyOneSecData().setTimeStamp(new Date());
                //save any1sec and update
                this.session.update(this.fetch.getUpdateData());
                System.out.println(this.fetch.getUpdateData().getHMI_IReg210());
                this.session.save(this.fetch.getAnyOneSecData());
                this.tx.commit();
                this.session.close();
                //判断是否存one Sec
                //if(this.fetch.isStatusBool()) {
                if(true) {//test
                    this.tableName.setTableNames(0);
                    this.session = EcsUtils.getFactory().openSession(this.tableName);
                    session.clear();
                    this.tx = session.beginTransaction();
                    this.fetch.getOneSecData().setWtid("WT"+this.turbineId);
                    this.fetch.getOneSecData().setTimeStamp(new Date());
                    this.session.save(this.fetch.getOneSecData());
                    this.tx.commit();
                    session.close();
                }
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
                //save 10min
                this.tableName.setTableNames(2);
                this.session = EcsUtils.getFactory().openSession(this.tableName);
                this.tx = this.session.beginTransaction();
                this.session.save(this.tenMinCal.getData2DB());
                this.tx.commit();
                session.clear();
                this.session.close();

                //save extra 10min
                this.tableName.setTableNames(3);
                this.session = EcsUtils.getFactory().openSession(this.tableName);
                this.tx = this.session.beginTransaction();
                this.session.save(this.extraTenMinCal.getData2DB());
                this.tx.commit();
                session.clear();
                this.session.close();

                flag = false;
            } catch (SQLGrammarException e2){
                System.out.println("e2........");
                e2.printStackTrace();
                this.nanHandle();
            } catch (HibernateException e) {
                System.out.println("e1........");
                e.printStackTrace();
                this.dbExceptionHandle();
            }
        }
    }

    private void nanHandle(){
        this.tableName.setTableNames(3);
        this.session = EcsUtils.getFactory().openSession(this.tableName);
        this.tx = this.session.beginTransaction();
        this.session.save(new ExtraTenData2DB());
        this.tx.commit();
        this.session.close();
    }

    private void waitRoutine(long time){
        if(time > 980){
            System.out.println("too slow");
        }else {
            time = 980 - time;
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
        System.out.println("db error,w8 500s...");
        if(session!=null) {
            this.session.close();
        }
        try {
            Thread.sleep(500000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        //EcsUtils.reConfig();
    }

    private void modbusErrorHandle(){
        this.counter = 0;
        System.out.println("modbus error, w8 500s...");
        if(session!=null) {
            this.session.close();
        }
        try {
            Thread.sleep(500000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


}
