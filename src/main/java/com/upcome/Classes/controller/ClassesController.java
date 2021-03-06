package com.upcome.Classes.controller;

import com.upcome.Classes.entity.Classes;
import com.upcome.Classes.service.IClassesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * user: 张文龙
 * desc: 班级模块：C层
 * Time: 2021-03-06 9:25
 */
@Slf4j
@RestController
@RequestMapping("Classes")
public class ClassesController {

    @Autowired
    @Qualifier("ClassesServiceImpl")
    IClassesService service;


    /**
     * 2021-03-06 z.w.l add
     * 1. 班级模块层：查询班级信息方法
     */
    @GetMapping("seleClasses")
    public List<Classes> seleClasses(@RequestBody Classes classes){
        log.info("--------班级模块：查询班级信息方法 seleClasses--------");
        List<Classes> ClassesAll= null;
        try {
            log.info("班级模块层：查询班级信息方法 seleClasses==获取数据=="+classes);
            ClassesAll = service.seleClasses(classes);
            log.info("班级模块：查询班级信息方法 seleClasses==查询数据=="+ClassesAll);
        } catch (Exception e) {
            log.error("班级模块：查询班级信息方法 seleClasses==出现异常==+e");
        }
        return ClassesAll;
    }


}
