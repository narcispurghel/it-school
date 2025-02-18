package com.itschool.session5.homework;

public class Challenge2 {
    /*
        Write a Java program to declare two integer variables firstNumber and secondNumber
        with any values. Use an equality operator to compare these two numbers and print
        the result. Do the same for two String objects firstString
        and secondString with the same value, but use the equals() method for comparison.
        Print the result.
     */
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        String stringThree = new String("OpenAI");

        System.out.println(firstNumber == secondNumber);
        /*
            False because == checks the value
         */

        System.out.println(stringOne.equals(stringThree));
        /*
            True because we check the contains not the reference
         */
    }
}
