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
public class Inversion extends Cuenta {

        private boolean estado;

    public Inversion(int codigoCuenta) {
        super(codigoCuenta);
        this.estado = true;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public void crearCuenta(Cliente objcliente, int tipoCuenta, short valorI, Cuenta cu) {
        boolean correctoProceso = false;
        if (tipoCuenta == 2) {

            // int codigoC=2;
            System.out.println("inicio creación de cuenta \n"
                    + "Se va a realizar el deposito");
            /*
            1. se valida la instancia y se continua con el proceso 
             */
            if (cu instanceof Inversion) {

                objcliente.setCuenta(cu);

                if (realizarDeposito(valorI, objcliente)) {

                    System.out.println("la cuenta ya fue creada");
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
            if (valorDeposito == 25000) {

                objCliente.getCuenta().monto = (double) valorDeposito;

                transacionOK = true;

            } else {

                System.out.println("ERROR CON OPERACIÓN el monto debe ser de 25000");
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
            if (resultado < 10000.0) {

                System.out.println("lo sentimos el saldo actual de su cuenta "
                        + "no permite realizar estas operaciones");

                System.out.println(" puede cancelar la cuenta si lo desea con la opcion 1");
                int opcion = 2; // si quiere llamar el metodo de cancelar la cuenta  cambia a 1
                if (opcion == 1) {
                    cancelarCuenta(objCliente);

                } else {

                    System.out.println("que bueno que continue con nuestro banco");
                }

            } else {

                objCliente.getCuenta().setMonto(resultado);
                System.out.println("la operacion ha sido correcta su saldo actual de su cuenta es igual a "
                        + objCliente.getCuenta().getMonto());

            }

        } else {

            System.out.println("cliente debe crear una cuenta");
        }
    }

    public void cancelarCuenta(Cliente objCliente) {
        System.out.println("inicio proceso cancelacion cuenta ");
        System.out.println(" Su saldo actual es " + objCliente.getCuenta().monto);
        objCliente.setCuenta(null);
        System.out.println("se cancelo la cuenta ");

    }
}
