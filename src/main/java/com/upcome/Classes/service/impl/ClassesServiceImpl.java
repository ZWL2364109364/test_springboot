package com.upcome.Classes.service.impl;

import com.upcome.Classes.entity.Classes;
import com.upcome.Classes.mapper.ClassesMapper;
import com.upcome.Classes.service.IClassesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * user: 张文龙
 * desc: 班级模块：service层接口实现类
 * Time: 2021-03-06 16:21
 */

@Slf4j
@Service("ClassesServiceImpl")
public class ClassesServiceImpl implements IClassesService {

    @Autowired
    @Qualifier("ClassesMapper")
    ClassesMapper mapper;


    /**
     * 2021-03-06 z.w.l add
     * 1. 班级模块：查询班级信息方法
     */
    @Override
    public List<Classes> seleClasses(Classes classes) {
        List<Classes> classesAll=new ArrayList<>();
        try {
           classesAll =mapper.seleClasses(classes);
        } catch (Exception e) {
            log.error("班级模块:service层 seleClasses方法 ==出现异常=="+e);
        }
        return classesAll;
    }
}
