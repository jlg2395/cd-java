package com.campusdual;

public class Exercise02 {
    public static void main(String[] args) {
        //área de un cículo es igual a Pi*r*r
        //longitud de una circunferencia 2*Pi*r
        //área de un cuadrado lado*lado

        double r = 7;
        double lado= 2.15;

        System.out.print("Área del cículo: ");
        System.out.println(Math.PI* Math.pow(r,2));
        System.out.print("Longitud de la circunferencia: ");
        System.out.println(2* Math.PI*r);
        System.out.print("Área de un cuadrado: ");
        System.out.println(Math.pow(lado,2));
    }
}
