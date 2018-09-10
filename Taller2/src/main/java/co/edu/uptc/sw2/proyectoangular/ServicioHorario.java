/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Horario;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioHorario")
public class ServicioHorario {
    
    @GET
    public List<Horario> consultarHorario(){
        return Almacenamiento.getInstancia().getListaHorario();
    }
    
    @POST
    public Horario guardarEstudiante(Horario horario){
        
        horario.setId(Almacenamiento.getInstancia().getListaHorario().size() + 1);
        Almacenamiento.getInstancia().getListaHorario().add(horario);
        return horario;
    }
    
  
}
