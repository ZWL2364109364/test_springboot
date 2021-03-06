package com.upcome.Classes.service;

import com.upcome.Classes.entity.Classes;

import java.util.List;

/**
 * user: 张文龙
 * desc: 班级模块：service层接口
 * Time: 2021-03-06 16:20
 */
public interface IClassesService {


    /**
     * 2021-03-06 z.w.l add
     * 1. 班级模块：查询班级信息方法
     */
    List<Classes> seleClasses(Classes classes);
}
