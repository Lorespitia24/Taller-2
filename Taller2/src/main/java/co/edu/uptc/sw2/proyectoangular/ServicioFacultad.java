/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Facultad;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioFacultad")
public class ServicioFacultad {
    
    @GET
    public List<Facultad> consultarFacultad(){
        return Almacenamiento.getInstancia().getListaFacultad();
    }
    
    @POST
    public Facultad guardarFacultad(Facultad facultad){
        
        facultad.setId(Almacenamiento.getInstancia().getListaFacultad().size() + 1);
        Almacenamiento.getInstancia().getListaFacultad().add(facultad);
        return facultad;
    }
    
  
}
