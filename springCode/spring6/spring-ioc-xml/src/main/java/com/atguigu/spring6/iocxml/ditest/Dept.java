package com.atguigu.spring6.iocxml.ditest;

public class Dept {
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }

    public  void info()
    {
        System.out.println("部门名称"+dname);
    }
}
