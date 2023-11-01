package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;


public class PruebaCuentas {

    public static void main(String[] args) {
        System.out.println("Buenos días");
        System.out.println("¿Qué quiere hacer? ");
        System.out.println("1. Añadir nueva página de cuentas");
        System.out.println("2. Salir");
        int opcionMenu = Utils.integer("Introduzca el número de la opción correspondiente: ");

        if (opcionMenu == 1) {

            Cuentas cuentasNuevo = new Cuentas();
            int opcionSeguir = 1;
            while (opcionSeguir == 1) {
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("¿Que quiere hacer?");
                System.out.println("1. Añadir un ingreso");
                System.out.println("2. Ver ingresos");
                System.out.println("3. Añadir un gasto");
                System.out.println("4. Ver gastos");
                System.out.println("5. Ver su saldo");
                System.out.println("---------------------------------------------------------------------------------");
                int opcionCuentas = Utils.integer("Introduzca el número de la opción correspondiente: ");

                switch (opcionCuentas) {
                    case 1:
                        cuentasNuevo.setIngreso();
                        break;
                    case 2:
                        cuentasNuevo.getIngreso();
                        break;
                    case 3:
                        cuentasNuevo.setGasto();
                        break;
                    case 4:
                        cuentasNuevo.getGasto();
                        break;
                    case 5:
                        cuentasNuevo.saldo();
                        break;
                }
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("¿Quiere seguir?");
                System.out.println("1. SI   2. NO");
                opcionSeguir = Utils.integer("Introduzca la opción correspondiente: ");
            }
        } else {
            opcionMenu = 2;

        }


        System.out.println("El programa ha finalizado");


    }


}

