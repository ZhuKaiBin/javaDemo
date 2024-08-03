package com.atguigu.spring6.iocxml.auto.controller;

import com.atguigu.spring6.iocxml.auto.service.IUserService;
import com.atguigu.spring6.iocxml.auto.service.UserServiceImpl;

public class UserController {


    private IUserService userService;
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }




    public void addUser()
    {
        userService.addUserService();
        System.out.println("controller 添加一个User");
    }
}
