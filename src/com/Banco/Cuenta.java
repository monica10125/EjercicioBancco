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
public abstract class Cuenta {
  protected  Double monto;
    protected  int codigoCuenta;

    public Cuenta(int codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
        this.monto=0.0;
    }
    
    
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(int codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

  
    public abstract void crearCuenta(Cliente objcliente,int tipoCuenta,short valorI, Cuenta cu);
    public abstract  boolean realizarDeposito(short valorDeposito,Cliente objCliente);
    public abstract void retirar(Cliente objCliente, short valorAretirar);

    @Override
    public String toString() {
        return "Cuenta{" + "monto=" + monto + ", codigoCuenta=" + codigoCuenta + '}';
    }
   

    
    
}
