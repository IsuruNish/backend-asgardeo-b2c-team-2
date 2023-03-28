package com.hackathon.purchase;

import com.hackathon.customer.Customer;
import com.hackathon.service.Service;

import java.io.Serializable;

public class ServicePurchaseID implements Serializable {
    private Customer customer;
    private Service service;

    public ServicePurchaseID() {
    }

    public ServicePurchaseID(Customer customer, Service service) {
        this.customer = customer;
        this.service = service;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
