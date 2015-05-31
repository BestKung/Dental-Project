(function () {
    angular.module('user', [])
            .controller('UserController', ['$http', '$log', function ($http, $log) {
                    var controller = this;
                    this.user = {};
                    this.validationError;
                    $http.get("/users").success(function (data) {
                        controller.users = data;
                    });

                    this.save = function () {
                        $http.post("/users", this.user).success(function () {
                            $log.debug("OK");
                            $http.get("/users").success(function (data) {
                                controller.users = data;
                            });
                        }).error(function (data, status, headers, config) {
                            $log.debug(data.message);
                            controller.validationError=data;
                        });
                    };
                }])
            ;
})();


