package com.atguigu.spring6.iocxml.jadc;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.spring6.iocxml.ditest.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.jupiter.api.Test
    public void TestDemo1() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?serverTimeZone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("atguigu");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }


    @org.junit.jupiter.api.Test
    public void TestDemo2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource soucr = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(soucr.getUrl());
    }

}
