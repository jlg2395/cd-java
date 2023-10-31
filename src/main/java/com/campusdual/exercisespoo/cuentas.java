package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class Cuentas {

   int ingreso;
   int gasto;

   public Cuentas(){
this.ingreso= 0;
this.gasto= 0;
   }

   public void saldo (){
       int resultado = ingreso-gasto;
       System.out.println("Su saldo es: "+ resultado);
   }

   public void añadirIngreso( ){

       int ingreso2= Utils.integer("Introduce un ingreso: ");
       System.out.println("Se ha guardado su ingreso de: " + ingreso2);
       ingreso += ingreso2;
       System.out.println("Sus ingresos ahora son de: " + ingreso);
   }
public void añadirGasto(){
       int gasto2= Utils.integer("Introduce un gasto: ");
    System.out.println("Se ha guardado un gasto de: " + gasto2);
    gasto+= gasto2;
    System.out.println("Sus gastos ahora son de: " + gasto);
}



}
