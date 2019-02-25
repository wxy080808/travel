package com.itheima.travel.impl;

import com.itheima.travel.dao.IUserDao;
import com.itheima.travel.pojo.User;
import com.itheima.travel.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<User> findAll() throws Exception {
        return iUserDao.findAll();
    }

}
