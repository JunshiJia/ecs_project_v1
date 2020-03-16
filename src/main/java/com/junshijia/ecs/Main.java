package com.junshijia.ecs;

import com.junshijia.ecs.process.InitUpdateTable;
import com.junshijia.ecs.process.SingleTurbineDataProcess;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //删除之前的表
        Configuration cfg = new Configuration().configure();
        SchemaExport export = new SchemaExport(cfg);
        export.drop(true, true);
        //
        int turbineNum = 10;
        InitUpdateTable initTables = new InitUpdateTable(turbineNum);
        SingleTurbineDataProcess process1 = new SingleTurbineDataProcess(1,"127.0.0.1");

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(()->{
            process1.tenMinRoutine();
            //process2.tenMinRoutine();
            //process3.tenMinRoutine();
        });

    }
}
