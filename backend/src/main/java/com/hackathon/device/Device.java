package com.hackathon.device;

import com.hackathon.purchase.devicepurchase.DevicePurchase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Set;

@Entity
public class Device {
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
    @Column(columnDefinition = "TEXT")
    private String brand;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(columnDefinition = "TEXT")
    private String imagePath;
    @OneToMany(mappedBy = "customer")
    private Set<DevicePurchase> purchases;

    public Device() {
    }

    public Device(Integer id, String type, String name, Integer price, String brand, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
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

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public Set<DevicePurchase> getPurchases() {
        return purchases;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
