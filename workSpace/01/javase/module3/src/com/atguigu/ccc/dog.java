package com.atguigu.ccc;

public class dog {
    private String name;
    private int age;

    public dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // 获取名称的方法
    public String getName() {
        return name;
    }

    // 设置名称的方法
    public void setName(String name) {
        this.name = name;
    }

    // 获取年龄的方法
    public int getAge() {
        return age;
    }

    // 设置年龄的方法
    public void setAge(int age) {
        this.age = age;
    }


    // 显示动物信息的方法
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}