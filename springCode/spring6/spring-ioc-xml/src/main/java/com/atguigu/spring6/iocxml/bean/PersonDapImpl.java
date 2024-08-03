package com.atguigu.spring6.iocxml.bean;

public class PersonDapImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("Person实现了接口........");
    }
}
