package com.hackathon.purchase.devicepurchase;

import com.hackathon.purchase.servicepurchase.ServicePurchaseRepository;
import com.hackathon.purchase.servicepurchase.ServicePurchaseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping(path = "devicepurchase")
public class DevicePurchaseController {
    @Autowired
    private DevicePurchaseRepository devicePurchaseRepository;

    @PostMapping("addnewdevicepurchase/{customerEmail}/{deviceId}")
    public void addNewDevicePurchase(@PathVariable String customerEmail, @PathVariable String deviceId) {
        devicePurchaseRepository.addDevicePurchase(
                customerEmail,
                deviceId
        );
    }
}
