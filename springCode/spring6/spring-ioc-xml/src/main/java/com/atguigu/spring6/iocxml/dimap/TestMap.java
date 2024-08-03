package com.atguigu.spring6.iocxml.dimap;

import com.atguigu.spring6.iocxml.ditest.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

    @Test
    public void Test()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        var student = context.getBean("student", Student.class);
        student.Run();

        System.out.println(student.toString());
    }

    @Test
    public void Test2()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        var student = context.getBean("Student", Student.class);
        student.Run();

        System.out.println(student.toString());
    }

}
