package com.hackathon.purchase.devicepurchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(path = "devicepurchase")
public class DevicePurchaseController {
    @Autowired
    private DevicePurchaseRepository devicePurchaseRepository;

//    FIXME: Ideally the parameters should be in the body, but for now, we'll use the path
    @PostMapping("addnewdevicepurchase/{customerEmail}/{deviceId}")
    public void addNewDevicePurchase(@PathVariable String customerEmail, @PathVariable String deviceId) {
        devicePurchaseRepository.addDevicePurchase(
                customerEmail,
                deviceId
        );
    }

//        @PostMapping("addnewdevicepurchase")
//        public void addNewDevicePurchase(@RequestBody DevicePurchaseRequest devicePurchaseRequest) {
//            System.out.println(devicePurchaseRequest.getCustomerEmail());
//            System.out.println(devicePurchaseRequest.getDeviceId());
//        }
}
