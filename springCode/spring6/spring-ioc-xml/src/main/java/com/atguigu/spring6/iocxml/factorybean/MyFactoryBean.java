package com.atguigu.spring6.iocxml.factorybean;

import com.atguigu.spring6.iocxml.user;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User>{
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return user.class;
    }


}
