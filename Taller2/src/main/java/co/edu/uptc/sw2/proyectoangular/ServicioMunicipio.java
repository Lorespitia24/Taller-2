/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Municipio;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author RA302
 */

@Path("ServicioMunicipio")
public class ServicioMunicipio {
    
    @GET
    public List<Municipio> consultarMunicipio(){
        return Almacenamiento.getInstancia().getListaMunicipio();
    }
    
    @POST
    public Municipio guardarMunicipio(Municipio municipio){
        
        municipio.setId(Almacenamiento.getInstancia().getListaMunicipio().size() + 1);
        Almacenamiento.getInstancia().getListaMunicipio().add(municipio);
        return municipio;
    }
    
  
}
