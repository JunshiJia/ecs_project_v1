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
            sb.append("`").append("wt").append(id).append("_v").append(this.buildSqlString.getVersion())
                    .append("_1s_").append(time).append("`");
            this.targetName = "one_sec";
            this.tableName = sb.toString();
        }else if(caseNum == 1){
            sb.append("`").append("wt").append(id).append("_v").append(this.buildSqlString.getVersion())
                    .append("_any1s_").append(time).append("`");
            this.targetName = "one_sec_any";
            this.tableName = sb.toString();
        }else if(caseNum == 2) {
            sb.append("`").append("wt").append(id).append("_v").append(this.buildSqlString.getVersion())
                    .append("_10mincalc").append("`");
            this.targetName = "ten_min";
            this.tableName = sb.toString();
        }
        else if(caseNum == 3) {
            sb.append("`").append("wt").append(id).append("_v").append(this.buildSqlString.getVersion())
                    .append("_10mincalextra").append("`");
            this.targetName = "ten_min_extra";
            this.tableName = sb.toString();
        }
    }
 
    @Override
    public String onPrepareStatement(String sql) {
        sql = sql.replaceAll(targetName, tableName);
        return sql;
    }
 
}