package com.junshijia.ecs.process;

import com.junshijia.ecs.calculation.ExtraTenMinCal;
import com.junshijia.ecs.calculation.TenMinCal;
import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.db_name.AutoTableName;
import com.junshijia.ecs.domain.ExtraTenData2DB;
import com.junshijia.ecs.domain.Fault2DB;
import com.junshijia.ecs.domain.TenMinData2DB;
import com.junshijia.ecs.util.EcsUtils;
import com.serotonin.modbus4j.exception.ErrorResponseException;
import com.serotonin.modbus4j.exception.ModbusTransportException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.SQLGrammarException;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
    //fault table process
    private FaultInsert fault;

    public SingleTurbineDataProcess(int turbineId, String ip, ReadCSV read){
        this.turbineId = turbineId;
        this.ip = ip;
        this.read = read;
        this.fetch = new FetchMainControlData(this.ip,
                read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(), read.getTenMinMap());
        this.session = null;
        this.tenMinCal = new TenMinCal();
        this.extraTenMinCal = new ExtraTenMinCal();
        this.tableName = new AutoTableName(turbineId);
        this.fault = new FaultInsert(read.getFaultSet(),read.getFaultMap(),read.getFaultMapInverse());
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
                        modbusFlag = false;
                    } catch (ErrorResponseException | ModbusTransportException e) {
                        this.modbusErrorHandle();
                        e.printStackTrace();
                    }
                }
                //2.modbus data 2 db every second
                this.realTimeData2db();
                //2.1fault table
                this.fault.setUpdateData(this.fetch.getUpdateData());
                this.updateFault2DB();
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
                this.tx = session.beginTransaction();
                //set time and id
                this.fetch.getUpdateData().setId(this.turbineId);
                this.fetch.getUpdateData().setWtid("WT"+this.turbineId);
                this.fetch.getUpdateData().setTime(new Date());
                this.fetch.getAnyOneSecData().setWtid("WT"+this.turbineId);
                this.fetch.getAnyOneSecData().setTimeStamp(new Date());
                //save any1sec and update
                this.session.update(this.fetch.getUpdateData());
                this.session.save(this.fetch.getAnyOneSecData());
                this.tx.commit();
                this.session.close();
                //判断是否存one Sec
                if(this.fetch.isStatusBool()) {
                    this.tableName.setTableNames(0);
                    this.session = EcsUtils.getFactory().openSession(this.tableName);
                    this.tx = session.beginTransaction();
                    this.fetch.getOneSecData().setWtid("WT"+this.turbineId);
                    this.fetch.getOneSecData().setTimeStamp(new Date());
                    this.session.save(this.fetch.getOneSecData());
                    this.tx.commit();
                    this.session.close();
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
                this.session.close();

                //save extra 10min
                this.tableName.setTableNames(3);
                this.session = EcsUtils.getFactory().openSession(this.tableName);
                this.tx = this.session.beginTransaction();
                this.session.save(this.extraTenMinCal.getData2DB());
                this.tx.commit();
                this.session.close();

                flag = false;
            } catch (SQLGrammarException e2){
                System.out.println("nan problem");
                e2.printStackTrace();
                this.nanHandle();
            } catch (HibernateException e) {
                System.out.println("db error");
                e.printStackTrace();
                this.dbExceptionHandle();
            }
        }
    }

    private void updateFault2DB(){
        boolean flag = true;
        while(flag) {
            try {
                if(this.fault.getFault2DBMap().size() > 0 || this.fault.getFault2DBList().size() > 0) {
                    this.tableName.setTableNames(4);
                    this.session = EcsUtils.getFactory().openSession(this.tableName);
                    this.tx = this.session.beginTransaction();
                    //遍历map
                    if (this.fault.getFault2DBMap().size() > 0) {
                        Iterator<Map.Entry<String, Fault2DB>> entries =
                                this.fault.getFault2DBMap().entrySet().iterator();
                        Map.Entry<String, Fault2DB> entry;
                        while (entries.hasNext()) {
                            entry = entries.next();
                            System.out.println("id is:" + entry.getValue().getId());
                            this.session.saveOrUpdate(entry.getValue());
                            this.session.evict(entry.getValue());
                        }
                    }
                    //遍历list
                    if (this.fault.getFault2DBList().size() > 0) {
                        //update所有的已完成错误（库里面应该已经有了次故障的id）
                        for (Fault2DB faultData : this.fault.getFault2DBList()) {
                            this.session.update(faultData);
                        }
                        //清空已完成错误的list
                        this.fault.getFault2DBList().clear();
                    }
                    this.tx.commit();
                    this.session.close();
                }
                flag = false;
            } catch (HibernateException e) {
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
        if(time > 1000){
            System.out.println("too slow");
        }else {
            time = 999 - time;
            System.out.println("sleep: "+time);
            try {
                TimeUnit.MILLISECONDS.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void dbExceptionHandle(){
        this.counter = 0;
        System.out.println("db error,w8 5min...");
        if(session!=null) {
            this.session.close();
        }
        try {
            TimeUnit.MINUTES.sleep(5);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        //EcsUtils.reConfig();
    }

    private void modbusErrorHandle(){
        this.counter = 0;
        System.out.println("modbus error, w8 5min...");
        if(session!=null) {
            this.session.close();
        }
        try {
            TimeUnit.MINUTES.sleep(5);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


}
