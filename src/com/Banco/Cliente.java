/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Banco;

import java.util.Map;

/**
 *
 * @author pc lenovo
 */
public class Cliente extends Persona{
    
    private Cuenta cuenta;
    private Map<Integer, Cuenta> listadoC;
    
    public Cliente(String nombre, String Codigo) {
        super(nombre, Codigo);
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Map<Integer, Cuenta> getListadoC() {
        return listadoC;
    }

    public void setListadoC(Map<Integer, Cuenta> listadoC) {
        this.listadoC = listadoC;
    }
    
}
