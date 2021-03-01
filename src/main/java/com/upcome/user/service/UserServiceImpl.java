package com.upcome.user.service;

import com.upcome.user.entity.User;
import com.upcome.user.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * user: 张文龙
 * desc: 用户模块：service层接口实现类
 * Time: 2021-02-19 15:52
 */
@Slf4j
@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService{

    @Autowired
    @Qualifier("UserMapper")
    UserMapper mapper;


    /**
     * 2021-02-18 z.w.l add
     * 1、查询用户信息方法
     */
    @Override
    public List<User> selectUserAll() {
        List<User> list=new ArrayList<>();
        try {
            list= mapper.selectUserAll();
        } catch (Exception e) {
            log.error("查询全部用户方法：selectUserAll == 出现异常 == "+e);
        }
        return list;
    }

    /**
     * 2021-02-28 z.w.l add
     * 2. 用户模块service层：添加用户
     */
    @Override
    public int addUser(User user) {
        int res=0;
        try {
            res = mapper.addUser(user);
        } catch (Exception e) {
            log.error("用户模块service层：添加用户方法 addUser ==出现异常=="+e);
            e.printStackTrace();
        }

        return res;
    }

    /**
     *2021-02-25 z.w.l add
     * 3. 修改用户信息方法
     */
    @Override
    public int updateUser(User user) {
        int res=0;
        try {
            res=mapper.updateUser(user);
        } catch (Exception e) {
            log.error("用户模块service层：updateUser 修改用户信息方法==出现异常=="+e);
        }
        return res;
    }

    /**
     *2021-02-27 z.w.l add
     * 4. 删除用户方法
     */
    @Override
    public int deleteUser(User user) {
        int res=0;
        try {
            res=mapper.deleteUser(user);
        } catch (Exception e) {
            log.error("用户模块service：删除用户方法deleteUser==出现异常=="+e);
        }
        return res;
    }
}
