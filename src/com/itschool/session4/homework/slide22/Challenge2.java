package com.itschool.session4.homework.slide22;

public class Challenge2 {
    public static void main(String[] args) {
        /*
        Unary Operators:
        Create a Java program where you increment and decrement the same variable.
        Display the value of the variable after each operation.
        Write a program that reverses the sign of an entered integer using unary minus operator.
         */

        int number = 5;
        int increasedNumber = ++number;
        int decreasedNumber = --number;
        int reversedNumber = -number;

        System.out.println("Original: " + number);
        System.out.println("After incrementation: " + increasedNumber);
        System.out.println("After decremental: " + decreasedNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
