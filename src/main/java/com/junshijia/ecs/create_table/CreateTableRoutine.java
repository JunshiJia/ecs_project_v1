package com.junshijia.ecs.create_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CreateTableRoutine {
    private BuildSqlString buildSqlString;
    private List<String> sqlList;
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/new_ecs?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "123456";

    public CreateTableRoutine() {
        this.buildSqlString = new BuildSqlString();
        this.buildSqlString.buildStringList();
        this.sqlList = this.buildSqlString.getSqlList();
        this.createTable();
    }

    public void createTable(){
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //STEP 4: Execute a query
            stmt = conn.createStatement();
            for(String sql : sqlList) {
                stmt.executeUpdate(sql);
            }
        }catch(SQLException | ClassNotFoundException se){
            se.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
    }
}
