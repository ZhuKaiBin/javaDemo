package com.atguigu.helloworld;

import com.atguigu.ccc.dog;

public class MainAnimal {
    public static void main(String[] args) {
      /**
        Animal animal = new Animal("Lion", 5);

        animal.displayInfo();

        // 修改 Animal 对象的属性
        animal.setName("Tiger");
        animal.setAge(3);
        animal.displayInfo();
      */

        dog dog=new dog("dog",12);
        dog.displayInfo();

        // 修改 Animal 对象的属性
        dog.setName("dog");
        dog.setAge(3);
        dog.displayInfo();
    }
}
