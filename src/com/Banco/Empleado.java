/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Banco;

/**
 *
 * @author pc lenovo
 */
public class Empleado extends Persona{
    
     public Empleado(String puestoTrabajo, int añosAntiguedad, String nombre, String Codigo) {
        super(nombre, Codigo);
        this.puestoTrabajo = puestoTrabajo;
        this.añosAntiguedad = añosAntiguedad;
    }
     
     
    private static final int SALARIO= 2000000;
    private int añosAntiguedad;
    private int diasVacacones;
    private String puestoTrabajo;

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public int getDiasVacacones() {
        return diasVacacones;
    }

    public void setDiasVacacones(int diasVacacones) {
        this.diasVacacones = diasVacacones;
    }

   
    
    
}
