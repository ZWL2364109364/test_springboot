package com.upcome.student.controller;

import com.upcome.student.entity.Student;
import com.upcome.student.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * user: 张文龙
 * desc: 学生模块：C层
 * Time: 2021-03-04 10:17
 */

@Slf4j
@RestController
@RequestMapping("Student")
public class StudentController {

    @Autowired
    @Qualifier("StudentServiceImpl")
    IStudentService StuService;

    /**
     * 2021-03-04 z.w.l add
     * 1. 学生模块：查询学生方法
     */
    @GetMapping("selectStud")
    public  List<Student> selectStud(@RequestBody Student stu) {
        log.info("--------学生模块：查询学生方法 selectStud--------");
        log.info("学生模块：查询学生方法 selectStud==携带参数==" + stu);
        List<Student> StuList = new ArrayList<>();
        try {
            StuList = StuService.selectStud(stu);
            log.info("学生模块：查询学生方法 selectStud==查询完成==" + StuList);
        } catch (Exception e) {
            log.error("学生模块：查询学生方法 selectStud==出现异常==" + e);
        }
        return StuList;
    }


}
