package com.junshijia.ecs.calculation;

import com.junshijia.ecs.domain.ExtraTenData2DB;
import com.junshijia.ecs.domain.TenMinMemory;
import com.junshijia.ecs.domain.UpdateData2DB;

public class ExtraTenMinCal {
    private ExtraTenData2DB data;
    //10 min data 2 db
    private TenMinMemory memoryData;
    private UpdateData2DB updateData;

    public ExtraTenMinCal(ExtraTenData2DB data, TenMinMemory memoryData, UpdateData2DB updateData) {
        this.data = data;
        this.memoryData = memoryData;
        this.updateData = updateData;
        this.calculate();
    }

    private void calculate(){
        //this.data.setA3();
    }

    public ExtraTenData2DB getData() {
        return data;
    }
}
