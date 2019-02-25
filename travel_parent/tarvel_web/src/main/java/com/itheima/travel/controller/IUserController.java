package com.itheima.travel.controller;

import com.itheima.travel.pojo.User;
import com.itheima.travel.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class IUserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<User> userList = iUserService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        mv.addObject("userList", userList);
        mv.setViewName("user-list");
        return mv;
    }
}
