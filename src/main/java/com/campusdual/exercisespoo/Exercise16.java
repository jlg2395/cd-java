package com.campusdual.exercisespoo;

import com.campusdual.exercisespoo.exercise09.Doctor;
import com.campusdual.exercisespoo.exercise09.Person;
import com.campusdual.exercisespoo.exercise09.PoliceOfficer;
import com.campusdual.exercisespoo.exercise09.Teacher;

import java.util.HashMap;
import java.util.Map;

public class Exercise16 {
    public static void main(String[] args) {

        Map<String, Person> customMap= new HashMap<>();
        customMap.put("person", new Person("Jhon", "Smith"));
        customMap.put("teacher", new Teacher("Maria", "Montessori", "Educación"));
        customMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        customMap.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
        customMap.get("teacher").getDetails();
        customMap.remove("teacher");
        customMap.put("police", new PoliceOfficer("Charles","Boyle","B-99"));
        System.out.println();
    }
}
