package com.junshijia.ecs;

import com.junshijia.ecs.create_table.CreateTableRoutine;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.process.InitUpdateTable;
import com.junshijia.ecs.process.SingleTurbineDataProcess;

public class Main {
    public static void main(String[] args) {
        //删除之前的表
        ReadCSV read = new ReadCSV();
//        Configuration cfg = new Configuration().configure();
//        SchemaExport export = new SchemaExport(cfg);
//        export.drop(true, true);
        //1.建表进程
        //建立新表
        CreateTableRoutine create = new CreateTableRoutine();
        create.createTable();

        String ip = "192.168.10.30";
        int turbineNum = 1;
        InitUpdateTable initTables = new InitUpdateTable(turbineNum);
        SingleTurbineDataProcess process1 = new SingleTurbineDataProcess(1,ip,read);
//        SingleTurbineDataProcess process2 = new SingleTurbineDataProcess(2,ip);
//        SingleTurbineDataProcess process3 = new SingleTurbineDataProcess(3,ip);
//        SingleTurbineDataProcess process4 = new SingleTurbineDataProcess(4,ip);
//        SingleTurbineDataProcess process5 = new SingleTurbineDataProcess(5,ip);
//        SingleTurbineDataProcess process6 = new SingleTurbineDataProcess(6,ip);
//        SingleTurbineDataProcess process7 = new SingleTurbineDataProcess(7,ip);
//        SingleTurbineDataProcess process8 = new SingleTurbineDataProcess(8,ip);
//        SingleTurbineDataProcess process9 = new SingleTurbineDataProcess(9,ip);
//        SingleTurbineDataProcess process10 = new SingleTurbineDataProcess(10,ip);
//        SingleTurbineDataProcess process11 = new SingleTurbineDataProcess(11,ip);
//        SingleTurbineDataProcess process12 = new SingleTurbineDataProcess(12,ip);
//        SingleTurbineDataProcess process13 = new SingleTurbineDataProcess(13,ip);
//        SingleTurbineDataProcess process14 = new SingleTurbineDataProcess(14,ip);
//        SingleTurbineDataProcess process15 = new SingleTurbineDataProcess(15,ip);
//        SingleTurbineDataProcess process16 = new SingleTurbineDataProcess(16,ip);
//        SingleTurbineDataProcess process17 = new SingleTurbineDataProcess(17,ip);
//        SingleTurbineDataProcess process18 = new SingleTurbineDataProcess(18,ip);
//        SingleTurbineDataProcess process19 = new SingleTurbineDataProcess(19,ip);
//        SingleTurbineDataProcess process20 = new SingleTurbineDataProcess(20,ip);


//        ExecutorService executor = Executors.newFixedThreadPool(10);
//
//        executor.submit(()->{
//            process1.tenMinRoutine();
//        });
//        new Thread(create::loopCreateTable).start();
        new Thread(process1::tenMinRoutine).start();
//        new Thread(process2::tenMinRoutine).start();
//        new Thread(process3::tenMinRoutine).start();
//        new Thread(process4::tenMinRoutine).start();
//        new Thread(process5::tenMinRoutine).start();
//        new Thread(process6::tenMinRoutine).start();
//        new Thread(process7::tenMinRoutine).start();
//        new Thread(process8::tenMinRoutine).start();
//        new Thread(process9::tenMinRoutine).start();
//        new Thread(process10::tenMinRoutine).start();
//        new Thread(process11::tenMinRoutine).start();
//        new Thread(process12::tenMinRoutine).start();
//        new Thread(process13::tenMinRoutine).start();
//        new Thread(process14::tenMinRoutine).start();
//        new Thread(process15::tenMinRoutine).start();
//        new Thread(process16::tenMinRoutine).start();
//        new Thread(process17::tenMinRoutine).start();
//        new Thread(process18::tenMinRoutine).start();
//        new Thread(process19::tenMinRoutine).start();
//        new Thread(process20::tenMinRoutine).start();

    }
}
