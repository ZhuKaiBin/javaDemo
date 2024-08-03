package com.atguigu.eflect;

public class Car {
    public Car() {
    }

    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    private  void run()
    {
        System.out.println("私有方法  run");
    }


    private  String name;

    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private  String color;
}
