package com.itheima.travel.controller;

import com.itheima.travel.pojo.Category;
import com.itheima.travel.pojo.PageResult;
import com.itheima.travel.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/findAll.do")
    public PageResult findAll(){
        List<Category> list =  categoryService.findAll();
        PageResult pr = new PageResult();
        pr.setRows(list);
        return pr;
    }
}
