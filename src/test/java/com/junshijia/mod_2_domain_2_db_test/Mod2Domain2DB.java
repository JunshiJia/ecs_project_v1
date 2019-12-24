package com.junshijia.mod_2_domain_2_db_test;

import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.domain.OneSecData2DB;
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
        System.out.println(read.getOneSecSet());
        FetchMainControlData fetch = new FetchMainControlData(read.getUpdateSet(),read.getOneSecSet(),read.getAnyOneSecSet());
        fetch.readFromSlave2Domain();
        System.out.println(fetch.getDBUpdateData());
        Session session = null;
        Transaction tx = null;

        boolean flag = true;
        while(flag) {
            try {
                //初始化表
                UpdateData2DB initData = new UpdateData2DB();
                OneSecData2DB initOneSecData = new OneSecData2DB();
                initData.setId(1);
                session = EcsUtils.getSession();
                tx = session.beginTransaction();
                session.save(initData);
                //session.save(initOneSecData);
                tx.commit();
                session.close();
                flag = false;
            } catch (HibernateException e) {
                System.out.println("no need to update, continue...");
                flag = false;
                if (session!=null) {
                    //tx.commit();
                    session.close();
                }
            }
        }


        for(int i = 0; i<6;i++) {
            //update data
            fetch.getDBUpdateData().setId(1);
            fetch.getDBUpdateData().setWtId(i*2);
            fetch.getDBUpdateData().setTime(new Date());
            //any one sec data
            fetch.getAnyOneSecData().setTime(new Date());
            session = EcsUtils.getSession();
            tx = session.beginTransaction();
            session.update(fetch.getDBUpdateData());
            session.save(fetch.getAnyOneSecData());

            if(fetch.getDBUpdateData().getC302843()<1000){
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

    }
}
