package com.junshijia.quick_test;

import com.junshijia.ecs.domain.ExtraTenData2DB;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class GeneralTest {
    @Test
    public void test(){
        float f = 2147483647F;
        System.out.println(f);
        BigDecimal b;
    }

    public void checkNan(ExtraTenData2DB data){
        //遍历所有data的属性
        try {
            Class<?> clz = data.getClass();
            // 获取实体类的所有属性，返回Field数组
            Field[] fields = clz.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                if(field.getGenericType().toString().equals("class java.lang.Float")){
                    Method m = (Method) clz.getMethod("get" + field.getName());
                    Float f  = (Float) m.invoke(data);// 调用getter方法获取属性值
                    if(f!=null) {
                        if (Float.isNaN(f)) {
                            field.set(data,0F);
                        }
                    }
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
