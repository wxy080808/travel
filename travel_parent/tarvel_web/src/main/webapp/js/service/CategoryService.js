app.service("categoryService",function ($http) {



    // 根据id查询路线
    this.findAll = function () {
        return $http.get("/findAll.do");
    }

});