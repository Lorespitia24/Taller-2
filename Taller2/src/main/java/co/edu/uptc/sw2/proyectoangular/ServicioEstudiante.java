/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Estudiante;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;



@Path("ServicioEstudiante")
public class ServicioEstudiante {
    
    @GET
    public List<Estudiante> consultarEstudiantes(){
        return Almacenamiento.getInstancia().getListaEstudiante();
    }
    
    @POST
    public Estudiante guardarEstudiante(Estudiante estudiante){
        
        estudiante.setId(Almacenamiento.getInstancia().getListaCarrera().size() + 1);
        Almacenamiento.getInstancia().getListaEstudiante().add(estudiante);
        return estudiante;
    }
    
  
}
