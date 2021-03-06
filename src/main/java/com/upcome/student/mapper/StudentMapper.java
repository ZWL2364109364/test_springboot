package com.upcome.student.mapper;

import com.upcome.student.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * user: 张文龙
 * desc: 学生模块：Dao层
 * Time: 2021-03-04 10:28
 */

@Repository("StudentMapper")
public interface StudentMapper {

    /**
     * 2021-03-04 z.w.l add
     * 1. 学生模块：查询学生方法
     */
    List<Student> selectStud(@Param("stu") Student stu);

}
