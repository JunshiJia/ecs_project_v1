package com.junshijia.create_table;

import com.junshijia.ecs.create_table.CreateTableRoutine;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class CreateTableTest {

    @Test
    public void createTableInCode(){

        //默认读取hibernate.cfg.xml文件
        Configuration cfg = new Configuration().configure();

        SchemaExport export = new SchemaExport(cfg);
        //调用如下方法创建表
        export.drop(true, true);

    }
    @Test
    public void createTableRoutine(){
        CreateTableRoutine create = new CreateTableRoutine();

    }



}
