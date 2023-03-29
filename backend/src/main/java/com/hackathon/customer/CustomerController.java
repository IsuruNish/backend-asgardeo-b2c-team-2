package com.hackathon.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("addnewcustomer")
    public void adwCustomer(@RequestBody Customer customerData) {

        customerRepository.save(customerData);
    }
}
