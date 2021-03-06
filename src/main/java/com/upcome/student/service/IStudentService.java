package com.upcome.student.service;

import com.upcome.student.entity.Student;

import java.util.List;

/**
 * user: 张文龙
 * desc: 学生模块：service层接口
 * Time: 2021-03-04 10:29
 */
public interface IStudentService {

    /**
     * 2021-03-04 z.w.l add
     * 1. 学生模块：查询学生方法
     */
    List<Student> selectStud(Student stu);
}
