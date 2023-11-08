package com.campusdual.exercisespoo.exercise13;

import com.campusdual.exercisespoo.exercise09.Doctor;
import com.campusdual.exercisespoo.exercise09.Person;
import com.campusdual.exercisespoo.exercise09.PoliceOfficer;
import com.campusdual.exercisespoo.exercise09.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Collections01 {

    public static void main(String[] args) {
        List<Person> stringList= new ArrayList<>();
//        Person persona1 = new Person("Pedro","Delgado");
        stringList.add(new Person("Jhon","Smith"));
        stringList.add(new Teacher("Maria", "Montessori", "Educación"));
        stringList.add(new PoliceOfficer("Jack", "Peralta", "B-99"));
        stringList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

    }
}
