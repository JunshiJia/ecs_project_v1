package com.junshijia.new_tec_test;

import org.junit.Test;

public class StringbuilderTest {
    @Test
    public void stringBuilderTest01(){
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        String x = sb.toString();
        System.out.println(x);
    }
}
