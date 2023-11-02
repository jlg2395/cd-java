package com.campusdual.exercisespoo.Exercise10;

public class Pez extends Animal{
    protected String habitat;
    protected int numeroAletas;
    protected boolean escamas;

    public Pez(int altura, int peso, int edad, String habitat, int numeroAletas, boolean escamas) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.numeroAletas = numeroAletas;
        this.escamas = escamas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }
}
