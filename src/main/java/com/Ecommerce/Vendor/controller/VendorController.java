package com.Ecommerce.Vendor.controller;

import com.Ecommerce.Store.entity.Store;
import com.Ecommerce.Vendor.entity.Vendor;
import com.Ecommerce.Vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendorController {
    @Autowired
    VendorService vendorService;

    @PostMapping("/addVendor")
    public Vendor addVendor(Vendor vendor){
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
