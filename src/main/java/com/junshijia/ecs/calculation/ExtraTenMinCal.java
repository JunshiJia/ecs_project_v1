package com.junshijia.ecs.calculation;

import com.junshijia.ecs.domain.ExtraTenData2DB;
import com.junshijia.ecs.domain.TenMinMemory;
import com.junshijia.ecs.domain.UpdateData2DB;
import com.junshijia.ecs.util.EcsUtils;
import org.apache.commons.math3.stat.StatUtils;

import java.util.Collections;

public class ExtraTenMinCal {
    private ExtraTenData2DB data;
    //10 min data 2 db
    private TenMinMemory memoryData;
    private UpdateData2DB updateData;

    public ExtraTenMinCal(ExtraTenData2DB data, TenMinMemory memoryData, UpdateData2DB updateData) {
        this.data = data;
        this.memoryData = memoryData;
        this.updateData = updateData;
    }

    public void calculate(){
        double data;
        //A3 A44-A46
        data = StatUtils.mean(EcsUtils.floatList2DoubleArray(this.memoryData.getHMI_IReg203List()));
        this.data.setA3(this.calBin(data));
        this.data.setA44((float)data);
        this.data.setA45(Collections.min(this.memoryData.getHMI_IReg203List()));
        this.data.setA46(Collections.max(this.memoryData.getHMI_IReg203List()));
        //A4
        //A5
        data = StatUtils.mean(EcsUtils.floatList2DoubleArray(this.memoryData.getHMI_IReg206List()));
        this.data.setA5(this.calBin(data));
        //A6
        this.data.setA6(this.updateData.isHMI_Disc910());
        //A7
        this.data.setA7((float)StatUtils.mean(
                EcsUtils.floatList2DoubleArray(
                        this.memoryData.getHMI_IReg1422List())));
        //A8

        //A9-A12

        //A13

        //A28-A43

        //A47-62

        //A79 A80
        this.data.setA79(this.updateData.getHMI_IReg199());
        this.data.setA80(this.updateData.getHMI_IReg216());
    }

    private Float calBin(double value){
        int inter;
        double rest;
        inter = (int)value;
        rest = value - inter;
        if(rest < 0.25){
            rest = 0;
        }else if(rest >=0.75){
            rest = 1;
        }else {
            rest = 0.5;
        }
        return (float)(rest+inter);
    }

    public ExtraTenData2DB getData() {
        return data;
    }
}
