package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {

    @GetMapping("/{vendorId}") // Add '/' to correctly map the path
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId)
    {
        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
    }
}
