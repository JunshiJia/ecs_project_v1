package com.junshijia.ecs.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="faults")
public class Fault2DB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int name;
    private Date startTime;
    private Date clearTime;

    @Override
    public String toString() {
        return "Fault2DB{" +
                "id=" + id +
                ", name=" + name +
                ", startTime=" + startTime +
                ", clearTime=" + clearTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getClearTime() {
        return clearTime;
    }

    public void setClearTime(Date clearTime) {
        this.clearTime = clearTime;
    }
}
