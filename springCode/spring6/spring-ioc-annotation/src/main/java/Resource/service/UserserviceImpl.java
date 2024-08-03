package Resource.service;

import Resource.dao.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements Userservice {

    @Autowired
    private userDao userdao;

    @Override
    public void Add() {
        System.out.println("UserserviceImpl......");

        userdao.addDao();
    }
}
