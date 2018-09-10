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
    private Date año;
    private int semestre;

    public Matricula(int id, Date año, int semestre) {
        this.id = id;
        this.año = año;
        this.semestre = semestre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
