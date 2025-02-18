package com.itschool.session5.homework;

public class Challange1 {
    /*
        Write a Java program where you create two String objects named stringOne
        and stringTwo with the same value "OpenAI".
        Check and print whether they refer to the same object.
     */

    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        String stringThree = new String("OpenAI");

        System.out.println(stringOne == stringTwo);
        /*
            True because when we use == we check for the same instance
            and the variables was crated with assignment operator =
            so they will be stored in String Pool zone
         */

        System.out.println(stringOne == stringThree);
        /*
            False because stringThree was created using keyword new
            so it will be stored in Java Heap zone as a new Instance of the
            String class
         */
    }
}
