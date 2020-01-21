package com.junshijia.field_name_test;



import com.junshijia.ecs.domain.UpdateData2DB_old;
import com.junshijia.ecs.util.EcsUtils;
import org.junit.Test;

public class InvokeGetMethodByFieldNameTest {
    @Test
    public void testInvokeGetMethod(){
        UpdateData2DB_old data1 = new UpdateData2DB_old();
        data1.setC300201(99.99F);
        EcsUtils.setFieldValue("c300201",123F,data1);
        System.out.println(data1.getC300201());
    }


}
