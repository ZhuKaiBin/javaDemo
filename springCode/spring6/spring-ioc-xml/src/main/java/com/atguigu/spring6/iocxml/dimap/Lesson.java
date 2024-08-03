package com.atguigu.spring6.iocxml.dimap;

public class Lesson {
    private  String lName;

    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lName='" + lName + '\'' +
                '}';
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
