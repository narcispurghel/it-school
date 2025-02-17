package com.itschool.session7.homework;

public class Challenge1 {
    /*
        Even or Odd Checker
        Write a Java program that takes an integer as input. If the number is even, print "Even".
        If it's odd, print "Odd".
     */
    public static void main(String[] args) {
        int number = 5;
        System.out.println(checkParity(number));
    }

    private static String checkParity(int number) {
        if (number % 2 == 0) {
           return ("Even");
        } else {
            return "Odd";
        }
    }
}
