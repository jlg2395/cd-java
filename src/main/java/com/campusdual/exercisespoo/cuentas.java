package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class Cuentas {

    private int ingreso = 0;
    private int gasto = 0;


    public Cuentas() {

    }


    public void saldo() {
        int resultado = this.ingreso - this.gasto;
        System.out.println("Su saldo es: " + resultado);
        if (resultado < 0) {
            System.out.println("Debería reducir sus gastos");
        } else if (resultado == 0) {
            System.out.println("Está usted sin blanca");
        } else {
            System.out.println("Tiene usted ingresos, sus gastos están controlados");
        }

    }

    public void setIngreso() {

        int ingreso = Utils.integer("Introduce un ingreso: ");

        if (ingreso > 0) {
            System.out.println("Se ha guardado su ingreso de: " + ingreso);
            this.ingreso += ingreso;
            System.out.println("Sus ingresos ahora son de: " + this.ingreso);
        } else {
            System.out.println("El número introducido no es un ingreso válido");
        }
    }

    public void getIngreso() {
        System.out.println("Sus ingresos totales son de: " + this.ingreso);
    }

    public void setGasto() {
        int gasto = Utils.integer("Introduce un gasto: ");
        if (gasto > 0) {
            System.out.println("Se ha guardado un gasto de: " + gasto);
            this.gasto += gasto;
            System.out.println("Sus gastos ahora son de: " + this.gasto);
        } else {
            System.out.println("El número introducido no es un gasto válido");
        }
    }

    public void getGasto() {
        System.out.println("Sus gastos totales son de: " + this.gasto);
    }


}
