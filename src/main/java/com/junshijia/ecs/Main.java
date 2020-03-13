package com.junshijia.ecs;

import com.junshijia.ecs.process.InitUpdateTable;
import com.junshijia.ecs.process.SingleTurbineDataProcess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int turbineNum = 10;
        InitUpdateTable initTables = new InitUpdateTable(turbineNum);
        SingleTurbineDataProcess process1 = new SingleTurbineDataProcess(1);
        SingleTurbineDataProcess process2 = new SingleTurbineDataProcess(2);
        SingleTurbineDataProcess process3 = new SingleTurbineDataProcess(3);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(()->{
            process1.tenMinRoutine();
            //process2.tenMinRoutine();
            //process3.tenMinRoutine();
        });

    }
}
