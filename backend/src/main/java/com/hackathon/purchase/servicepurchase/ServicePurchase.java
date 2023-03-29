package com.hackathon.purchase.servicepurchase;

import com.hackathon.customer.Customer;
import com.hackathon.service.Service;

import javax.persistence.*;

@Entity
@IdClass(ServicePurchaseID.class)
public class ServicePurchase {
    @Id
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @Id
    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

    public ServicePurchase() {
    }

    public ServicePurchase(Customer customer, Service service) {
        this.customer = customer;
        this.service = service;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Service getService() {
        return service;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
