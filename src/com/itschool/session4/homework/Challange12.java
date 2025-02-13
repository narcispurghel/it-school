package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange12 {
    /*
        Create a program that takes an integer as input and then increments and decrements it by 1,
         displaying the output at each stage.
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

                System.out.println("Initial value: " + number);
                System.out.println("After increment: " + performIncrement(number));
                System.out.println("After decrement: " + performDecrement(number));
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);
    }

    private static int performIncrement(int number) {
        return ++number;
    }

    private static int performDecrement(int number) {
        return --number;
    }
}
