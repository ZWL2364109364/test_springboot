package com.upcome.user.mapper;

import com.upcome.user.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * user: 张文龙
 * desc: 用户模块M层 绑定数据库接口
 * Time: 2021-02-19 15:34
 */

@Repository("UserMapper")
public interface UserMapper {

    /**
     * 2021-02-18 z.w.l add
     * 1、用户模块：查询用户信息方法
     */
    List<User> selectUserAll();

    /**
     * 2021-02-28 z.w.l add
     * 2. 用户模块：添加用户
     */
    int addUser(@Param("user") User user);
}
