package com.campusdual;

public class Exercise01 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String cnv="200";
        int cnvInt = Integer.parseInt(cnv);
        System.out.println(cnvInt);
        cnvInt =cnvInt +1;
        String cnvStr = String.valueOf(cnvInt);
        System.out.println(cnvStr);
        System.out.println(cnvStr.charAt(0));
    }
}
