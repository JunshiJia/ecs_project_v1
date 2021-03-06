package com.junshijia.modbus_2_domain_test;

import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import org.junit.Test;

public class Modbus2Domain {
    @Test
    public void mod2domain_test1(){
        ReadCSV read = new ReadCSV();
        FetchMainControlData fetch = new FetchMainControlData("127.0.0.1",
                read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(),read.getTenMinMap());
        fetch.readFromSlave2Domain();
        System.out.println(fetch.getUpdateData().toString());
    }
}
