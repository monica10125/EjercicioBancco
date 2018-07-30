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
public class Ahorros extends Cuenta {

    private double porcentajeAual;
    private double[] valorinteres12meses;

    public Ahorros(int codigoCuenta) {
        super(codigoCuenta);
        valorinteres12meses = new double[12];
    }

    public double getPorcentajeAual() {
        return porcentajeAual;
    }

    public void setPorcentajeAual(double porcentajeAual) {
        this.porcentajeAual = porcentajeAual;
    }

    public double[] getValorinteres12meses() {
        return valorinteres12meses;
    }

    public void setValorinteres12meses(double[] valorinteres12meses) {
        this.valorinteres12meses = valorinteres12meses;
    }

    @Override
    public void crearCuenta(Cliente objcliente, int tipoCuenta, short valorI, Cuenta cu) {

        /*
        1. el tipo 1 cuenta de ahorros 
        2. se crea una variable bolean que valida el proceso de generar deposito
        
         */
        boolean correctoProceso = false;
        if (tipoCuenta == 1) {

            //int codigoC=1;
            System.out.println("inicio creación de cuenta \n"
                    + "Se va a realizar el deposito");
            /*
            
             se valida la instancia y se le asigna a la cuennta
            del cliente 
             */

            if (cu instanceof Ahorros) {
                objcliente.setCuenta(cu);

                if (realizarDeposito(valorI, objcliente)) {

                    System.out.println("la cuenta ya fue creada junto a su deposito");
                } else {

                    System.out.println("su cuenta ya fue creada pero el primer deposito no"
                            + "fue creado con exito ");

                }
            }

        }
    }

    @Override
    public boolean realizarDeposito(short valorDeposito, Cliente objCliente) {
        boolean transacionOK = false;

        if (objCliente.getCuenta() != null && objCliente.getCuenta().monto == 0.0) {
            if (valorDeposito == 1000) {

                objCliente.getCuenta().monto = (double) valorDeposito;

                transacionOK = true;

            } else {

                System.out.println("ERROR CON OPERACIÓN el monto debe ser solo 1000");
            }
        } else if (objCliente.getCuenta() != null) {

            objCliente.getCuenta().monto = objCliente.getCuenta().monto + (double) valorDeposito;

            transacionOK = true;

        }

        return transacionOK;
    }

    @Override
    public void retirar(Cliente objCliente, short valorAretirar) {
        double resultado;
        if (objCliente.getCuenta() != null) {
            System.out.println("Inicio Retiro");

            resultado = objCliente.getCuenta().monto - (double) valorAretirar;
            if (resultado < 500.0) {

                System.out.println("lo sentimos el saldo actual de su cuenta "
                        + "no permite realizar estas operaciones");
            } else {

                objCliente.getCuenta().setMonto(resultado);
                System.out.println("la operacion ha sido correcta su saldo actual de su cuenta es igual a "
                        + objCliente.getCuenta().getMonto());

            }

        } else {

            System.out.println("cliente debe crear una cuenta");
        }

    }

    public void calcularInteres(Cliente objCliente, double porcentaje, int mes) {
        double valorPorcentaje;
        if (objCliente.getCuenta() != null) {

            valorPorcentaje = objCliente.getCuenta().monto * porcentaje / 100;
            valorinteres12meses[mes] = valorPorcentaje;

        } else {

            System.out.println("debe haber almenos una cuenta señor usuario");
        }
    }
}
