package com.itheima.travel.dao;

import com.itheima.travel.pojo.Category;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from tab_category")
    public List<Category> findAll();
}
