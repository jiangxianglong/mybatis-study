package com.jiangxianglong;

import com.jiangxianglong.dao.UserMapper;
import com.jiangxianglong.pojo.User;
import com.jiangxianglong.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: jiangxianglong
 * @Date: 2020/3/21 上午11:38
 * @Content:
 */
public class MyTest {
    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        //方法一:
//        List<User> users = session.selectList("com.jiangxianglong.dao.UserMapper.selectUser");
//        //方法二:
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user: users){
            System.out.println(user.toString());
        }
        session.close();
    }


    @Test
    public void selectUserById() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = mapper.selectUserById(2);
        if (user != null){
            System.out.println(user.toString());
        }
        session.close();
    }


    @Test
    public void userInsert() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = new User();
        user.setId(7);
        user.setName("附近打非手动就发");
        user.setPwd("adfsdfadsfasd");

        mapper.userAdd(user);

        //提交事务
        session.commit();


        session.close();
    }


    @Test
    public void userUpd() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = new User();
        user.setId(3);
        user.setName("你是个");
        user.setPwd("dfasdfasdfasdfasdfa");

        mapper.userUpd(user);

        session.commit();//提交事务
        //查询所有
        this.selectUser();
        session.close();
    }


    @Test
    public void userQueryLike() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        String partnerName = "你是个";
        List<User> users = mapper.selectUserByName(partnerName);

        for (User user : users) {
            System.out.println(user.toString());
        }
        session.close();
    }
}
