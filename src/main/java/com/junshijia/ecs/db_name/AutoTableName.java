package com.junshijia.ecs.db_name;

import org.hibernate.EmptyInterceptor;

public class AutoTableName extends EmptyInterceptor {
    private String targetName;// 目标表名
    private String tableName;// 操作表名
 
    public AutoTableName() {

    }
 
    public AutoTableName(String targetName,String tableName) {
        this.targetName= targetName;
        this.tableName= tableName;
    }
 
    @Override
    public String onPrepareStatement(String sql) {
        sql = sql.replaceAll(targetName, tableName);
        return sql;
    }
 
}