package com.junshijia.ecs.calculation;

import com.junshijia.ecs.domain.TenMinData2DB;
import com.junshijia.ecs.domain.TenMinMemory;
import com.junshijia.ecs.util.EcsUtils;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TenMinCal {
    private TenMinMemory memoryData;
    private TenMinData2DB data2DB;
    private StandardDeviation stdDiv;
    //tenmin2db的每个元素
    private String[] fieldNames;
    //memoryData的class
    private Class<?> memoryClass;
    private Class<?> tenMinDataClass;

    public TenMinCal() {
        try {
            this.memoryClass = Class.forName("com.junshijia.ecs.domain.TenMinMemory");
            this.tenMinDataClass = Class.forName("com.junshijia.ecs.domain.TenMinData2DB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.stdDiv = new StandardDeviation();
        this.setFieldNames();
    }
    public void setDataAndCalculate(TenMinMemory memoryData, TenMinData2DB data2DB){
        this.memoryData = memoryData;
        this.data2DB = data2DB;
        this.data2DB.setTime(new Date());
        this.calculate();
    }
    //前3个属性名不用
    private void setFieldNames(){
        Field[] fields =  this.tenMinDataClass.getDeclaredFields();
        this.fieldNames=new String[fields.length-3];
        for(int i=0,j=0;i<fields.length;i++){
            if(fields[i].getName().charAt(0)=='H') {
                fieldNames[j++] = fields[i].getName();
            }
        }
    }

    public void calculate(){
        List<Float> floatList;
        List<Boolean> boolList;
        int nameLength;
        String getterName;
        String fieldName;
        Method method;
        Float floatNum;
        Boolean boolValue;
        double[] array;
        try {
            for(String name : this.fieldNames){
                nameLength = name.length();
                if(name.substring(nameLength-3).equals("Max")){
                    if(check(name)) {
                        fieldName = name.substring(0, (nameLength - 3));
                        getterName = "get" + fieldName + "List";
                        method = this.memoryClass.getMethod(getterName, null);
                        floatList = (List<Float>) method.invoke(this.memoryData, null);
                        floatNum = Collections.max(floatList);
                        this.setFieldValue(name, floatNum);
                    }
                }else if(name.substring(nameLength-3).equals("ean")){
                    if(check(name)) {
                        fieldName = name.substring(0, (nameLength - 4));
                        getterName = "get" + fieldName + "List";
                        method = this.memoryClass.getMethod(getterName, null);
                        floatList = (List<Float>) method.invoke(this.memoryData, null);
                        array = EcsUtils.floatList2DoubleArray(floatList);
                        floatNum = (float)StatUtils.mean(array);
                        this.setFieldValue(name, floatNum);
                    }
                }else if(name.substring(nameLength-3).equals("Min")){
                    if(check(name)) {
                        fieldName = name.substring(0, (nameLength - 3));
                        getterName = "get" + fieldName + "List";
                        method = this.memoryClass.getMethod(getterName, null);
                        floatList = (List<Float>) method.invoke(this.memoryData, null);
                        floatNum = Collections.max(floatList);
                        this.setFieldValue(name, floatNum);
                    }
                }else if(name.substring(nameLength-3).equals("And")){
                    if(!check(name)) {
                        fieldName = name.substring(0, (nameLength - 3));
                        getterName = "get" + fieldName + "List";
                        method = this.memoryClass.getMethod(getterName, null);
                        boolList = (List<Boolean>) method.invoke(this.memoryData, null);
                        boolValue = false;
                        for(Boolean value : boolList){
                            if(value){
                                boolValue = true;
                                break;
                            }
                        }
                        this.setFieldValue(name, boolValue);
                    }
                }else if(name.substring(nameLength-3).equals("Div")){
                    if(check(name)) {
                        fieldName = name.substring(0, (nameLength - 6));
                        getterName = "get" + fieldName + "List";
                        method = this.memoryClass.getMethod(getterName, null);
                        floatList = (List<Float>) method.invoke(this.memoryData, null);
                        array = EcsUtils.floatList2DoubleArray(floatList);
                        floatNum = (float)this.stdDiv.evaluate(array);
                        this.setFieldValue(name, floatNum);
                    }
                }else if(name.substring(nameLength-3).equals("low")){
                    if(check(name)) {
                        fieldName = name.substring(0, (nameLength - 4));
                        getterName = "get" + fieldName + "List";
                        method = this.memoryClass.getMethod(getterName, null);
                        floatList = (List<Float>) method.invoke(this.memoryData, null);
                        array = EcsUtils.floatList2DoubleArray(floatList);
                        floatNum = (float)this.stdDiv.evaluate(array);
                        this.setFieldValue(name, floatNum);
                    }
                }else if(name.substring(nameLength-3).equals("Num")){
                    fieldName = name.substring(0, (nameLength - 6));
                    getterName = "get" + fieldName + "List";
                    method = this.memoryClass.getMethod(getterName, null);
                    if(check(name)) {
                        floatList = (List<Float>) method.invoke(this.memoryData, null);
                        floatNum = this.floatMaxNum(floatList);
                        this.setFieldValue(name, floatNum);
                    }else{
                        boolList = (List<Boolean>) method.invoke(this.memoryData, null);
                        boolValue = this.boolMaxNum(boolList);
                        Float value = boolValue ? 1F:0F;
                        this.setFieldValue(name, value);
                    }
                }else{
                    System.out.println("error...");
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public TenMinData2DB getData2DB() {
        return data2DB;
    }

    private void setFieldValue(String name, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field tenMinDataField;
        tenMinDataField = this.tenMinDataClass.getDeclaredField(name);
        tenMinDataField.setAccessible(true);
        tenMinDataField.set(this.data2DB,value);
    }

    private boolean check(String name){
        boolean flag;
        if (name.charAt(4)=='I' || name.charAt(4)=='H'){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    private Boolean boolMaxNum(List<Boolean> list){
        int i = 0;
        int j = 0;
        Boolean result = false;
        for(Boolean bool : list){
            if(bool){
                i++;
            }else{
                j++;
            }
        }
        if(i >= j){
            result = true;
        }
        return result;
    }

    private Float floatMaxNum(List<Float> list){
        Float result = 0F;
        Map<Float, Integer> map = new HashMap<>();
        for(Float aFloat : list){
            if(map.containsKey(aFloat)){
                map.put(aFloat, (map.get(aFloat) + 1));
            }else{
                map.put(aFloat, 1);
            }
        }
        Iterator<Float> keys = map.keySet().iterator();
        Integer max = 0;
        while(keys.hasNext()) {
            Float key = keys.next();
            if(max <= map.get(key)){
                max = map.get(key);
                result = key;
            }
        }
        return result;
    }

}
