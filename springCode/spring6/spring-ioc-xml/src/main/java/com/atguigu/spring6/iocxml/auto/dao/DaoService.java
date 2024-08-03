package com.atguigu.spring6.iocxml.auto.dao;

public class DaoService implements IDao{
    @Override
    public void AddUserDao() {
        System.out.println("添加一个UserDao");
    }
}
