package com.atguigu.spring6.iocxml.auto;

import com.atguigu.spring6.iocxml.auto.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

    @Test
    public  void Demo()
    {
        ApplicationContext cxt=new ClassPathXmlApplicationContext("bean-auto.xml");
        var userController= cxt.getBean("UserController", UserController.class);
        userController.addUser();
    }

}
