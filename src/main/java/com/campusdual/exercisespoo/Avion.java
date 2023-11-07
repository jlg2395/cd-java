package com.campusdual.exercisespoo;

public  class Avion implements IMachine {
    protected String name;

    public Avion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("El avion está encendido.");

    }

    @Override
    public void stop() {
        System.out.println("El avion está parado");

    }

    @Override
    public void mantenaince() {
        System.out.println("El avion está en mantenimiento");

    }
    public String getDetails(){

      return "El modelo del avión es: " + this.getName();
    }
    public void takeOf(){
        System.out.println("El avion está despegando");
    }
    public void land(){
        System.out.println("El avion está aterrizando");

    }
    public void fly(){
        System.out.println("El avion está volando");
    }
}
