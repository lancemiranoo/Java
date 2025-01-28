package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    @GetMapping("/{vendorID}") // Add '/' to correctly map the path
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorID) {
        return cloudVendor;
        //return new CloudVendor("V1", "V1VendorName", "V1 Address", "999-999-999");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";

    }

    @PutMapping("/{vendorID}")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";

    }

    @DeleteMapping("/{vendorID}")
    public String deleteCloudVendorDetails(@PathVariable String vendorID) {
        this.cloudVendor = null;
        return "Cloud Vendor deleted Successfully";

    }

}