package com.junshijia.ecs.process;

import com.junshijia.ecs.data_transfer.FetchMainControlData;
import com.junshijia.ecs.data_transfer.ReadCSV;

public class modbus2db {
    private ReadCSV read;
    private FetchMainControlData fetch;
    public modbus2db(){
        FetchMainControlData fetch = new FetchMainControlData(
                read.getUpdateMap(),read.getOneSecMap(),read.getAnyOneSecMap(), read.getTenMinMap());
    }
}
