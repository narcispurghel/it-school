package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange1 {
    /*
        Write a Java program to take two numbers as input and display
        the result of addition, subtraction, multiplication, division, and modulus.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        double number1, number2;

        do {
            try {
                System.out.print("Enter first number: ");
                number1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                number2 = scanner.nextDouble();

                if (number2 > 0) {
                    inputIsValid = true;
                } else {
                    System.err.println("Error: Numerator must be > 0");
                }

                performBasicCalculations(number1, number2);
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }

    public static void performBasicCalculations(double number1, double number2) {
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        double modulus = number1 % number2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
    }
}
