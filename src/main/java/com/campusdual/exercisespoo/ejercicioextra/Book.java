package com.campusdual.exercisespoo.ejercicioextra;

import com.campusdual.util.Utils;

import java.util.Date;

public class Book extends Elements {


    public Book(String name, String author, Date date) {
        super(name, author, date);

    }

    @Override
    public void setName() {
        String title= Utils.string("Introduce el título del libro: ");
        this.name= title;
    }

    @Override
    public void setAuthor() {
        String author= Utils.string("Introduce el nombre del autor: ");
        this.author=author;
    }

    @Override
    public void setDate() {
        System.out.println("Introduzca la fecha de publicación");
        int dia=Utils.integer("Introduce el día: ");
        int mes=Utils.integer("Introduce el mes: ");
        int año=Utils.integer("Introduce el año: ");
        Date date=new Date(dia,mes,año);
        this.date = date;
    }
}
