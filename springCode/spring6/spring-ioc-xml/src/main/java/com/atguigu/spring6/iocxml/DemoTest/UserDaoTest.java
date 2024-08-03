package com.atguigu.spring6.iocxml.DemoTest;

import com.atguigu.spring6.iocxml.bean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        //1.
//        var userDao=context.getBean(UserDao.class);
//        userDao.run();


        var person =(UserDao)context.getBean("PersonDapImpl") ;
        person.run();
        System.out.println("获取到了person的实例对象"+ person);

        var user =(UserDao)context.getBean("UserDaoImpl") ;
        user.run();
        System.out.println("获取到了user的实例对象"+ user);

    }
}
