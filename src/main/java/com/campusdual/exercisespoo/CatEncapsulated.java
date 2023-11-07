package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class CatEncapsulated {
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String hair;
    private String colour;
    private boolean castrated;
    private String eyeColour = "green";

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour,
                           boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("La edad debe ser un número positivo");
        }

    }

    public String getHair() {
        return this.hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {

        this.colour = colour;

    }

    public boolean isCastrated() {
        return this.castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;

    }

    public String getEyeColour() {
        return this.eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;

    }

    public void catEncapsulatedDetails() {
        System.out.println("Nombre: " + this.getName() + "   Edad: " + this.getAge() + " Años" + "   Sexo: " + this.getSex() + "     "
                + "Raza: " + this.getBreed());
        System.out.println("Color de los ojos: " + this.getEyeColour() + "     Tipo de pelo: " + this.getHair());
        System.out.println("Color del pelo: " + this.getColour() + "     Está: " + this.isCastrated());

        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        CatEncapsulated gatoPepe = new CatEncapsulated("Pepe", "siames", "Macho", 7, "pelo corto",
                "morado", false);
        CatEncapsulated gatoSancho = new CatEncapsulated("Sancho", "persa", "Macho", 9, "pelo largo",
                "rojo", false);
        CatEncapsulated gatoLulu = new CatEncapsulated("Lulu", "esfinge", "Hembra", 12, "pelado", "negro",
                false);

        gatoPepe.setCastrated(true);
        gatoSancho.setCastrated(true);

        gatoPepe.setColour("azul");
        gatoSancho.setColour("verde");
        gatoLulu.setEyeColour("morados");
        gatoLulu.setAge(20);
        System.out.println("--------------------------------------------------------------------------------------");
        gatoPepe.catEncapsulatedDetails();
        gatoSancho.catEncapsulatedDetails();
        gatoLulu.catEncapsulatedDetails();

    }
}
