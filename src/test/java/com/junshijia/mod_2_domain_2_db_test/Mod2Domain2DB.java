package com.junshijia.mod_2_domain_2_db_test;

import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.domain.UpdateData2DB_old;
import com.junshijia.ecs.util.EcsUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.Date;

public class Mod2Domain2DB {
    /**
     * 通过update测试，用saveorupdate可以达到update效果
     */
    @Test
    public void Mod2Domain2DBTest1(){
        ReadCSV read = new ReadCSV();
        System.out.println(read.getOneSecSet());
        FetchMainControlData fetch = new FetchMainControlData(read.getUpdateSet(),read.getOneSecSet(),read.getAnyOneSecSet());
        //fetch.readFromSlave2Domain();
        System.out.println(fetch.getDBUpdateData());
        Session session = null;
        Transaction tx = null;

        boolean flag = true;
        while(flag) {
            try {
                //初始化表
                UpdateData2DB_old initData = new UpdateData2DB_old();
                //OneSecData2DB initOneSecData = new OneSecData2DB();
                initData.setId(1);
                session = EcsUtils.getSession();
                tx = session.beginTransaction();
                session.save(initData);
                //session.save(initOneSecData);
                tx.commit();
                session.close();
                flag = false;
            } catch (HibernateException e) {
                System.out.println("no need to init update db, continue...");
                flag = false;
                if (session!=null) {
                    //tx.commit();
                    session.close();
                }
            }
        }

        //db 出现错误
        try {
            for(int i = 0; i<6;i++) {
                fetch.readFromSlave2Domain();
                //set update data time
                fetch.getDBUpdateData().setId(1);
                fetch.getDBUpdateData().setWtId(i*2);
                fetch.getDBUpdateData().setTime(new Date());
                //any one sec data time
                fetch.getAnyOneSecData().setTime(new Date());
                //save one sec data and update data
                session = EcsUtils.getSession();
                tx = session.beginTransaction();
                session.update(fetch.getDBUpdateData());
                session.save(fetch.getAnyOneSecData());
                //save one sec data
                if(!fetch.getStatus().isRunning()){
                    fetch.getOneSecData().setTime(new Date());
                    session.save(fetch.getOneSecData());
                }
                tx.commit();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}
