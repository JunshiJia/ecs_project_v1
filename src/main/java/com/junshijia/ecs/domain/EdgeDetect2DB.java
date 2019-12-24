package com.junshijia.ecs.domain;

import java.util.Date;

public class EdgeDetect2DB {
    private int id;
    private int operand;
    private String enCoding;
    private Date time;

    @Override
    public String toString() {
        return "EdgeDetect2DB{" +
                "id=" + id +
                ", operand=" + operand +
                ", enCoding='" + enCoding + '\'' +
                ", time=" + time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperand() {
        return operand;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }

    public String getEnCoding() {
        return enCoding;
    }

    public void setEnCoding(String enCoding) {
        this.enCoding = enCoding;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
