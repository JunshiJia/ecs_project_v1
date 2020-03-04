package com.junshijia.reflection_test;

import com.junshijia.ecs.domain.TenMinMemory;
import com.junshijia.ecs.util.EcsUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTest {
    @Test public void invokeTest() {
        TenMinMemory tenMinData = new TenMinMemory();
        String[] fieldNames = EcsUtils.getFiledNames(tenMinData);
        String fieldName;
        String firstLetter;
        String getter;
        int i = 0;
        try {
            //获取类对象
            Class<?> aClass =Class.forName("java.util.List");
            Class<?> aClass1 =tenMinData.getClass();
            //获取类对象中的方法                   类中方法名   方法的参数类型
            Method m = aClass.getDeclaredMethod("add", Object.class);
            //执行此方法  list为对象,100为传入的参数
            fieldName = fieldNames[0];
            firstLetter = fieldName.substring(0, 1).toUpperCase();
            getter = "get" + firstLetter + fieldName.substring(1);
            Method getDomain=aClass1.getMethod(getter,null);

            //true shi nali lai de
            m.invoke(getDomain.invoke(tenMinData,null), true);
            //test
            System.out.println(getDomain.invoke(tenMinData,null).toString());
            System.out.println(getter);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(tenMinData.getHMI_Disc910List().toString());
    }
}
