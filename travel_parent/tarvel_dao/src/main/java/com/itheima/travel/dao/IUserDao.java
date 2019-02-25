package com.itheima.travel.dao;

import com.itheima.travel.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    @Select("select * from tab_user")
    List<User> findAll() throws Exception;
}
