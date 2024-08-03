package com.atguigu.b;

import abstractFiles.Admin;

public class Pig extends Admin {
    private String address;
    private String phone;

    public Pig(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPhone() {
        return phone;
    }
}
