package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange14 {
    /*
        Create a program that checks if a user entered number is within a specific range (e.g., 1-100).
        Use relational operators for the checks.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                System.out.print("Enter a number in range (1-100): ");
                int number = scanner.nextInt();

                System.out.println("Number is in range (1-100): " + isInRange1To100(number));
                inputIsValid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);
    }

    private static boolean isInRange1To100(int number) {
        return number > 1 && number < 100;
    }
}
