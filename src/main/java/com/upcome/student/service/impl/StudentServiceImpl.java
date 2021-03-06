package com.upcome.student.service.impl;

import com.upcome.student.entity.Student;
import com.upcome.student.mapper.StudentMapper;
import com.upcome.student.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * user: 张文龙
 * desc: 学生模块：service接口实现类
 * Time: 2021-03-04 10:30
 */
@Slf4j
@Service("StudentServiceImpl")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    @Qualifier("StudentMapper")
    StudentMapper mapper;


    /**
     * 2021-03-04 z.w.l add
     * 1. 学生模块service层：查询学生方法
     */
    @Override
    public List<Student> selectStud(Student stu) {

        List<Student> stuList = null;
        try {
            stuList=mapper.selectStud(stu);
        } catch (Exception e) {
            log.error("学生模块service层：查询学生方法 selectStud ==出现异常=="+e);
            e.printStackTrace();
        }
        return stuList;
    }
}
