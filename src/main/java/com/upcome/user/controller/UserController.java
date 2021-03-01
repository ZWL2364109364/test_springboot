package com.upcome.user.controller;


import com.upcome.user.entity.User;
import com.upcome.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * user: 张文龙
 * desc: 用户模块C层
 * Time: 2021-02-10 14:33
 */
@Slf4j
@Controller
@RequestMapping("User")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    IUserService service;


    /**
     *2021-02-19 z.w.l add
     * 0、用户模块C层：测试Springboot访问方法
     */
    @GetMapping("selectUser")
    @ResponseBody
    public String selectUser(){
        System.out.println("进入测试方法...");
        return "hello SpringBoot！！！";
    }


    /**
     * 2021-02-18 z.w.l add
     * 1、查询用户信息方法
     */
    @GetMapping("selectUserAll")
    @ResponseBody
    public List<User> selectUserAll(){
        log.info("--------用户模块：selectUserAll 查询全部用户方法--------");
        List<User> ListUser= new ArrayList<>();
        try {
            ListUser = service.selectUserAll();
            log.info("用户模块：selectUserAll 查询全部用户方法==获取数据=="+ListUser);

        } catch (Exception e) {
            log.error("用户模块：selectUserAll 查询全部用户方法==出现异常=="+e);
        }
        return ListUser;
    }

    
    /**
     * 2021-02-28 z.w.l add
     * 2. 添加用户
     */
    @ResponseBody
    @PostMapping(value = "addUser")
    public String addUser(@RequestBody User user){
        log.info("--------用户模块Controller：添加用户方法 addUser ");

        int res=0;
        if(user!=null){
            log.info("用户模块Controller：查询全部用户方法 selectUserAll==获取数据成功=="+user);
            res = service.addUser(user);
        }else{
            log.info("用户模块Controller：查询全部用户方法 selectUserAll==获取数据失败"+user);
        }

        return res+"";
    }



}












