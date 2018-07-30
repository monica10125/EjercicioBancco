/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Banco;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author pc lenovo
 */
public class Banco {
    
    private int codigoBanco;
    private static final String NOMBREBANCO="BANCO M";
     private Map<Integer, Cuenta> listadoC;
     private Empleado em;
     private ArrayList<Empleado> empleados;

    public Banco(int codigoBanco, Empleado e) {
        this.codigoBanco = codigoBanco;
        this.em=e; 
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Map<Integer, Cuenta> getListadoC() {
        return listadoC;
    }

    public void setListadoC(Map<Integer, Cuenta> listadoC) {
        this.listadoC = listadoC;
    }

    public Empleado getEm() {
        return em;
    }

    public void setEm(Empleado em) {
        this.em = em;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    

    @Override
    public String toString() {
        return "Banco{" + "codigoBanco=" + codigoBanco + '}';
    }
    
    public void calcularVacaciones(Empleado e){
    
        int añosA= e.getAñosAntiguedad();
        int diasV=0;
        
        if (añosA==1) {
            diasV=10;
            e.setDiasVacacones(diasV);
        }
          if (añosA==2) {
            diasV=15;
            
          e.setDiasVacacones(diasV);
        }
          
            if (añosA==3) {
            diasV=20;
            
            e.setDiasVacacones(diasV);
        }

    
    }
    
}
