package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class coche {

    public String marca;
    public String modelo;
    public int velocidadMaxima;
    public String tipoCombustible;
    public int velocimetro=0;
    public int tacometro=0;
    private boolean encendido= false;

     private int volante=0;
     private String direccion;

     public coche(String marca,String modelo, int velocidadMaxima,String tipoCombustible){
         this.marca=marca;
         this.modelo=modelo;
         this.velocidadMaxima= velocidadMaxima;
         this.tipoCombustible= tipoCombustible;


     }

public void arrancar() {
          encendido= true;
          tacometro=1000;

    }
public void apagar(){
         encendido= false;
         tacometro=0;
}

public int acelerar(){
         this.velocimetro += 10;
         return this.velocimetro;

}
public int frenar(){
         this.velocimetro -=10;
         return this.velocimetro;
}
public void girarVolante(){
         int giro= Utils.integer("Introduce el ángulo de giro en grados de -180 a 180");
         volante+= giro;
}

public void darMarchaAtras(){
         direccion="Atrás";

}
}
