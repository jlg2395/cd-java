package com.campusdual.exercicespoo;

public class Exercise02 {
    public static double calcularAreaCirculo(double radio){
    double area =Math.PI* Math.pow(radio,2);
            return  area;
    }
    public static double calcularLongitudCircunferencia(double radio){
    double longitud = 2* Math.PI*radio;
            return  longitud;
    }
    public static void main(String[] args) {
        //área de un cículo es igual a Pi*r*r
        //longitud de una circunferencia 2*Pi*r
        //área de un cuadrado lado*lado

        double radio = 7;
        double lado= 2.15;

        System.out.print("Área del cículo: ");
        System.out.println(calcularAreaCirculo(radio));
        System.out.print("Longitud de la circunferencia: ");
        System.out.println(calcularLongitudCircunferencia(radio));
        System.out.print("Área de un cuadrado: ");
        System.out.println(Math.pow(lado,2));
    }
}
