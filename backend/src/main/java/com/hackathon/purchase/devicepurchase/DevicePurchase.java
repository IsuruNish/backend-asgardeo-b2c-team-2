package com.hackathon.purchase.devicepurchase;

import com.hackathon.customer.Customer;
import com.hackathon.device.Device;

import javax.persistence.*;

@Entity
@IdClass(DevicePurchaseID.class)
public class DevicePurchase {
    @Id
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @Id
    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;

    public DevicePurchase() {
    }

    public DevicePurchase(Customer customer, Device device) {
        this.customer = customer;
        this.device = device;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Device getDevice() {
        return device;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
