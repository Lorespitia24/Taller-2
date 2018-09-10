'use strict';

var listaMaterias=[{
        nombre:'Software',credito:2, horario:{dia:'Lunes',horaInicio:'10:00 am',horaFinal:'12:00 pm'}}, {
        nombre:'Software II',credito:2,horario:{dia:'Lunes',horaInicio:'12:00 pm',horaFinal:'2:00 pm'}
    }];

module.controller('MateriaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = listaMaterias;
    $scope.id=3;
    
     $scope.listaHorario=listaHorario;
    
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        
        if (!$scope.datosFormulario.id){
            $scope.datosFormulario.id = $scope.id++;
            $scope.lista.push($scope.datosFormulario);
        }
        $scope.panelEditar = false;
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
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

}]);
