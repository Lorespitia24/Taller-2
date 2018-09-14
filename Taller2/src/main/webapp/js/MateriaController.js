'use strict';

var listaMaterias=[
//    {
//        nombre:'Software',credito:2}, {
//        nombre:'Software II',credito:2
//    }
];

module.controller('MateriaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
   $scope.lista = null;
   $scope.listaHorario = null;
//    $scope.id=3;
    $scope.getMateria=function(){
        $http.get("./webresources/ServicioMateria",{})
            .then(function(response) {
                $scope.lista = response.data;
        }, function(){
                        alert("error");
        });
    }
    
     $scope.getHorario=function(){
        $http.get("./webresources/ServicioHorario",{})
            .then(function(response) {
                $scope.listaHorario = response.data;
        }, function(){
                        alert("error");
        });
    }
    
    $scope.guardarMateria=function(){
        $http.post("./webresources/ServicioMateria",$scope.datosMateria)
            .then(function(response) {
               $scope.getMateria(); 
        });
    }
        
    $scope.datosMateria = {};
    $scope.panelEditar = false;
    
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosMateria = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        
        if (!$scope.datosMateria.id){
            $scope.datosMateria.id = $scope.id++;
            $scope.lista.push($scope.datosMateria);
        }
        $scope.panelEditar = false;
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosMateria = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosMateria = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('\xbfDesea elminar este registro?')) {    
            for(var i=0; i<$scope.lista.length; i++){
                if($scope.lista[i]==data){
                    $scope.lista.splice(i,1);
                    break;
                }
            }
        }
    };
     $scope.getHorario();
     $scope.getMateria();
}]);
