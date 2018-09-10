/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Estudiante;
import co.edu.uptc.sw2.proyectoangular.Entities.Materia;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioMateria")
public class ServicioMateria {
    
    @GET
    public List<Materia> consultarMateria(){
        return Almacenamiento.getInstancia().getListaMateria();
    }
    
    @POST
    public Materia guardarMateria(Materia materia){
        
        materia.setId(Almacenamiento.getInstancia().getListaMateria().size() + 1);
        Almacenamiento.getInstancia().getListaMateria().add(materia);
        return materia;
    }
    
  
}
