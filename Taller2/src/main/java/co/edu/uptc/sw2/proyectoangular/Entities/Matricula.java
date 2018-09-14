/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.proyectoangular.Entities;

import java.util.Date;

/**
 *
 * @author Lorespitia_24
 */
public class Matricula {
    private  int id;
    private int year;
    private int semestre;
    private Estudiante estudiante;
    private Materia materia;

    public Matricula(int id, int year, int semestre, Estudiante estudiante, Materia materia) {
        this.id = id;
        this.year = year;
        this.semestre = semestre;
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    

}
