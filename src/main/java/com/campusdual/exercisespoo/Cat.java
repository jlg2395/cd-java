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

    public Cat(String name, String breed, String sex, String hair, boolean castrated, int age, String colour) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.hair = hair;
        this.castrated = castrated;
        Cat.age=age;
        Cat.colour=colour;

    }


    public static void changeColour(String colour) {
        Cat.colour=colour;
    }

    public void changeEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public static void changeAge(int age) {

        if (age > 0) {
            Cat.age = age;
        } else {

                System.out.println("La edad introducida debe ser un número positivo.");

        }
    }

    public int obtenerAge() {
        return Cat.age;
    }

    public void changeCastrated(boolean castrated) {
        this.castrated=castrated;
    }

    public boolean isCastrated() {
        return this.castrated;
    }

    public void catDetails() {
        System.out.println("Nombre: " + this.name + "   Edad: " + Cat.age + "   Sexo: " + this.sex + "     Raza: " +
                this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour + "     Tipo de pelo: " + this.hair);
        System.out.println("Color del pelo: " + Cat.colour);
        isCastrated();
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Cat gatoCoco = new Cat("Coco", "siames", "Macho", "pelo corto", false,10,"rojo");
        Cat gatoPaquito = new Cat("Paquito", "persa", "Macho", "pelo largo", false,5,"morado");
        Cat gatoSasha = new Cat("Sasha", "esfinge", "Hembra", "pelao", false,6,"sin color");

        gatoCoco.changeCastrated(true);
        gatoPaquito.changeCastrated(true);
        Cat.changeColour("morado");
        Cat.changeColour("rojo");
        Cat.changeAge(16);
        Cat.changeAge(12);

        gatoSasha.changeEyeColour("azul");
        System.out.println("--------------------------------------------------------------------------------------");
        gatoCoco.catDetails();
        gatoPaquito.catDetails();
        gatoSasha.catDetails();
    }
}
