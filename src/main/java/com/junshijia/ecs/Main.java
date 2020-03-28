package com.junshijia.ecs;

import com.junshijia.ecs.create_table.CreateTableRoutine;
import com.junshijia.ecs.process.InitUpdateTable;
import com.junshijia.ecs.process.SingleTurbineDataProcess;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {
    public static void main(String[] args) {
        //删除之前的表
        Configuration cfg = new Configuration().configure();
        SchemaExport export = new SchemaExport(cfg);
        export.drop(true, true);
        //1.建表进程
        //建立新表
        CreateTableRoutine create = new CreateTableRoutine();
        create.createTable();

        String ip = "192.168.10.30";
        int turbineNum = 5;
        InitUpdateTable initTables = new InitUpdateTable(turbineNum);
        SingleTurbineDataProcess process1 = new SingleTurbineDataProcess(1,ip);
        SingleTurbineDataProcess process2 = new SingleTurbineDataProcess(2,ip);
        SingleTurbineDataProcess process3 = new SingleTurbineDataProcess(3,ip);
        SingleTurbineDataProcess process4 = new SingleTurbineDataProcess(4,ip);
        SingleTurbineDataProcess process5 = new SingleTurbineDataProcess(5,ip);


//        ExecutorService executor = Executors.newFixedThreadPool(10);
//
//        executor.submit(()->{
//            process1.tenMinRoutine();
//        });
        new Thread(create::loopCreateTable).start();
        new Thread(process1::tenMinRoutine).start();
        new Thread(process2::tenMinRoutine).start();
        new Thread(process3::tenMinRoutine).start();
        new Thread(process4::tenMinRoutine).start();
        new Thread(process5::tenMinRoutine).start();
//        new Thread(process6::tenMinRoutine).start();
//        new Thread(process7::tenMinRoutine).start();
//        new Thread(process8::tenMinRoutine).start();
//        new Thread(process9::tenMinRoutine).start();

    }
}
