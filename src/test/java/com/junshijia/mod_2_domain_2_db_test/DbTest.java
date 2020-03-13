package com.junshijia.mod_2_domain_2_db_test;

import com.junshijia.ecs.db_name.AutoTableName;
import com.junshijia.ecs.util.EcsUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.Date;

public class DbTest {
    @Test
    public void dbTest(){
        Session session;
        session= EcsUtils.getFactory().openSession(new AutoTableName("testTable","__table_yeah_"));
        //session= EcsUtils.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        //save one sec data and update data
        testTable test = new testTable();
        test.setTime(new Date());
        test.setHMI_IReg155(999.99F);
        session.save(test);

        tx.commit();
        session.close();
    }
}
