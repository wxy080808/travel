package com.itheima.travel.service;

import com.itheima.travel.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {

    List<User> findAll() throws Exception;
}
