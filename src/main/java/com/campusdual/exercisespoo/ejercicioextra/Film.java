package com.campusdual.exercisespoo.ejercicioextra;

import java.util.Date;

public class Film extends Elements {

    protected Actor actores;

    public Film(String name, String author, Date date, Actor actores) {
        super(name, author, date);
        this.actores = actores;
    }

}
