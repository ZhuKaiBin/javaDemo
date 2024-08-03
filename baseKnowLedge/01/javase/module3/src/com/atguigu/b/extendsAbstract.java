package com.atguigu.b;

public class extendsAbstract {
    public static void main(String[] args) {

        Pig pig=new Pig("上海市闵行区","10086");
        pig.getAddress();
        pig.getPhone();


        Cat  cat=new  Cat("上海市松江区","10010");
        cat.getAddress();
        cat.getPhone();

    }
}
