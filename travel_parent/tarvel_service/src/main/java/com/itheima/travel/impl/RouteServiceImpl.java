package com.itheima.travel.impl;

import com.itheima.travel.dao.RouteDao;
import com.itheima.travel.pojo.Route;
import com.itheima.travel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService{

    @Autowired
    private RouteDao routeDao;


    @Override
    public List<Route> findAll() {
        return routeDao.findAll();
    }

    @Override
    public Route findById(int rid) {
        return routeDao.findById(rid);
    }
}
