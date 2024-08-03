package com.atguigu.spring6.iocxml.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    @Test
    public  void Demo1()
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-lifycycle.xml");
        var obj= context.getBean("user", User.class);

        System.out.println("6. bean对象创建完成了,可以使用了");
        System.out.println(obj);

        context.close();//对象销毁
    }

    @Test
    public  void Demo2()
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-lifycycle.xml");
        var obj= context.getBean("beanPost", MyBeanPost.class);

        System.out.println("6. bean对象创建完成了,可以使用了");
        System.out.println(obj);

        context.close();//对象销毁
    }
}
