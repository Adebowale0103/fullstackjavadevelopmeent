package com.adeshina.adeshinaprojects.java;

public class RegExClass {
    public static final String STRING_TEST="this is a test string";
    public static void main(String [] args){
        //matches any word and other characters
        System.out.println(STRING_TEST.matches("\\w.*"));
        // split string into words and save in an array

        String [] split_String=STRING_TEST.split("\\s+");
       // System.out.println(split_String.length);
        int length=+ split_String.length;
        System.out.println("There are " + length+ " words in the string");
        System.out.println("The words in the string are below:");

        //for each loop
        for(String words:split_String){
            System.out.println(words.toUpperCase());
        }

    }

}
