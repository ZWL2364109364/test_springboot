package com.upcome.student.entity;

import com.upcome.Classes.entity.Classes;

/**
 * user: 张文龙
 * desc: 学生模块：实体类
 * Time: 2021-03-04 10:28
 */
public class Student {

    private String sid;
    private String sname;
    private Classes classes;

    public String getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", classes=" + classes +
                '}';
    }
}

