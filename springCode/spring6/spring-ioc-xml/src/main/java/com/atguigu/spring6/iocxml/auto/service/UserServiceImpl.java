package com.atguigu.spring6.iocxml.auto.service;

import com.atguigu.spring6.iocxml.auto.dao.IDao;

public class UserServiceImpl implements  IUserService{


    private IDao _iDao;

    public void setiDao(IDao iDao) {
        this._iDao = iDao;
    }

    @Override
    public void addUserService() {
        _iDao.AddUserDao();
        System.out.println("添加一个 UserService ");
    }
}
