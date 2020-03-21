package com.jiangxianglong.dao;

import com.jiangxianglong.pojo.User;

import java.util.List;

/**
 * @Author: jiangxianglong
 * @Date: 2020/3/21 上午11:35
 * @Content:
 */
public interface UserMapper {

    List<User> selectUser();

    User selectUserById(Integer id);

    int userAdd(User user);

    int userUpd(User user);

    List<User> selectUserByName(String partnerName);
}
