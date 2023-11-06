package com.campusdual.exercisespoo.ejercicioextra;

import com.campusdual.util.Utils;

import java.util.Date;

public abstract class Elements {
    protected String name;
    protected String author;
    protected Date date;
    public Elements(String name, String author,Date date){
        this.name=name;
        this.author=author;
        this.date =date;

    }

    public String getName() {
        return name;
    }

    public void setName() {
        String name= Utils.string("Introduzca el nombre del elemento: ");
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        String author=Utils.string("Introduzca el nombre del autor: ");
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

//    public void setDate() {
//        Date date=
//        this.date = date;
//    }
}
