package com.Ecommerce.Vendor.controller;

import com.Ecommerce.Store.entity.Store;
import com.Ecommerce.Vendor.entity.Vendor;
import com.Ecommerce.Vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VendorController {
    @Autowired
    VendorService vendorService;

    @PostMapping("/addVendor")
    public Vendor addVendor(@RequestBody Vendor vendor){
        return vendorService.addVendor(vendor);
    }
//
//    @PostMapping
//    public Store addStoreToVendor(Store store){
//        return vendorService.addStoreToVendor(store);
//    }

    @GetMapping("/getAllVendors")
    public List<Vendor> getAllVendors(){
        return vendorService.getAllVendors();
    }
}
