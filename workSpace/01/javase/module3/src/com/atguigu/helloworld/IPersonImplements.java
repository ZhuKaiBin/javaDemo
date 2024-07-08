package com.atguigu.helloworld;

public class IPersonImplements {
    public static void main(String[] args) {
        Man man=new Man("龙龙",18);
        var manAge= man.getAge();
        var manName=man.getName();


        WoMan woman=new WoMan("凤凤",17);
        var womanAge=woman.getAge();
        var womanGetName=woman.getName();
    }
}
