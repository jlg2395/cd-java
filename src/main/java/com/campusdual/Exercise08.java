package com.campusdual;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

mostrarSaludo();
pedirNumero();

//bucle while

//int variableAEvaluar=1;
//while (variableAEvaluar<5){
//    System.out.println("La variable a evaluar es menor que 5, porque vale: " + variableAEvaluar);
//    variableAEvaluar++;
//}

//bucle do-while

//int variableAEvaluar2=2;
//do {
//    System.out.println("La variable a evaluar es menor que 5, porque vale: " + variableAEvaluar2);
//    variableAEvaluar2++;
//
//} while(variableAEvaluar2<5);


    }//main

//Pedir al usuario que ponga su nombre y mostrar por pantalla un mensaje de bienvenida con el

public static void mostrarSaludo(){
    Scanner scan = new Scanner(System.in);
    String nombreUsuario;
    System.out.println("Introduce tu nombre: ");
    nombreUsuario = scan.next();
    System.out.println("Hola " + nombreUsuario + "! ¿Como estás?");

}//mostrarSaludo


 //Pedir al usuario un número mayor que 5 y mostrar un mensaje por pantalla
 public static void pedirNumero() {
     Scanner scan = new Scanner(System.in);
     int numeroParaMostrar;
     do {
         System.out.println("Introduce un numero mayor que 5");
         numeroParaMostrar = scan.nextInt();
     } while (numeroParaMostrar < 5);
     System.out.println("El numero que has escrito es: " + numeroParaMostrar);
 }
}//clase




