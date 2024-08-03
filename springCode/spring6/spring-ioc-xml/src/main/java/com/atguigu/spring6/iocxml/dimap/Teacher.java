package com.atguigu.spring6.iocxml.dimap;

public class Teacher {
    private  String teacherName;
    private  String teacherId;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }

    public  void Run()
    {
        System.out.println();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
