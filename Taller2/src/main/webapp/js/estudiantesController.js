/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var app=angular.module('cursoApp',[]);

app.controller('estudiantesController', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    /*$scope.estudiantes=[
        {nombre:"Angye Daniela Torres Veloza", correo: "angye.torres@uptc.edu.co", curso: "Ing. Soft I"},
        {nombre:"Daniel Andres Reyes Plazas", correo: "daniel.reyes01@uptc.edu.co", curso: "Ing. Soft II"},
        {nombre:"Daniel Felipe Contreras Lopez", correo: "daniel.contreras@uptc.edu.co", curso: "Ing. Soft III"},
        {nombre:"David Eduardo Guerrero Casas", correo: "david.guerrero02@uptc.edu.co", curso: "Ing. Soft I"},
        {nombre:"David Felipe Huertas Flechas", correo: "david.huertas@uptc.edu.co", curso: "Ing. Soft II"},
        {nombre:"Deisy Johana Díaz Pérez", correo: "deisy.diaz03@uptc.edu.co", curso: "Ing. Soft III"},
        {nombre:"Fredy Alejandro Gamba Ortiz", correo: "ray.gamba@uptc.edu.co", curso: "Ing. Soft I"},
        {nombre:"Germán Andrés Torres Canchala", correo: "german.torres01@uptc.edu.co", curso: "Ing. Soft II"},
        {nombre:"Ingrid Lorena Espitia Cuca", correo: "ingrid.espitia@uptc.edu.co", curso: "Ing. Soft III"},
        {nombre:"John Elkin Jiménez López", correo: "john.jimenez02@uptc.edu.co", curso: "Ing. Soft I"},
        {nombre:"Jorge Albeiro Catolico Ramirez", correo: "jorge.catolico01@uptc.edu.co", curso: "Ing. Soft II"},
        {nombre:"Julian Danilo Cuadrado Urbano", correo: "julian.cuadrado@uptc.edu.co", curso: "Ing. Soft III"},
        {nombre:"Karol Tatiana Alfonso González", correo: "karol.alfonso@uptc.edu.co", curso: "Ing. Soft I"},
        {nombre:"Leidy Viviana Lizarazo Calderon", correo: "leidy.lizarazo01@uptc.edu.co", curso: "Ing. Soft II"},
        {nombre:"Lina Alejandra Melo Patiño", correo: "lina.melo@uptc.edu.co", curso: "Ing. Soft III"},
        {nombre:"Mary Yuliana Boyaca Aguilar", correo: "mary.boyaca@uptc.edu.co", curso: "Ing. Soft I"},
        {nombre:"Milton Fernando Quintero Abril", correo: "milton.quintero@uptc.edu.co", curso: "Ing. Soft II"},
        {nombre:"Pedro Aguirre Arias", correo: "pedro.aguirre@uptc.edu.co", curso: "Ing. Soft III"},
        {nombre:"Yeisson Miguel Lopez Baron", correo: "Yeisson Miguel Lopez Baron", curso: "Ing. Soft I"}
    ];*/

    $scope.estudiantes = null;
    
    $scope.getEstudiantes=function(){
        $http.get("./webresources/ServicioEstudiante",{})
            .then(function(response) {
                $scope.estudiantes = response.data;
        }, function(){
                        alert("error");
        });
    }
    
    $scope.guardarEstudiante=function(){
        $http.post("./webresources/ServicioEstudiante",$scope.nuevoEstudiante)
            .then(function(response) {
               $scope.getEstudiantes(); 
        });
    }
    
    $scope.guardar=function(){
        $scope.estudiantes.push($scope.nuevoEstudiante);
         $scope.formVisibility=false;
    };
    
    $scope.formVisibility=false;
    $scope.mostrarFormulario=function(){
        $scope.formVisibility=true;
        console.log($scope.formVisibility);
    };
    
    $scope.getEstudiantes();
}]);