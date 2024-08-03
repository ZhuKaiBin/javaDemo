package com.atguigu.spring6.iocxml.ditest;

public class Emp {
    private  String ename;
    private  Integer age;

    private  Dept dept;
    public  void work()
    {
        System.out.println(ename+"正在工作.....");
        dept.info();
    }
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", age=" + age +
                ", dept=" + dept.toString() +
                '}';
    }
}
