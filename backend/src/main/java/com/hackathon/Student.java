package com.hackathon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer id;
    public String name;
    public int age;
    public String city;

}
