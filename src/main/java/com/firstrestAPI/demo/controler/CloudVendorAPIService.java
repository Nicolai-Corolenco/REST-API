package com.firstrestAPI.demo.controler;

import com.firstrestAPI.demo.modern.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
     public CloudVendor getCloudVendorDetails(String vendorId){
//        return new CloudVendor("C1", "Vendor 1",
//        "Vendor address" , "number: xxxxxxxxx ");
        return cloudVendor;
     }
     @PostMapping
     public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created successfully";
     }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated successfully";
    }
    @DeleteMapping
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor deleted successfully";
    }

}
