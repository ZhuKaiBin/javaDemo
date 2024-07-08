package com.atguigu.helloworld;

import com.atguigu.interfaces.IPerson;

public class Man implements IPerson {

    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
