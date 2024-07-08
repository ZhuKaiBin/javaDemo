package com.atguigu.helloworld;

import com.atguigu.interfaces.IPerson;


public class WoMan  implements IPerson {
    private String name;
    private int age;

    public WoMan(String name, int age) {
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
