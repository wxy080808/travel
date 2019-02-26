app.service("FavoriteService",function ($http) {

    // // 判断是否收藏
    // this.isFavorite = function (uid, rid) {
    //     return $http.get("../favorite/isFavorite.do?uid="+uid+"&rid="+rid);
    // }

    //添加收藏
    // this.addFavorite = function (uid, date, rid) {
    //     return $http.get("../favorite/addFavorite.do?uid="+uid+"&date="+date+"&rid="+rid);
    // }

    // 根据id查询路线
    this.findById = function (rid) {
        return $http.get("../route/findById.do?rid="+rid);
    }
});