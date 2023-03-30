package com.hackathon.service;

import javax.persistence.*;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;
    @Column(columnDefinition = "TEXT")
    private String type;
    @Column(columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private Integer price;

    public Service() {
    }

    public Service(String type, String name, Integer price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
