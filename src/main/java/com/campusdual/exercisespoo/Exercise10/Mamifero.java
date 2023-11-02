package com.campusdual.exercisespoo.exercise10;

public class Mamifero extends Animal{
    protected String habitat;
    protected String colorPelo;
    protected String tipoPelo;

    public Mamifero(int altura, int peso, int edad, String habitat, String colorPelo, String tipoPelo) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.colorPelo = colorPelo;
        this.tipoPelo = tipoPelo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
}
