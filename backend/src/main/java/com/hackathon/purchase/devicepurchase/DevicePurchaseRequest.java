package com.hackathon.purchase.devicepurchase;

public class DevicePurchaseRequest {

    private String customerEmail;
    private String deviceId;

    public DevicePurchaseRequest() {
    }

    public DevicePurchaseRequest(String customerEmail, String deviceId) {
        this.customerEmail = customerEmail;
        this.deviceId = deviceId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String serviceId) {
        this.deviceId = deviceId;
    }
}
