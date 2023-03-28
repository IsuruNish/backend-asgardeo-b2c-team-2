package com.hackathon.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @Column(name = "email", nullable = false, updatable = false)
    private String email;
    @Column(columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private Integer points;
    @Transient
    private String tier;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Integer getPoints() {
        return points;
    }

    public String getTier() {
        if (points >= 500)
            return "Platinum";
        else if (points >= 300)
            return "Gold";
        else if (points >= 150)
            return "Silver";
        else
            return "No_Tier";
    }
}
