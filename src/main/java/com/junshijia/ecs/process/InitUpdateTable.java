package com.junshijia.ecs.process;

import com.junshijia.ecs.domain.UpdateData2DB;
import com.junshijia.ecs.util.EcsUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class InitUpdateTable {
    public InitUpdateTable(int num){
        int start = 1;
        Session session = null;
        Transaction tx;
        boolean flag = true;
        while(flag) {
            try {
                //初始化表
                UpdateData2DB initData = new UpdateData2DB();
                for(int i = start; i <= num; i++) {
                    session = EcsUtils.getSession();
                    tx = session.beginTransaction();
                    initData.setId(i);
                    initData.setTime(new Date());
                    session.save(initData);
                    tx.commit();
                    session.close();
                }
                flag = false;
                System.out.println("table init succeed...");
            } catch (HibernateException e) {
                start++;
                e.printStackTrace();
                if (session!=null) {
                    //tx.commit();
                    session.close();
                }
            }
        }
    }
}
