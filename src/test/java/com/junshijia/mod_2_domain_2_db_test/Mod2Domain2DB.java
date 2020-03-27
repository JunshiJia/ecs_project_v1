package com.junshijia.mod_2_domain_2_db_test;

import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.domain.UpdateData2DB;
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
        FetchMainControlData fetch = new FetchMainControlData("127.0.0.1",
                read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(),read.getTenMinMap());
        //fetch.readFromSlave2Domain();

        Session session = null;
        Transaction tx = null;
        long start2 = System.currentTimeMillis();

        boolean flag = true;
        while(flag) {
            try {
                //初始化表
                UpdateData2DB initData = new UpdateData2DB();


                for(int i = 1; i <= 15; i++) {
                    session = EcsUtils.getSession();
                    tx = session.beginTransaction();
                    initData.setId(i);
                    session.save(initData);
                    tx.commit();
                    session.close();
                }
                //session.save(initOneSecData);


                flag = false;
            } catch (HibernateException e) {
                e.printStackTrace();
                System.out.println("no need to init update db, continue...");
                flag = false;
                if (session!=null) {
                    //tx.commit();
                    session.close();
                }
            }
        }

        try {
            for(int i = 0; i< 100;i++) {
                //long start = System.currentTimeMillis();
                fetch.readFromSlave2Domain();
                //set update data time
                fetch.getUpdateData().setId(1);
                fetch.getUpdateData().setWtId(i*2+"");
                fetch.getUpdateData().setTime(new Date());
                //save one sec data and update data
                session = EcsUtils.getSession();
                tx = session.beginTransaction();
                session.update(fetch.getUpdateData());

                fetch.getOneSecData().setTime(new Date());
                fetch.getAnyOneSecData().setTime(new Date());
                session.save(fetch.getOneSecData());
                session.save(fetch.getAnyOneSecData());

                tx.commit();
                //long end = System.currentTimeMillis();
                //System.out.println(end-start);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

    }
}
