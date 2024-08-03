package com.atguigu.spring6.iocxml.ditest;

import java.util.List;

public class Dept {
    private String dname;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    private List<Emp> empList;//一个部门有很多员工
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
        for (var emp :empList)
        {
            System.out.println(emp.getEname());
        }
    }
}
