package com.junshijia.fetch_10min_memory_data_test;

import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.domain.TenMinMemory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FetTenMinMemoryData {
    private long startTime;
    private long endTime;
    private TenMinMemory data;
    private ReadCSV read;
    @Before
    public void time1(){
        //获取开始时间

        read = new ReadCSV();
        startTime = System.currentTimeMillis();
    }

    @Test
    public void tenMinDataTest1(){
        FetchMainControlData fetch = new FetchMainControlData(read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(), read.getTenMinMap());
        fetch.readFromSlave2Domain();
        data=fetch.getTenMinMemoryData();
    }

    @After
    public void time2(){
        endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        System.out.println(data.toString());
    }
}
