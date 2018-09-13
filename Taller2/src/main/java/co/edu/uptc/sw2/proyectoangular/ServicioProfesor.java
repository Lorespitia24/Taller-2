/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Profesor;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioProfesor")
public class ServicioProfesor {
    
    @GET
    public List<Profesor> consultarProfesor(){
        return Almacenamiento.getInstancia().getListaProfesor();
    }
    
    @POST
    public Profesor guardarProfesor(Profesor profesor){
        
        profesor.setId(Almacenamiento.getInstancia().getListaProfesor().size() + 1);
        Almacenamiento.getInstancia().getListaProfesor().add(profesor);
        return profesor;
    }
    
  
}
