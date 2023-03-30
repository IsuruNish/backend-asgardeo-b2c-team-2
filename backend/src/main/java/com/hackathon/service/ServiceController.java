package com.hackathon.service;

import com.hackathon.device.Device;
import com.hackathon.device.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "service")
public class ServiceController {
    @Autowired
    private ServiceRepository serviceRepository;

    @GetMapping("getall")
    public List<Service> getAllServices() {
        List<Service> services = serviceRepository.findAll();
        return services;
    }

//    FIXME: This for admins only, so commenting out for now
//    @PostMapping("addnewservice")
//    public void addNewService(@RequestBody Service service) {
//        serviceRepository.save(service);
//    }

}
