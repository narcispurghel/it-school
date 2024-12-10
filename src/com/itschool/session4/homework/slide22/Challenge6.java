package com.itschool.session4.homework.slide22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Relational Operators:
        Write a Java program that takes two numbers from the user and uses relational operators
        to display whether the first number is greater than, less than, or equal to the second number.
        Create a program that checks if a user entered number is within a specific range (e.g., 1-100).
        Use relational operators for the checks.
         */

        boolean inputIsValid = false;
        double firstNumber = 0.0, secondNumber = 0.0;

        do {
            try {
                System.out.print("Enter first number: ");
                firstNumber = scanner.nextDouble();

                System.out.print("Enter second number: ");
                secondNumber = scanner.nextDouble();

                inputIsValid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a valid value!");
                scanner.nextLine();
            }
        } while(!inputIsValid);

        relationalOperators(firstNumber, secondNumber);

        scanner.close();

        System.out.println("Is 1 in range 1-100? " + isInRage1To100(1.0));
        System.out.println("Is 101 in range 1-100? " + isInRage1To100(101.0));
    }

    static void relationalOperators(double firstNumber, double secondNumber) {
        System.out.println("Is first number greater than second number?: " + (firstNumber > secondNumber));
        System.out.println("Is first number less than second number?: " + (firstNumber < secondNumber));
        System.out.println("Is first number equal to second number?: " + (firstNumber == secondNumber));
    }

    static boolean isInRage1To100(double number) {
        return (number >= 1.0) && (number <= 100.0);
    }
}
