package com.junshijia.read_modbus_test;

import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import org.junit.Test;

public class readModbusTest {
    @Test
    public void readModbusOnce(){
        ReadCSV read = new ReadCSV();
        FetchMainControlData fetch = new FetchMainControlData("127.0.0.1",
                read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(), read.getTenMinMap());
        fetch.readFromSlave2Domain();
        fetch.readFromSlave2Domain();

        System.out.println(fetch.getTenMinMemoryData());
    }
}
