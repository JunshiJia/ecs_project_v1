package com.junshijia.ten_min_cal_test;

import com.junshijia.ecs.calculation.ExtraTenMinCal;
import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.domain.TenMinData2DB;
import com.junshijia.ecs.domain.TenMinMemory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExtraTenMinCalTest {
    private long startTime;
    private long endTime;
    private TenMinMemory data;
    private ReadCSV read;
    @Before
    public void time1(){
        //获取开始时间

        read = new ReadCSV();

    }

    @Test
    public void tenMinCalTest1(){
        FetchMainControlData fetch = new FetchMainControlData(read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(), read.getTenMinMap());
        //开始计时
        startTime = System.currentTimeMillis();

        fetch.readFromSlave2Domain();

        TenMinData2DB data2DB = new TenMinData2DB();

        ExtraTenMinCal cal  = new ExtraTenMinCal();
        for(int i  =0 ; i< 600;i++){
            fetch.readFromSlave2Domain();
        }

        cal.calculate();

        System.out.println(cal.getData2DB());

    }

    @After
    public void time2(){
        endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }
}
