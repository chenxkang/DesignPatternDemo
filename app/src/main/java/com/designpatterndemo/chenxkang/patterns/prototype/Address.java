package com.designpatterndemo.chenxkang.patterns.prototype;

import java.io.Serializable;

/**
 * author: chenxkang
 * time  : 17/4/12
 * desc  : 地址
 */

public class Address implements Serializable {

    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
