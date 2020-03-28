package com.junshijia.read_modbus_test;

import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;
import org.junit.Test;

public class readModbusTest {
    @Test
    public void readModbusOnce(){
        ReadCSV read = new ReadCSV();
        FetchMainControlData fetch = new FetchMainControlData("192.168.10.30",
                read.getUpdateMap(), read.getOneSecMap(), read.getAnyOneSecMap(), read.getTenMinMap());
        while(true) {

            fetch.readFromSlave2Domain();

            System.out.println(fetch.getUpdateData().getHMI_IReg210());
        }
    }
}
