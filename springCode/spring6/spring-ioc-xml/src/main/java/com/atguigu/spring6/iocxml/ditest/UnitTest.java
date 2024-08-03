package com.atguigu.spring6.iocxml.ditest;


import com.atguigu.spring6.iocxml.di.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UnitTest {
    @Test
    public void Test1() {
//        外部bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        var emp = context.getBean("Emp", Emp.class);
        emp.work();
//        var book = context.getBean(Book.class);
        System.out.println(emp.toString());
    }

    @Test
    public void Test2() {
//        内部Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        var emp = context.getBean("Emp2", Emp.class);
        emp.work();
//        var book = context.getBean(Book.class);
        System.out.println(emp.toString());
    }

    @Test
    public void Test3() {
//        级联赋值
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        var emp = context.getBean("Emp3", Emp.class);
        emp.work();
//        var book = context.getBean(Book.class);
        System.out.println(emp.toString());
    }
}
