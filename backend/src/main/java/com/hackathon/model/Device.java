package com.hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Device {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(columnDefinition = "TEXT")
    private String type;
    @Column(columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private Integer price;
    @Column(columnDefinition = "TEXT")
    private String brand;
    @Column(columnDefinition = "TEXT")
    private String description;
    @OneToMany(mappedBy = "customer")
    private Set<DevicePurchase> purchases;

    public Device() {
    }

    public Device(String id, String type, String name, Integer price, String brand, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
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

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public Set<DevicePurchase> getPurchases() {
        return purchases;
    }
}
