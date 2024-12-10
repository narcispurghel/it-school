package com.itschool.session4.homework.slide22;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        /*
        Logical Complement and Negation Operators:
        Write a program to check if a number is positive or negative using logical complement operator.
        Write a Java program that takes two boolean inputs from a user.
        Apply the logical negation operator (!) to each and print the result.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPositive = (number > 0);

        if (!isPositive) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is positive.");
        }

        System.out.print("Enter the first boolean value (true/false): ");
        boolean firstInput = scanner.nextBoolean();
        System.out.print("Enter the second boolean value (true/false): ");
        boolean secondInput = scanner.nextBoolean();

        System.out.println("Negation of the first input: " + !firstInput);
        System.out.println("Negation of the second input: " + !secondInput);

        scanner.close();
    }
}
