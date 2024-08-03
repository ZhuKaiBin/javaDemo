package com.atguigu.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {

    private String sname;
    private String sid;

    //一个学生有多个老师
    public Map<String, Teacher> teacherMap;

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public List<Lesson> lessonList;
    public void Run() {
        System.out.println("学生编号：" + sid + "学生姓名：" + sname);
        System.out.println(teacherMap);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println(lessonList);
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setTeachMap(Map teachMap) {
        this.teacherMap = teachMap;
    }
}
