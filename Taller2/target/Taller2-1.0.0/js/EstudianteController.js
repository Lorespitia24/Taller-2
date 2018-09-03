/* global module */

'use strict';

var listaEstudiantes=[{
        nombre:'Lorena', apellido:'Espitia',
        codigo:201410448,documento:1054094812,fechaNacimiento:"1996-08-31"},
{
        nombre:'Viviana', apellido:'Lizarazo',
        codigo:201390348,documento:1049263534,fechaNacimiento:"1995-02-15"}];

module.controller('EstudianteCtrl', ['$scope', '$filter', '$http', 
    function ($scope, $filter, $http) {
    //listar
    $scope.lista = listaEstudiantes;
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
