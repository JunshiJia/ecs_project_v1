package com.junshijia.quick_test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GeneralTest {
    @Test
    public void test(){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1,2);
        map.put(2,4);
        map.put(3,6);
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


    }
}
