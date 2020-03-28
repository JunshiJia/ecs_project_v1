package com.junshijia.ecs.create_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.List;

public class CreateTableRoutine {
    private BuildSqlString buildSqlString;
    private List<String> sqlList;
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.101.242/megaspace?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "123456";

    public CreateTableRoutine() {
        this.buildSqlString = new BuildSqlString();
        this.buildSqlString.setMode(3);
        this.sqlList = this.buildSqlString.getSqlList();
    }

    public void loopCreateTable(){
        Calendar cal = Calendar.getInstance();
        int day = 0;
        int hour = 0;
        while(true){
            day = cal.get(Calendar.DAY_OF_MONTH);
            hour = cal.get(Calendar.HOUR_OF_DAY);
            if(day == 28 && hour == 1){
                this.buildSqlString.setMode(1);
                this.sqlList = this.buildSqlString.getSqlList();
                this.createTable();
            }
            try {
                Thread.sleep(3540000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void createTable(){
        Connection conn = null;
        Statement stmt = null;
        boolean flag = true;
        while(flag) {
            try {
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                //STEP 3: Open a connection
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                //STEP 4: Execute a query
                stmt = conn.createStatement();
                for (String sql : sqlList) {
                    stmt.executeUpdate(sql);
                }
                flag = false;
            } catch (SQLException | ClassNotFoundException se) {
                se.printStackTrace();
                System.out.println("can not create Table, w8 500s...");
                try {
                    Thread.sleep(500000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                //finally block used to close resources
                try {
                    if (stmt != null)
                        conn.close();
                } catch (SQLException se) {
                }// do nothing
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }

    public BuildSqlString getBuildSqlString() {
        return buildSqlString;
    }
}
