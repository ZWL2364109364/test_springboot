package com.upcome.Classes.entity;

import com.upcome.student.entity.Student;

import java.util.List;

/**
 * user: 张文龙
 * desc: 班级模块：实体类
 * Time: 2021-03-06 15:57
 */
public class Classes {

    private String cid;
    private String cname;
    private List<Student> StuList;

    public String getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStuList() {
        return StuList;
    }

    public void setStuList(List<Student> stuList) {
        StuList = stuList;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", StuList=" + StuList +
                '}';
    }
}
