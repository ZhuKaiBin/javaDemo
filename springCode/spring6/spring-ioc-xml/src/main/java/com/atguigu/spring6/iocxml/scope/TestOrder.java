package com.atguigu.spring6.iocxml.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrder {

    @Test
    public  void Test1()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-scope.xml");
        var order=  context.getBean("orders",Order.class);

        System.out.println(order);

        var order2=  context.getBean("orders",Order.class);
        System.out.println(order2);
    }
}
