package com.junshijia.ecs.util;

import com.junshijia.ecs.domain.TenMinMemory;
import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.locator.BaseLocator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class EcsUtils {
    private EcsUtils(){}
    /**
     * 用于hibernate的utils
     */
    private static SessionFactory factory;
    static{
        Configuration c = new Configuration();
        //c.setNamingStrategy(EcsNameStrategy.INSTANCE);
        c.configure();
        factory = c.buildSessionFactory();
    }
    public static SessionFactory getFactory(){
        return factory  ;
    }

    public static Session getSession(){
        return factory.openSession();
    }

    //list->array
    public static double[] floatList2DoubleArray(List<Float> floatList){
        double[] array = new double[floatList.size()];
        for(int i = 0; i < floatList.size(); i++){
            array[i] = floatList.get(i);
        }
        return array;
    }

    //判断字符串是否是数字
    public static boolean isInteger(String str) {
        Pattern pattern = compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    //判断是否是字母
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
    public static String[] getFiledNames(Object o){
        Field[] fields=o.getClass().getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        for(int i=0;i<fields.length;i++){
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
        try{
            String name = deleteChar(fieldName);
            Field field = obj.getClass().getDeclaredField(name);
            field.setAccessible(true);
            field.set(obj,value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //通过属性名设置属性值
    //注意：传入的value一定要对应属性类型否则报错
    public static void addListValue(String fieldName, Object value, Object obj){
        try {
            String name = deleteChar(fieldName);
            Field field = obj.getClass().getDeclaredField(name);
            field.setAccessible(true);
            field.set(obj,value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static BatchRead<Integer> addBatchLocator(BatchRead<Integer> batch, Map<String,Integer> map, int i){
        batch.setContiguousRequests(false);
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            if(entry.getKey().charAt(4)=='C') {
                batch.addLocator(i, BaseLocator.coilStatus(1,entry.getValue()-1));
            }
            else if(entry.getKey().charAt(4)=='D'){
                batch.addLocator(i, BaseLocator.inputStatus(1,entry.getValue()-100001));
            }
            else if(entry.getKey().charAt(4)=='I'){
                batch.addLocator(i, BaseLocator.inputRegister(1,entry.getValue()-300001, DataType.FOUR_BYTE_FLOAT));
            }
            else if(entry.getKey().charAt(4)=='H'){
                batch.addLocator(i, BaseLocator.holdingRegister(1,entry.getValue()-400001, DataType.FOUR_BYTE_FLOAT));
            }else{
                System.out.println("error....");
            }
            i++;
        }

        return batch;
    }

    public static void writeData2Domain(Map<String,Integer> map, BatchResults<Integer> results, Object data, int i){
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            //System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
            setFieldValue(entry.getKey(),results.getValue(i),data);
            i++;
        }
    }

    public static void writeData2List(String[] fieldNames, BatchResults<Integer> results, TenMinMemory data, int i){
        String getter;
        Method addMethod;
        Method getDomain;
        try {
            //获取类对象
            Class<?> dataClass =data.getClass();
            //获取类对象中的方法                                               类中方法名   方法的参数类型
            addMethod = Class.forName("java.util.List").getDeclaredMethod("add", Object.class);
            for(String fieldName : fieldNames) {
                getter = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                getDomain = dataClass.getMethod(getter, null);
                //System.out.println(getter+":"+results.getValue(i));
                addMethod.invoke(getDomain.invoke(data, null), results.getValue(i));
                i++;
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
