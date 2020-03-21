package com.jiangxianglong.pojo;

/**
 * @Author: jiangxianglong
 * @Date: 2020/3/21 上午11:34
 * @Content:
 */
public class User {

    private Integer id;  //id
    private String name;   //姓名
    private String pwd;   //密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
