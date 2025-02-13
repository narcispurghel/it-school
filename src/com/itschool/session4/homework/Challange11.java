package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange11 {
    /*
        Write a Java program that takes two boolean inputs from a user.
        Apply the logical negation operator (!) to each and print the result.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        boolean firstValue, secondValue;

        do {
            try {
                System.out.print("Enter the first boolean value (true/false): ");
                firstValue = scanner.nextBoolean();

                System.out.print("Enter the second boolean value (true/false): ");
                secondValue = scanner.nextBoolean();

                System.out.println(
                        "First value: " +
                        firstValue +
                        "\nNegated: " +
                        applyLogicalNegation(firstValue)
                );

                System.out.println(
                        "Second value: " +
                        secondValue +
                        "\nNegated: " +
                        applyLogicalNegation(secondValue)
                );

                inputIsValid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);
    }

    private static boolean applyLogicalNegation(boolean value) {
        return !value;
    }
}
