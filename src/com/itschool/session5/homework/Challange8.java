package com.itschool.session5.homework;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Challange8 {
    /*
        Write a Java program to calculate the factorial of a number using a for loop.
        Declare an integer variable number and assign a value to it.
        Then calculate and print the factorial of number.
        - see reference for factorial of a number - https://en.wikipedia.org/wiki/Factorial
     */
    public static void main(String[] args) {
        int number = 50;

        System.out.println(calculateFactorial(number));
    }

    /*
        I used BigInteger class because with long was easy
        to get overflow
     */

    private static BigInteger calculateFactorial(int number) {
        if (number == 0) {
            return BigInteger.ONE;
        } else if (number < 0) {
            System.err.println("Error: number must be non-negative!");
            return BigInteger.ZERO;
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }
}
