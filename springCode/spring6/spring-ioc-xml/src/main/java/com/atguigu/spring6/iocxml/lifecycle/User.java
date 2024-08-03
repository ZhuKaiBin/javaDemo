package com.atguigu.spring6.iocxml.lifecycle;

public class User {
    private  String name;


    public User() {
        System.out.println("1.bean对象创建, User的无参数构造");
    }


    public void initMethod()
    {
        System.out.println("4.bean对象初始化initMethod,调用指定的初始化的的方法");
    }

    public  void destoryMethod()
    {
        System.out.println("5. bean对象的销毁destoryMethod(只有对象销毁才会执行)");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2.给bean对象设置属性值setName");
        this.name = name;
    }
}
