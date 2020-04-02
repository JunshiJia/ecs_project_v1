package com.junshijia.ecs.create_table;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class BuildSqlString {
    private String version;
    private int turbineNum;
    private List<String> sqlList;
    private String yearString;
    private String monthString;
    private String dayString;
    //判断是否建表
    private boolean yearSwitch;
    private boolean monthSwitch;
    private boolean versionSwitch;

    public BuildSqlString() {
        Properties prop = new Properties();
        try{
            //读取属性文件a.properties
            InputStream in = new BufferedInputStream(new FileInputStream("src/main/resources/version.properties"));
            prop.load(in);     ///加载属性列表
            Iterator<String> it=prop.stringPropertyNames().iterator();
            while(it.hasNext()){
                String key=it.next();
                if(key.equals("version")){
                    this.version = prop.getProperty(key);
                }else if(key.equals("turbineNumber")){
                    this.turbineNum = Integer.parseInt(prop.getProperty(key));
                }
            }
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setTime(){
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        if(month<10){
            this.monthString = "0"+month;
        }else{
            this.monthString = Integer.toString(month);
        }
        this.yearString = Integer.toString(year);
        this.dayString = Integer.toString(day);
    }

    public void setMode(int i){
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 2;
        int year = cal.get(Calendar.YEAR);
        this.yearString = Integer.toString(year);
        if(month<10){
            this.monthString = "0" + month;
        }else if(month == 13){
            this.monthString = "01";
            this.yearString = Integer.toString(year+1);
        }else {
            this.monthString = Integer.toString(month);
        }
        //change month or year
        if(i == 1){
            this.yearSwitch = false;
            this.monthSwitch = true;
            this.versionSwitch = false;
            if(month == 13) {
                this.yearSwitch = true;
            }
            //change version
        }else if(i == 2){
            this.setTime();
            this.yearSwitch = false;
            this.monthSwitch = false;
            this.versionSwitch = true;
            //test mode
        }else if (i == 3){
            this.setTime();
            this.yearSwitch = true;
            this.monthSwitch = true;
            this.versionSwitch = true;
        }
        this.buildStringList();
    }


    public List<String> getSqlList() {
        return sqlList;
    }

    public String getVersion() {
        return version;
    }

    public void buildStringList(){
        this.sqlList = new LinkedList<>();
        //条件：换版本或者换月份
        if(this.monthSwitch || this.versionSwitch) {
            //1秒数据
            for (int i = 1; i <= this.turbineNum; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("wt").append(i).append("_v").append(version).append("_1s_")
                        .append(yearString).append(monthString);
                String oneSecSql = "CREATE TABLE `" + sb.toString() + "` (\n" +
                        StaticStrings.oneSecString;
                this.sqlList.add(oneSecSql);
            }
            //any1秒数据
            for (int i = 1; i <= this.turbineNum; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("wt").append(i).append("_v").append(version).append("_any1s_")
                        .append(yearString).append(monthString);
                String anyOneSecSql = "CREATE TABLE `" + sb.toString() + "` (\n" +
                        StaticStrings.anyOneSecString;
                this.sqlList.add(anyOneSecSql);
            }
        }
        //条件：换版本
        if (this.versionSwitch) {
            //10分钟计算
            for (int i = 1; i <= this.turbineNum; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("wt").append(i).append("_v").append(version).append("_10mincalc");
                String tenMinSql = "CREATE TABLE `" + sb.toString() + "` (\n" +
                        StaticStrings.tenMinCalString;
                this.sqlList.add(tenMinSql);
            }
            //fault
            for (int i = 1; i <= this.turbineNum; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("wt").append(i).append("_v").append(version).append("_faults");
                String faultSql = "CREATE TABLE `" + sb.toString() + "` (\n" +
                        StaticStrings.faultString;
                this.sqlList.add(faultSql);
            }
        }
        //条件：换年份
        if(this.yearSwitch) {
            //10分钟额外计算
            for (int i = 1; i <= this.turbineNum; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("wt").append(i).append("_MutiFansIndex_10min_").append(yearString);
                String extraTenSql = "CREATE TABLE `" + sb.toString() + "` (\n" +
                     StaticStrings.extraTenMinCalString;
                this.sqlList.add(extraTenSql);
            }
        }
    }

    @Override
    public String toString() {
        return "BuildSqlString{" +
                "version='" + version + '\'' +
                ", turbineNum=" + turbineNum +
                '}';
    }

    public void setYearString(String yearString) {
        this.yearString = yearString;
    }

    public void setMonthString(String monthString) {
        this.monthString = monthString;
    }

    public void setDayString(String dayString) {
        this.dayString = dayString;
    }

    public String getYearString() {
        return yearString;
    }

    public String getMonthString() {
        return monthString;
    }

    public String getDayString() {
        return dayString;
    }

    public void setYearSwitch(boolean yearSwitch) {
        this.yearSwitch = yearSwitch;
    }

    public boolean isYearSwitch() {
        return yearSwitch;
    }

    public boolean isMonthSwitch() {
        return monthSwitch;
    }

    public void setMonthSwitch(boolean monthSwitch) {
        this.monthSwitch = monthSwitch;
    }

    public boolean isVersionSwitch() {
        return versionSwitch;
    }

    public void setVersionSwitch(boolean versionSwitch) {
        this.versionSwitch = versionSwitch;
    }
}
