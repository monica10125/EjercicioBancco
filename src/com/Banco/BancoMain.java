package com.Banco;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc lenovo
 */
public class BancoMain {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona cliente= new Cliente("Vanesa Guitierrez", "14567");
      Persona empleado= new Empleado("Contador", 2, "Luis Lopez", "1234560");
       Cuenta cuentaA= new Ahorros(1410);
      Cuenta cuentaI= new Inversion(1067);
       Cliente c= (Cliente) cliente;
          Ahorros a= (Ahorros) cuentaA;
        Inversion i= (Inversion)cuentaI;
        Empleado e= (Empleado) empleado;
        Banco ba= new Banco(10145, e);
      short valorDeposito=1000;
      short valorDepositoi=25000;
      short valorDeposito2=32000;
      short valorRetirar=12000;
      double porcentaje= 2.3;
      
      /*
      validar cuenta de ahorros 1, de inversion 2
      */
       
     cuentaA.crearCuenta((Cliente) cliente, 1, valorDeposito,cuentaA);
     cuentaA.realizarDeposito(valorDeposito2,(Cliente) cliente);
     cuentaA.retirar((Cliente) cliente, valorRetirar);
  
     a.calcularInteres((Cliente) cliente, porcentaje ,3);
    
       System.out.println(c.getCuenta().toString());
       System.out.println("///////////////////////////");
     System.out.println(Arrays.toString(a.getValorinteres12meses()));
     
     /*
     estas validaciones son para una cuenta de ahoorros luego se verifica con una 
     de tipo inversion 
     */
  
     cuentaI.crearCuenta((Cliente) cliente, 2, valorDepositoi, cuentaI);
     cuentaI.realizarDeposito(valorDeposito2, (Cliente) cliente);
     cuentaI.retirar((Cliente)cliente, valorRetirar);
     System.out.println(c.getCuenta().toString());
     
       System.out.println("///////////////////////////");
        System.out.println("Vacaciones de empleado");
        ba.calcularVacaciones(e);
        System.out.println("Vacaciones para el empleado  "+ e.getNombre()+ "Años de an  "
                + e.getAñosAntiguedad()+" en total dias "
                +e.getDiasVacacones());
        

     
              
    
      
      
    }
    
}
