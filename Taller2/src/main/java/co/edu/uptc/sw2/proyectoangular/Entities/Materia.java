/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.Entities;

/**
 *
 * @author Lorespitia_24
 */
public class Materia {
    private int id;
private String nombre;
private int creditos;
private Horario horario;

       public Materia(int id, String nombre, int creditos, Horario horario) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


}
