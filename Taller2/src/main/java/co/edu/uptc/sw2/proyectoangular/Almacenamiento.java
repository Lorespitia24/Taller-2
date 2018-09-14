/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular;

import co.edu.uptc.sw2.proyectoangular.Entities.Carrera;
import co.edu.uptc.sw2.proyectoangular.Entities.Estudiante;
import co.edu.uptc.sw2.proyectoangular.Entities.Facultad;
import co.edu.uptc.sw2.proyectoangular.Entities.Horario;
import co.edu.uptc.sw2.proyectoangular.Entities.Materia;
import co.edu.uptc.sw2.proyectoangular.Entities.Matricula;
import co.edu.uptc.sw2.proyectoangular.Entities.Municipio;
import co.edu.uptc.sw2.proyectoangular.Entities.Profesor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author RA302
 */
public class Almacenamiento {

    private static final Almacenamiento instancia = new Almacenamiento();
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    private List<Carrera> listaCarrera = new ArrayList<Carrera>();
    private List<Facultad> listaFacultad = new ArrayList<Facultad>();
    private List<Profesor> listaProfesor = new ArrayList<Profesor>();
    private List<Horario> listaHorario= new ArrayList<Horario>();
    private List<Materia> listaMateria = new ArrayList<Materia>();
    
    private List<Municipio> listaMunicipio = new ArrayList<Municipio>();
    private List<Matricula> listaMatricula = new ArrayList<Matricula>();
    
    
    public static Almacenamiento getInstancia() {
        return instancia;
    }

    private Almacenamiento() {
        //lista estudiantes
        Estudiante e1 = new Estudiante(3, "pepito", "a@a.com", "ing software", null);
        Estudiante e2 = new Estudiante(1, "Juan", "a@a.com", "ing software", null);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(new Estudiante(2, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(new Estudiante(3, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(new Estudiante(4, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(new Estudiante(5, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(new Estudiante(6, "aa", "a@a.com", "ing software", null));
        listaEstudiantes.add(e1);
        
        //lista profesores
        listaProfesor.add(new Profesor(1, "Felipe", "Gonzales", 0));
        listaProfesor.add(new Profesor(2, "Andres", "Gonzales", 1));
        
        //lista facultad
        Facultad facultad=new Facultad(1, "Salud");
        Facultad facultad1=new Facultad(2, "Ingenieria");
        listaFacultad.add(facultad);
        listaFacultad.add(facultad1);
        
        //lista carrera
        listaCarrera.add(new Carrera(1, "Sistemas", facultad1));
        listaCarrera.add(new Carrera(1, "Medicina", facultad));
        
        //lista municipio
        listaMunicipio.add(new Municipio(1, "Paz del Rio"));
        listaMunicipio.add(new Municipio(2, "Villa de Leyva"));
        listaMunicipio.add(new Municipio(3, "Tibana"));
        
        //lista materias
        Materia materia1 = new Materia(1, "Calculo", 2, (new Horario(1,"Lunes", Calendar.getInstance().getTime(), Calendar.getInstance().getTime())));
        listaMateria.add(materia1);
        
        //horarios
        
        
        listaMatricula.add(new Matricula(1, 2017, 2, e1, materia1));
        listaMatricula.add(new Matricula(1, 2017, 2, e2, materia1));
                       
    }

    public List<Estudiante> getListaEstudiante() {
        return listaEstudiantes;
    }

    public List<Facultad> getListaFacultad() {
        return listaFacultad;
    }

    public void setListaFacultad(List<Facultad> listaFacultad) {
        this.listaFacultad = listaFacultad;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public List<Carrera> getListaCarrera() {
        return listaCarrera;
    }

    public void setListaCarrera(List<Carrera> listaCarrera) {
        this.listaCarrera = listaCarrera;
    }

    public List<Profesor> getListaProfesor() {
        return listaProfesor;
    }

    public void setListaProfesor(List<Profesor> listaProfesor) {
        this.listaProfesor = listaProfesor;
    }

    public List<Horario> getListaHorario() {
        return listaHorario;
    }

    public void setListaHorario(List<Horario> listaHorario) {
        this.listaHorario = listaHorario;
    }

    public List<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(List<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    public List<Municipio> getListaMunicipio() {
        return listaMunicipio;
    }

    public void setListaMunicipio(List<Municipio> listaMunicipio) {
        this.listaMunicipio = listaMunicipio;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }

   

}
