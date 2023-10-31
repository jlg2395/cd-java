package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class Cat {
    public String name;
    public String breed;
    public String sex;
    public static int age;
    public String hair;
    public static String colour;
    public boolean castrated;
    private String eyeColour = "green";

    public Cat(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.hair = hair;
        this.castrated = castrated;

    }


    public static void changeColour() {
        colour = Utils.string("Introduce el color del pelo: ");

    }

    public void changeEyeColour() {
        this.eyeColour = Utils.string("Introduce el color de ojos: ");
    }

    public static void changeAge() {
        age = Utils.integer("Introduce la edad del gato: ");
    }
    public void obtenerAge(){
        System.out.println("La edad del gato es : " + age);
    }
    public void chageCastrated(){
        this.castrated= true;
    }
    public void isCastrated(){
        if (this.castrated== true){
        System.out.println("El gato está castrado");
        } else {
            System.out.println("El gato no está castrado");
        }
    }
    public void catDetails(){
        System.out.println("Nombre: "+ this.name + "   Edad: "+ age + "   Sexo: " + this.sex + "     Raza: " +
                this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour+ "     Tipo de pelo: " + this.hair);
        System.out.println("Color del pelo: " + colour );
        isCastrated();
        System.out.println("--------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Cat gatoCoco= new Cat("Coco","siames","Macho",6,"pelo corto","rojo",false);
        Cat gatoPaquito= new Cat("Paquito","persa","Macho",12,"pelo largo","negro",false);
        Cat gatoSasha= new Cat("Sasha", "esfinge","Hembra", 5,"pelao", "sin color", false);
        gatoCoco.chageCastrated();
        gatoPaquito.chageCastrated();
        //como le cambio de color al gato con el metodo estatico de la clase?
        gatoCoco.catDetails();
        gatoSasha.catDetails();
    }
}
