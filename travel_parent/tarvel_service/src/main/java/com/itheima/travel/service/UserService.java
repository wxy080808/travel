package com.itheima.travel.service;

import com.itheima.travel.pojo.User;

public interface UserService {

    /**
     * 登陆
     * @param user
     * @return
     */
    User login(User user);
}
