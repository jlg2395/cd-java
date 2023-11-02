package com.campusdual.exercisespoo.exercise10;

public class SandBox {
    public static void main(String[] args) {
        Perro p1 = new Perro(110, 23, 10, "domestico", "negro", "pelo corto",
                "canis", "Balto", "mi casa", "gua guau");
        Caballo c1 = new Caballo(170, 100, 10, "serra gallega", "marron", "corto",
                "equus", "Spirit", "o monte", "jijiji");
        Halcon h1 = new Halcon(30, 10, 5, "salvaje", true, 60, "falco",
                "Paquito", "el cielo", "screech screech");
        Pollo po1 = new Pollo(30, 5, 1, "domestico", true, 10,
                "gallus", "Calimero", "corral", "pio pio");
        Delfin d1 = new Delfin(150, 60, 5, "salvaje", 3, false,
                "delphinidae", "Flipper", "oceano", "iiii iiii");
        Orca o1 = new Orca(700, 3000, 20, "salvaje", 3, false,
                "orcinus orca", "Willy", "oceano", "no se que sonido hace una orca mek mek");
        p1.presentarse();
        c1.presentarse();
        h1.presentarse();
        po1.presentarse();
        d1.presentarse();
        o1.presentarse();
    }
}
