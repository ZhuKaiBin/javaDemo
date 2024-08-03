package com.atguigu.spring6.iocxml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        //这个其实就类似C# 中的反射  ，按照类，dll，来获取对象

        //1.根据id来获取bean
        user user=(user)context.getBean("iocUser") ;

        System.out.println("获取到了user的实例对象"+user);

        //2.根据类型来获取bean
        var user2=context.getBean(user.class);

        //3. 根据id和类型
        var user3=context.getBean("iocUser",user.getClass());









    }
}
