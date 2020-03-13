package com.junshijia.mod_2_domain_2_db_test;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="testTable")
public class testTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date time;
    @Column(name="`HMI_IReg[155]`")
    private Float HMI_IReg155;

    @Override
    public String toString() {
        return "testTable{" +
                "id=" + id +
                ", time=" + time +
                ", HMI_IReg155=" + HMI_IReg155 +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Float getHMI_IReg155() {
        return HMI_IReg155;
    }

    public void setHMI_IReg155(Float HMI_IReg155) {
        this.HMI_IReg155 = HMI_IReg155;
    }
}
