package com.itheima.travel.service;

import com.itheima.travel.pojo.Route;

import java.util.List;

public interface RouteService {

    /**
     * 根据所有
     * @return
     */
    public List<Route> findAll();

    /**
     * 根据id查询
     */
    public Route findById(int rid);
}
