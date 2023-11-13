package com.campusdual.exercisespoo;

import java.util.ArrayList;
import java.util.List;

public class Exercise15 {
    public static List<String> createArrayList(){
        List<String> myList= new ArrayList<>();
        myList.add("GKFFD");
        myList.add("TNANA");
        myList.add("MPMSL");
        myList.add("PSWME");
        myList.add("LZMLF");
        myList.add("JYEBV");
        myList.add("YELNT");
        myList.add("JSNKR");
        myList.add("JFESF");
        myList.add("TMJLL");
        return myList;
    }
    public static void printList(List<String> list){
        for (String s: list){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

    }
}
