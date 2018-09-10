/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.RespuestaEstudiante;
import co.edu.uptc.sw2.proyectoangular.Entities.Estudiante;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 *
 * @author RA302
 */
@Path("Servicio1")
public class ServicioEjemplo {
    
    @GET
    public String saludo (@QueryParam("nombreUsuario") String nombre){
        return "Hola "+ nombre;
    }
    
    @GET
    @Path("/{nombreUsuario}")
    public String saludo1 (@PathParam("nombreUsuario") String nombre){
        return "Hola "+ nombre;
    }
    
    @POST
    public String saludo2(Estudiante estudiante){
        
        return "Hola " + estudiante.getNombre();
    }
    
    @POST
    @Path("otroSaludo")
    public RespuestaEstudiante saludo3(Estudiante estudiante) {
        RespuestaEstudiante re = new RespuestaEstudiante();
        re.setMensaje("Hola " + estudiante.getNombre() + " curso " + estudiante.getCurso());
        re.setFecha(new Date());
        return re;
    }
}
