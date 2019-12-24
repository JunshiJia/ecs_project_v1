package com.junshijia.ecs.util;

import com.junshijia.ecs.db_name.EcsNameStrategy;
import com.junshijia.ecs.domain.UpdateData2DB;
import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.locator.BaseLocator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.Map;

import java.util.Set;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class EcsUtils {
    private EcsUtils(){}


    /**
     * 用于hibernate的utils
     */
    private static SessionFactory factory;
    static{
        Configuration c = new Configuration();
        c.setNamingStrategy(EcsNameStrategy.INSTANCE);
        c.configure();
        factory = c.buildSessionFactory();
    }
    public static SessionFactory getFactory(){
        return factory  ;
    }

    public static Session getSession(){
        return factory.openSession();
    }

    //判断字符串是否是数字
    public static boolean isInteger(String str) {
        Pattern pattern = compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    public static boolean isAlpha(String str){
        char first = 0;
        try {
            first = str.charAt(0);
        } catch (Exception e) {
            return false;
        }
        if( first >= 65 && first <= 90 ){
            return true;
        }
        return false;
    }

    //删除中括号
    public static String deleteChar(String str) {
        String delStr = "";
        char delChar1 = '[', delChar2= ']';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != delChar1 && str.charAt(i) != delChar2 ) {
                delStr += str.charAt(i);
            }
        }
        return delStr;
    }

    /**
     * 获取属性名数组
     * */
    public static String[] getFiledName(Object o){
        Field[] fields=o.getClass().getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        for(int i=0;i<fields.length;i++){
            //System.out.println(fields[i].getType());
            fieldNames[i]=fields[i].getName();
        }
        return fieldNames;
    }

    //获取类的属性名的字符串
    public static String[] getFiledNameByClz(String path){
        Class clz = null;
        try {
            clz = Class.forName(path);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Field[] fields=clz.getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        for(int i=0;i<fields.length;i++){
            //System.out.println(fields[i].getType());
            fieldNames[i]=fields[i].getName();
        }
        return fieldNames;
    }

    //获取field
    public static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, null);
            Object value = method.invoke(o, null);
            return value;
        } catch (Exception e) {
            return null;
        }
    }
    //测试，另一种由属性名获得属性值的方法 返回单个object
    public static Object getFieldValueByName2(String fieldName, Object o) {
        Object value = new Object();
        try {
            Field f = o.getClass().getDeclaredField(fieldName);
            f.setAccessible(true);
            value = f.get(o);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return value;
    }

    //通过属性名设置属性值
    //注意：传入的value一定要对应属性类型否则报错
    public static void setFieldValue(String fieldName, Object value, Object obj){
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(obj,value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static BatchRead<Integer> addBatchLocator(BatchRead<Integer> batch, Set<String> set){
        batch.setContiguousRequests(false);
        int i = 0;
        for(String data : set){
            if(data.charAt(0)=='a') {
                batch.addLocator(i++, BaseLocator.coilStatus(1,Integer.parseInt(data.substring(1))));
            }
            else if(data.charAt(0)=='b'){
                batch.addLocator(i++, BaseLocator.inputStatus(1,Integer.parseInt(data.substring(1))-100000));
            }
            else if(data.charAt(0)=='c'){
                batch.addLocator(i++, BaseLocator.inputRegister(1,Integer.parseInt(data.substring(1))-300000, DataType.FOUR_BYTE_FLOAT));
            }
            else if(data.charAt(0)=='d'){
                batch.addLocator(i++, BaseLocator.holdingRegister(1,Integer.parseInt(data.substring(1))-400000, DataType.FOUR_BYTE_FLOAT));
            }
        }
        return batch;
    }

    public static Set<String> writeData2Domain(Set<String> set, BatchResults<Integer> results, Object data){
        int i = 0;
        for(String encoding : set) {
            //System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
            if(encoding.charAt(0)=='a' || encoding.charAt(0)=='b'){
                setFieldValue(encoding,results.getValue(i),data);
            }
            else if(encoding.charAt(0)=='c' || encoding.charAt(0)=='d'){
                setFieldValue(encoding,results.getValue(i),data);
            }
            i++;
        }
        return set;
    }

}
