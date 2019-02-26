app.controller("categoryController", function ($scope, categoryService) {


    //根据id查询一条路线
    $scope.findAll=function () {
        categoryService.findAll().success(
            function (response) {
                // alert(response.rows);
                $scope.list = response.rows;
            }
        )
    }
});