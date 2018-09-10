/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.Entities;

/**
 *
 * @author RA302
 */
public class Estudiante {

    private int id;
    private String nombre;
    private String correo;
    private String curso;
    private Matricula matricula;

    public Estudiante(int id, String nombre, String correo, String curso, Matricula matricula) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.matricula = matricula;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
