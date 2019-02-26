app.controller("FavoriteController", function ($scope, FavoriteService) {

    // //判断是否收藏
    // $scope.isFavorite.success(
    //     function (response) {
    //         $scope.entity=response;
    // });


    //点击收藏
    // $scope.addFavorite.success(
    //     function (response) {
    //         $scope.entity=response;
    // });


    // //读取列表数据绑定到表单中
    // $scope.findAll=function(){
    //     brandService.findAll().success(
    //         function(response){
    //             $scope.list=response;
    //         }
    //     );
    // }

    //根据id查询一条路线
    $scope.findById=function (rid) {
        FavoriteService.findById(rid).success(
            function (response) {
                $scope = response;
            }
        )
    }
});