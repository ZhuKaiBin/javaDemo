package com.atguigu.eflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class TestClass {

    //获取对象
    @Test
    public void Demo() throws Exception {

        //方式1
        Class<Car> carClass = Car.class;

        //方式2
        Class<? extends Car> aClass = new Car().getClass();
        Car newInstance1 = aClass.newInstance();
        newInstance1.getName();
        System.out.println(newInstance1);

        //方式3
        Class<?> aClass1 = Class.forName("com.atguigu.eflect.Car");
        Car newInstance = (Car) aClass1.getDeclaredConstructor().newInstance();
        System.out.println(newInstance);

    }

    //获取构造方法
    @Test
    public void Demo2() throws Exception {
        Class<Car> carClass = Car.class;

        //getConstructors：只能获取Public的构造函数
        //getDeclaredConstructor()： 可以获取所有的构造方法
        var constructors = carClass.getConstructors();
        for (var c : constructors) {
            System.out.println("方法名称" + c.getName() + ",方法参数个数：" + c.getParameterCount());
        }

        Constructor<Car> declaredConstructor = carClass.getDeclaredConstructor(String.class, int.class, String.class);
        Car car = declaredConstructor.newInstance("大狗", 15, "黑色");
        System.out.println(car.getName());


        Constructor<Car> declaredConstructor2 = carClass.getDeclaredConstructor(String.class, int.class, String.class);
        //如果有参构造是一个私有的，那么setAccessible 意思就是可访问的
        declaredConstructor2.setAccessible(true);
        Car car2 = declaredConstructor2.newInstance("大狗", 15, "黑色");
        System.out.println(car2.getName());


    }

    //获取属性
    @Test
    public void Demo3() throws Exception {

        Class<Car> carClass = Car.class;
        Car newInstance = carClass.getDeclaredConstructor().newInstance();


        Field[] declaredFields = carClass.getDeclaredFields();
        for (var filed:declaredFields) {
            if (filed.getName().equals("name"))
            {
                filed.setAccessible(true);
                filed.set(newInstance,"小米Su7");
            }
        }

        System.out.println(newInstance.getName());

    }

    //获取方法
    @Test
    public void Demo4() throws Exception {
        Class<Car> carClass = Car.class;
        Car newInstance = carClass.getDeclaredConstructor().newInstance();

        Method[] declaredMethods = carClass.getDeclaredMethods();
        for (var method:declaredMethods) {
            method.setAccessible(true);
            System.out.println(method);

            if (method.getName().equals("setName"))
            {
                method.invoke(newInstance,"小米汽车Urtal");
            }
        }

        System.out.println(newInstance.getName());
    }


}
