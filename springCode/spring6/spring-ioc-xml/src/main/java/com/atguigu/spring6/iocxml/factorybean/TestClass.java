package com.atguigu.spring6.iocxml.factorybean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    @Test
    public void m() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-FactoryBean.xml");
        var obj = context.getBean("MyFactoryBean");

        System.out.println(obj);
    }

}
