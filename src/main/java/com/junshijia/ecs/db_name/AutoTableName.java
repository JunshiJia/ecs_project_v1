package com.junshijia.ecs.db_name;

import com.junshijia.ecs.create_table.BuildSqlString;
import org.hibernate.EmptyInterceptor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AutoTableName extends EmptyInterceptor {
    private String targetName;// 目标表名
    private String tableName;// 操作表名
    private BuildSqlString buildSqlString;
    private int id;

    public AutoTableName(int id) {
        buildSqlString = new BuildSqlString();
        this.id = id;
    }

    public void setTableNames(int caseNum){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String time = formatter.format(date);
        StringBuilder sb = new StringBuilder();
        if(caseNum == 0){
            sb.append("wt").append(id).append("V").append(this.buildSqlString.getVersion())
                    .append("_oneSec").append(time);
            this.targetName = "one_sec";
            this.tableName = sb.toString();
        }else if(caseNum == 1){
            sb.append("wt").append(id).append("V").append(this.buildSqlString.getVersion())
                    .append("_anyOneSec").append(time);
            this.targetName = "one_sec_any";
            this.tableName = sb.toString();
        }
    }
 
    @Override
    public String onPrepareStatement(String sql) {
        sql = sql.replaceAll(targetName, tableName);
        return sql;
    }
 
}