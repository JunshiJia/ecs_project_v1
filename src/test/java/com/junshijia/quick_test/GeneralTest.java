package com.junshijia.quick_test;

import com.junshijia.ecs.calculation.TenMinCal;
import com.junshijia.ecs.domain.TenMinData2DB;
import com.junshijia.ecs.domain.TenMinMemory;
import org.junit.Test;

public class GeneralTest {
    @Test
    public void test(){
        TenMinCal cal = new TenMinCal(new TenMinMemory(), new TenMinData2DB());
        cal.Test();
    }
}
