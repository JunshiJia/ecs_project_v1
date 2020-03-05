package com.junshijia.ecs.calculation;

import com.junshijia.ecs.domain.TenMinData2DB;
import com.junshijia.ecs.domain.TenMinMemory;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

import java.lang.reflect.Field;

public class TenMinCal {
    private TenMinMemory memoryData;
    private TenMinData2DB data2DB;
    private StandardDeviation stdDiv;
    private String[] fieldNames;

    public TenMinCal(TenMinMemory memoryData, TenMinData2DB data2DB) {
        this.memoryData = memoryData;
        this.data2DB = data2DB;
        this.stdDiv = new StandardDeviation();
        this.setFieldNames();
        this.calculate();
    }

    private void setFieldNames(){
        Field[] fields = data2DB.getClass().getDeclaredFields();
        this.fieldNames=new String[fields.length-2];
        for(int i=0,j=0;i<fields.length;i++){
            if(fields[i].getName().charAt(0)=='H') {
                fieldNames[j++] = fields[i].getName();
            }
        }
    }

    public void Test(){
        int nameLength;
        int i = 0;
        System.out.println(this.fieldNames.length);
        for(String name : this.fieldNames){
            nameLength = name.length();
            if(name.substring(nameLength-3).equals("Max")){

            }else if(name.substring(nameLength-3).equals("ean")){

            }else if(name.substring(nameLength-3).equals("Min")){

            }else if(name.substring(nameLength-3).equals("And")){

            }else if(name.substring(nameLength-3).equals("Div")){

            }else if(name.substring(nameLength-3).equals("low")){

            }else if(name.substring(nameLength-3).equals("Num")){

            }
        }
        System.out.println(i);
    }

    private void calculate(){
        int nameLength;
        for(String name : this.fieldNames){
            nameLength = name.length();
            if(name.substring(nameLength-3).equals("Max")){

            }
        }
    }

    public TenMinData2DB getData2DB() {
        return data2DB;
    }

}
