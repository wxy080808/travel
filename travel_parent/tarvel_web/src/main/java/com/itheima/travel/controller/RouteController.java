package com.itheima.travel.controller;

import com.itheima.travel.pojo.Route;
import com.itheima.travel.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService routeService;


    @RequestMapping("findById.do")
    public Route findById(int rid){
        Route route = routeService.findById(rid);
        System.out.println(route);
        return route;
    }

}
