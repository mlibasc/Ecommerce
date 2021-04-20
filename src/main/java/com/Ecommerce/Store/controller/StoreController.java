//package com.Ecommerce.Store.controller;
//
//import com.Ecommerce.Store.entity.Store;
//import com.Ecommerce.Store.service.StoreService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class StoreController {
//
//    @Autowired
//    private StoreService storeService;
//
//    @PostMapping("/addStore")
//    public Store addStore(@RequestBody Store store){
//        return storeService.saveStore(store);
//    }
//
//    @GetMapping("/getAllStores")
//    public List<Store> getAllStores(){
//        return storeService.getAllStores();
//    }
//}
