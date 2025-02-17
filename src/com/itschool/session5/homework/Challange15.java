package com.itschool.session5.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange15 {
    /*
         Write a Java program that simulates a simple authentication system.
         Declare a boolean variable hasUsername and hasPassword.
         Set up a series of logical conditions using these two variables
         that will check the following conditions:
           - If both hasUsername and hasPassword are true, print "Authentication successful".
           - If either hasUsername or hasPassword is false, print "Authentication failed".
           - If hasUsername is true but hasPassword is false, print "Password is incorrect".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();

                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                boolean hasUsername = !username.isBlank();
                boolean hasPassword = !password.isBlank();

                authenticate(hasUsername, hasPassword);
                inputIsValid = true;
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }

    private static void authenticate(boolean hasUsername, boolean hasPassword) {
        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (!hasUsername && !hasPassword) {
            System.out.println("Authentication failed");
        } else if (hasUsername) {
            System.out.println("Password incorrect");
        } else {
            System.out.println("User is not registered");
        }
    }
}
