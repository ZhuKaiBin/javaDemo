package com.atguigu.helloworld;

import java.util.Arrays;

public class demo01
{
    public static void main(String[] args) {
        String a="a";
        System.out.println("a = " + a);

       var receive= sstoString("abcdefg");
        System.out.println("receive = " + receive);

        // 创建 Person 对象并设置属性
        Person person = new Person();
        person.Age = 30;
        person.Name = "John Doe";

        demo01 demo01=new demo01();
        Person2 p2=  demo01.new Person2();
        p2.Age=88;
        p2.Name="ppppp2";


    }


    public static String sstoString(String input) {
        return input.substring(0,input.length()-5);
    }

    // 将 Person 类声明为 static，以便在 main 方法中访问它
    public static class Person {
        public int Age;
        public String Name;
    }

    // 非静态内部类
    public class Person2 {
        public int Age;
        public String Name;
    }
}


