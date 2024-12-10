package com.itschool.session4.homework.slide22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        /*
        Increment and Decrement Operators:
        Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to
        10 and then back down to 1.
        Create a program that takes an integer as input and then increments and decrements it by 1,
        displaying the output at each stage.
         */

        int number = 1;
        System.out.println("Initial value: " + number);

        for(int i = 0; i < 9; i++) {
            ++number;
            System.out.println("Value: " + number);
        }

        for(int i = 0; i < 9; i++) {
            --number;
            System.out.println("Value: " + number);
        }

        Scanner scanner = new Scanner(System.in);
        int number2 = 0;
        boolean inputIsValid = false;

        do {
          try {
              System.out.print("Enter an integer value: ");
              number2 = scanner.nextInt();
              inputIsValid = true;
          }
          catch (InputMismatchException exception) {
              System.out.println("Please enter a valid value!");
              scanner.nextLine();
          }
        } while(!inputIsValid);

        performIncrementAndDecrementBy1(number2);

        scanner.close();
    }

    static void performIncrementAndDecrementBy1(int number) {
        System.out.println("Initial value: " + number);
        System.out.println("Increased by 1: " + (++number));
        System.out.println("Decreased by 1: " + (--number));
    }
}
