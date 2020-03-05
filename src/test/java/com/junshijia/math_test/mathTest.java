package com.junshijia.math_test;

import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mathTest {
    @Test
    public void mathTest(){
        List<Float> list = new ArrayList<>();
        list.add(1F);
        list.add(2F);
        list.add(2F);
        list.add(2F);
        list.add(2000.11F);
        list.add(2F);
        list.add(2F);
        list.add(2F);
        list.add(2F);

        System.out.println(Collections.max(list));

        double[] array = new double[list.size()];
        for(int i = 0; i < list.size();i++){
            array[i] = (double)list.get(i);
        }
        for(int i = 0; i < list.size();i++){
            System.out.print(array[i]+",");
        }
        System.out.println("");
        StandardDeviation standardDeviation =new StandardDeviation();
        System.out.println("一组数据的标准差为：" + Float.valueOf((float)standardDeviation.evaluate(array)));

    }
}
