package com.hackathon.device;

import com.hackathon.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "device")
public class DeviceController {
        @Autowired
        private DeviceRepository deviceRepository;

    @GetMapping("getall")
    public List<Device> getAllDevices() {
        List<Device> devices = deviceRepository.findAll();
        return devices;
    }

}
