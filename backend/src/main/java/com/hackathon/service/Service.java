package com.hackathon.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(columnDefinition = "TEXT")
    private String type;
    @Column(columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private Integer price;

    public Service() {
    }

    public Service(String id, String type, String name, Integer price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getId() {
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
