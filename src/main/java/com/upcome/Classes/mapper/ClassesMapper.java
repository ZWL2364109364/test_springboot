package com.upcome.Classes.mapper;

import com.upcome.Classes.entity.Classes;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * user: 张文龙
 * desc: 班级模块：Dao层
 * Time: 2021-03-06 16:23
 */
@Repository("ClassesMapper")
public interface ClassesMapper {

    /**
     * 2021-03-06 z.w.l add
     * 1. 班级模块层：查询班级信息方法
     * @param classes
     */
    List<Classes> seleClasses(@Param("classes") Classes classes);

}
