package com.hackathon.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(path = "servicepurchase")
public class ServicePurchaseController {
    @Autowired
    private ServicePurchaseRepository servicePurchaseRepository;

    @PostMapping("addnewservicepurchase")
    public void addNewServicePurchase(@RequestBody ServicePurchaseRequest servicePurchaseRequest) {
        servicePurchaseRepository.addServicePurchase(servicePurchaseRequest.getCustomerEmail(), servicePurchaseRequest.getServiceId());
    }
}
