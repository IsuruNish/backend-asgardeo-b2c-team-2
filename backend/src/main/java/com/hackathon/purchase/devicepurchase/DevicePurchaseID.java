package com.hackathon.purchase.devicepurchase;

import com.hackathon.customer.Customer;
import com.hackathon.device.Device;

import java.io.Serializable;

public class DevicePurchaseID implements Serializable {
    private Customer customer;
    private Device device;

    public DevicePurchaseID() {
    }

    public DevicePurchaseID(Customer customer, Device device) {
        this.customer = customer;
        this.device = device;
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
