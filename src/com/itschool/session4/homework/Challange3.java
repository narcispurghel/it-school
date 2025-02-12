package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange3 {
    public static void main(String[] args) {
        /*
            Write a program to check if a number is positive or negative using logical complement operator.
         */

        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        double number;

        do {
            try {
                System.out.print("Enter a value: ");
                number = scanner.nextDouble();

                inputIsValid = true;

                checkNumberSign(number);
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }

    private static void checkNumberSign(double number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative");
        } else {
            System.out.println("The number " + number + " is neutral (0)");
        }
    }
}
