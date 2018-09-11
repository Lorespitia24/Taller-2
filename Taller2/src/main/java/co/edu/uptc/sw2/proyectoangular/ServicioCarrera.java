/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Carrera;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioCarrera")
public class ServicioCarrera {
    
    @GET
    public List<Carrera> consultarCarrera(){
        return Almacenamiento.getInstancia().getListaCarrera();
    }
    
    @POST
    public Carrera guardarCarrera(Carrera carrera){
        
        carrera.setId(Almacenamiento.getInstancia().getListaCarrera().size() + 1);
        Almacenamiento.getInstancia().getListaCarrera().add(carrera);
        return carrera;
    }
    
  
}
