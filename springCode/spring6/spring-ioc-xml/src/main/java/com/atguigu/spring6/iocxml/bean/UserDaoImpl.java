package com.atguigu.spring6.iocxml.bean;

public class UserDaoImpl implements  UserDao {

    @Override
    public void run() {
        System.out.println("User实现类重新.....");
    }
}
