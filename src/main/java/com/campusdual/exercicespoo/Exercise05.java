package com.campusdual.exercicespoo;

public class Exercise05 {
//Comprobar si un número es positivo o negativo- mayor o menor que 0
//Comprobar si un número es múltiplo de otro- Que el resto de la división sea 0
//Comprobar si un número es menor a otro

public static void main(String[] args) {

    System.out.print("1. Comprobar si el número es positivo o negativo: ");
    esPositivo(4);
    System.out.print("2. Comprobar si el número es múltiplo de otro: ");
    esMultiplo(5,2);
    System.out.print("3. Comrpobar si el número es menor a otro: ");
    esMenor(6,2);
}
public static void esPositivo(int numero){

    if (numero >=0){
        System.out.println("El número " + numero + " es un número positivo.");

    }else {
        System.out.println("El número" + numero + " es un número negativo.");

    }


}
    public static void esMultiplo(int numero1, int numero2){
        if (numero1 % numero2 == 0){
            System.out.println("El número " + numero1 + " es un múltiplo de " + numero2);
        }else {
            System.out.println("El número " + numero1 + " no es un múltiplo de " + numero2);
        }
    }
    public static void  esMenor(int numero1,int numero2){
        if (numero1 < numero2) {
            System.out.println("El número " + numero1 + " es menor que " + numero2);
        } else if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);
        } else {
            System.out.println("El número " + numero1 + " es igual a " + numero2);
        }
       }


}