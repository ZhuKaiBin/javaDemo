package com.atguigu.spring6.iocxml.di;

import com.atguigu.spring6.iocxml.di.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDiBook {
    @Test
    public void SetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        var book = context.getBean("book", Book.class);
//        var book = context.getBean(Book.class);
        book.toString();


    }

    @Test
    public void ConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        var book = context.getBean("bookconstructor", Book.class);
//        var book = context.getBean(Book.class);
        System.out.println(book.toString());
    }
}
