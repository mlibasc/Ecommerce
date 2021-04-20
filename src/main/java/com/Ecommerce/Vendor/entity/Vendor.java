package com.Ecommerce.Vendor.entity;

import com.Ecommerce.Store.entity.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "VENDOR_TBL")
public class Vendor {
    @Id
    @GeneratedValue
    private Integer vendorID;
    private String vendorName;

    @Embedded
    private Store store;
//    private List<Store> stores;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

//    public Store getStores(){ return store;}
//
//    public void setStores(Store stores){
//        this.store = stores;
//    }
}
