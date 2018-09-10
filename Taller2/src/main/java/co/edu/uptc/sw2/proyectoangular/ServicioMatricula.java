/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Matricula;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioMatricula")
public class ServicioMatricula {
    
    @GET
    public List<Matricula> consultarMatricula(){
        return Almacenamiento.getInstancia().getListaMatricula();
    }
    
    @POST
    public Matricula guardarEstudiante(Matricula matricula){
        
        matricula.setId(Almacenamiento.getInstancia().getListaMatricula().size() + 1);
        Almacenamiento.getInstancia().getListaMatricula().add(matricula);
        return matricula;
    }
    
  
}
