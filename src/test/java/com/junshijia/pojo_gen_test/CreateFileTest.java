package com.junshijia.pojo_gen_test;

import com.junshijia.ecs.pojoGen.*;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class CreateFileTest {
    @Test
    public void fileTest1(){
        File file = new File("src/main/java/com/junshijia/ecs/domain/test.java");
        try {
            FileUtils.write(file,"heheda","UTF-8",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updatePojoGen(){
        UpdatePojoGen test = new UpdatePojoGen();

    }

    @Test
    public void oneSecPojoGen(){
        OneSecPojoGen onSec = new OneSecPojoGen();
    }

    @Test
    public void anyOneSecPojoGen(){
        AnyOneSecPojoGen anyOneSecPojoGen = new AnyOneSecPojoGen();
    }

    @Test
    public void edgePojoGen(){
        EdgePojoGen edgePojoGen = new EdgePojoGen();
    }

    @Test
    public void tenSecPojoGen(){
        TenSecPojoGen tensecPojoGen = new TenSecPojoGen();
    }

    @Test
    public void tenMinPojoGen(){
        TenMinPojoGen tenMinPojoGen = new TenMinPojoGen();
    }

    @Test
    public void memPojoGen(){
        TenMinMemoryGen memPojoGen = new TenMinMemoryGen();
    }
    @Test
    public void extraTenPojoGen(){
        ExtraTenPojoGen extra = new ExtraTenPojoGen();
    }
}
