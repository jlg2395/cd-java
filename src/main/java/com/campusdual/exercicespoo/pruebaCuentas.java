package com.campusdual.exercicespoo;

import com.campusdual.util.Utils;

public class pruebaCuentas {

    public static void main(String[] args) {
        cuentas cuentasPedro= new cuentas();
       int opcion;

        do{
            cuentasPedro.añadirIngreso();
             opcion = Utils.integer("Quieres seguir? 1= Si o 2= No : ");
        }while (opcion==1);

      do{
          cuentasPedro.añadirGasto();
          opcion = Utils.integer("Quieres seguir? 1= Si o 2= No : ");

      }while (opcion==1);

      cuentasPedro.saldo();





}
}
