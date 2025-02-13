package com.itschool.session5.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange3 {
    /*
        Write a Java program that declares an integer variable age
        with a value that can be inserted from keyboard.
        Print a statement saying "I am adult" if age is 18 or more,
        else print "I am a child", using the ternary operator.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();

                if (age > 18) {
                    System.out.println("You are an adult!");
                    inputIsValid = true;
                } else if (age < 18 && age >= 0) {
                    System.out.println("You are a child!");
                    inputIsValid = true;
                } else {
                    System.err.println("Error: age must be >= 0");
                }
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }
}
