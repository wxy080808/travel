package com.itheima.travel.dao;

import com.itheima.travel.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    @Select("select * from tab_user where username = #{username}")
    public User findByUsername(String username);


    /**
     * 根据用户名密码查询用户
     * @param username
     * @param password
     * @return
     */
    @Select("select * from tab_user where username = #{username} and password = #{password}")
    public User findByUsernameAndPassword(String username, String password);

}
