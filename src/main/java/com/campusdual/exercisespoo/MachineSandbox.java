package com.campusdual.exercisespoo;

public class MachineSandbox {

    public static void main(String[] args) {
        IMachine a1 = new Avion("Boing");
        a1.start();
        a1.stop();
        a1.mantenaince();
        IMachine t1 = new Tractor(1200);
        t1.start();
        t1.stop();
        t1.mantenaince();
//        System.out.println(a1.getDetails());
//        System.out.println(t1.getDetails());
//        a1.takeOf();
//        a1.fly();
//        a1.land();
//        t1.forward();
//        t1.backward();
        ((Avion)a1).fly();

        

    }

}
