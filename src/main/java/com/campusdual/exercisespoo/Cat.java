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

    public Cat(String name, String breed, String sex, String hair, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.hair = hair;
        this.castrated = castrated;
    }


    public static String changeColour() {
        colour = Utils.string("Introduce el color del pelo: ");
        return colour;
    }

    public void changeEyeColour() {
        this.eyeColour = Utils.string("Introduce el color de ojos: ");
    }

    public static void changeAge() {
        age = Utils.integer("Introduce la edad del gato: ");
    }

    public int obtenerAge() {
        return age;
    }

    public void chageCastrated() {
        this.castrated = true;
    }

    public void isCastrated() {
        if (this.castrated == true) {
            System.out.println("El gato está castrado");
        } else {
            System.out.println("El gato no está castrado");
        }
    }

    public void catDetails() {
        System.out.println("Nombre: " + this.name + "   Edad: " + age + "   Sexo: " + this.sex + "     Raza: " +
                this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour + "     Tipo de pelo: " + this.hair);
        System.out.println("Color del pelo: " + colour);
        isCastrated();
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Cat gatoCoco = new Cat("Coco", "siames", "Macho", "pelo corto", false);
        Cat gatoPaquito = new Cat("Paquito", "persa", "Macho", "pelo largo", false);
        Cat gatoSasha = new Cat("Sasha", "esfinge", "Hembra", "pelao", false);

        gatoCoco.chageCastrated();
        gatoPaquito.chageCastrated();
        gatoCoco.colour = Cat.changeColour();
        gatoPaquito.colour = Cat.changeColour();
        Cat.changeAge();
        gatoCoco.age=gatoCoco.obtenerAge();
        Cat.changeAge();
        gatoPaquito.age=gatoPaquito.obtenerAge();
        gatoSasha.changeEyeColour();
        System.out.println("--------------------------------------------------------------------------------------");
        gatoCoco.catDetails();
        gatoPaquito.catDetails();
        gatoSasha.catDetails();
    }
}
