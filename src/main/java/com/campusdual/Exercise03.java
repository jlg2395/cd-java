package com.campusdual;

public class Exercise03 {
    public static  String saludo(String nombre){
        String mensaje = "Hola. Bienvenido " + nombre;
        return mensaje;
    }
    public static void fechaActual(String fecha){

        System.out.println(fecha);

    }

    public static void main(String[] args) {

        System.out.print(saludo("Jorge "));
        fechaActual("19/03/2021");
    }
}
