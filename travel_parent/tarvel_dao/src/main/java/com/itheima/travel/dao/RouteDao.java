package com.itheima.travel.dao;

import com.itheima.travel.pojo.Route;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RouteDao {

    /**
     * 根据id查询
     * @return
     */
    @Select("select * from tab_route ")
    public List<Route> findAll();


    /**
     * 根据id查询
     * @param rid
     * @return
     */
    @Select("select * from tab_route where rid=#{rid}")
    public Route findById(int rid);
}
