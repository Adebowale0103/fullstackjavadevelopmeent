package com.adeshina.adeshinaprojects.java;

public class StringMethods {
    public static void main(String [] args){
        String str1="Welcome to my java program";    String str2="Hello";
        String str3="STUDENT";   String str4=""; String str5="abc def ghi ";
        int totalStudents=50;    String [] strCount=str5.split("\\s.+");

        // printing//
        System.out.println(str1.length());  System.out.println(str1.substring(1));
        System.out.println(str1.substring(3,7));    System.out.println(str2.contains("Hello"));
        System.out.println(str3.equals("student")); System.out.println(str4.isEmpty());
        System.out.println(str5.isEmpty());

        //Part2 of exercise 32
        System.out.println(str1.concat(str2));  System.out.println(str2.replace('e','A'));
        System.out.println(str1.toUpperCase());     System.out.println(str3.toLowerCase());
        System.out.println(str1.trim());    System.out.println(String.valueOf(totalStudents));
        for (String s: strCount){
            System.out.println("Word:" +s);
        }

        }
}
