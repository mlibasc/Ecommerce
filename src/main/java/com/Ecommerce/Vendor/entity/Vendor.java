package com.Ecommerce.Vendor.entity;

import com.Ecommerce.Store.entity.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "VENDOR_TBL")
public class Vendor {
    @Id
    @GeneratedValue
    private Integer id;
    private String vendorName;
    @Embedded
    private List<Store> stores;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}
