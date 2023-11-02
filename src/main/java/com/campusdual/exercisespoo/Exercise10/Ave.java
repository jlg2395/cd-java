package com.campusdual.exercisespoo.Exercise10;

public class Ave extends Animal{
    protected String habitat;
    protected boolean vuela;
    protected int tamañoAlas;

    public Ave(int altura, int peso, int edad, String habitat, boolean vuela, int tamañoAlas) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.vuela = vuela;
        this.tamañoAlas = tamañoAlas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public int getTamañoAlas() {
        return tamañoAlas;
    }

    public void setTamañoAlas(int tamañoAlas) {
        this.tamañoAlas = tamañoAlas;
    }
}
