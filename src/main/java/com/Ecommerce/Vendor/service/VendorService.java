package com.Ecommerce.Vendor.service;

import com.Ecommerce.Vendor.entity.Vendor;
import com.Ecommerce.Vendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    @Autowired
    VendorRepository vendorRepo;

    public Vendor addVendor(Vendor vendor){
        return vendorRepo.save(vendor);
    }
//
//    public Store addStoreToVendor(Store store){
//        // add store to vendor
//
//    }

    public List<Vendor> getAllVendors(){
        return vendorRepo.findAll();
    }
}
