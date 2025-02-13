package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange6 {
    /*
        Write a Java program that takes two numbers from the user and uses relational operators to display whether
        the first number is greater than, less than, or equal to the second number.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        double number1;
        double number2;

        do {
            try {
                System.out.print("Enter first number: ");
                number1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                number2 = scanner.nextDouble();

                compareTwoNumbers(number1, number2);
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }

    public static void compareTwoNumbers(double number1, double number2) {
        if (number1 > number2) {
            System.out.println("First number is greater than second number");
        } else if (number1 < number2) {
            System.out.println("First number is lesser than second number");
        } else {
            System.out.println("First number is equal to second number");
        }
    }
}
