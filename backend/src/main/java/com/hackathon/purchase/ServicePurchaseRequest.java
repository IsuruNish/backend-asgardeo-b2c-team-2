package com.hackathon.purchase;

public class ServicePurchaseRequest {
    private String customerEmail;
    private String serviceId;

    public ServicePurchaseRequest() {
    }

    public ServicePurchaseRequest(String customerEmail, String serviceId) {
        this.customerEmail = customerEmail;
        this.serviceId = serviceId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
