package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange10 {
    /*
     Write a program that reverses the sign of an entered integer using unary minus operator.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        int number;

        do {
            try {
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                inputIsValid = true;

                System.out.println("Number reversed: " + reverseSign(number));
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);
    }

    private static int reverseSign(int number) {
        return -number;
    }
}
