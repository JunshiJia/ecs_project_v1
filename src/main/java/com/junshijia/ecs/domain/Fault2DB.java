package com.junshijia.ecs.domain;

import javax.persistence.*;

@Entity
@Table(name="faults")
public class Fault2DB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
