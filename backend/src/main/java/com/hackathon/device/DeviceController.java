package com.hackathon.device;

import org.hibernate.internal.util.xml.FilteringXMLEventReader;
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

//    FIXME: This for admins only, so commenting out for now
//    @PostMapping("addnewdevice")
//    public void addNewDevice(@RequestBody Device device) {
//        deviceRepository.save(device);
//    }

}
