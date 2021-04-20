package com.Ecommerce.Store.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Entity
//@Data
//@Table(name = "STORE_TBL")
@Embeddable
public class Store {
//    @Id
//    @GeneratedValue
    private Integer storeID;
    private String storeName;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
