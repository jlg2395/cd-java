package com.campusdual.exercisespoo.ejercicioextra;

import java.util.Date;

public class Film extends Elements {

    protected Actores actores;

    public Film(String name, String author, Date date, Actores actores) {
        super(name, author, date);
        this.actores = actores;
    }

}
