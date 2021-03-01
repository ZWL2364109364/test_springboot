package com.upcome.user.service;

import com.upcome.user.entity.User;

import java.util.List;

/**
 * user: 张文龙
 * desc: 用户模块：service层 接口
 * Time: 2021-02-19 15:51
 */
public interface IUserService {

    /**
     * 2021-02-18 z.w.l add
     * 1、查询用户信息方法
     */
    List<User> selectUserAll();

    /**
     * 2021-02-28 z.w.l add
     * 2. 添加用户
     */
    int addUser(User user);
}
