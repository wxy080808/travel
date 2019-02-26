package com.itheima.travel.controller;

import com.itheima.travel.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/favorite")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    /**
     * 判断是否收藏
     * @param rid
     * @param uid
     */
    @RequestMapping("/isFavorite.do")
    public void isFavorite(String rid, int uid) {
        boolean favorite = favoriteService.isFavorite(rid, uid);
        System.out.println(favorite);
    }


    /**
     * 添加收藏
     * @param
     * @param
     */
    @RequestMapping("/addFavorite.do")
    public void addFavorite(String rid, int uid){

        favoriteService.add(rid, uid);

    }
}
