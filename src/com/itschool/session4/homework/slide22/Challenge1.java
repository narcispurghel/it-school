package com.itschool.session4.homework.slide22;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        /*
        Binary Arithmetic Operators:
        Write a Java program to take two numbers as input and display the result of addition,
        subtraction, multiplication, division, and modulus.
        Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
         */

        Scanner scanner = new Scanner(System.in);
        double number1 = 0.0, number2 = 0.0;
        boolean inputIsValid = false;

        do {
            try {
                System.out.print("Enter the first number: ");
                number1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                number2 = scanner.nextDouble();

                inputIsValid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);

        performArithmeticOperations(number1, number2);

        inputIsValid = false;
        double breadth = 0.0, width = 0.0;

        do {
            try {
                System.out.print("Enter the breadth: ");
                breadth = scanner.nextDouble();

                System.out.print("Enter the width: ");
                width = scanner.nextDouble();

                inputIsValid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);

        System.out.println("Rectangle area is: " + calculateRectangleArea(breadth, width));

        scanner.close();
    }

    static void performArithmeticOperations(double number1, double number2) {
        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        System.out.println("Modulus: " + (number1 % number2));
    }

    static double calculateRectangleArea(double breadth, double width) {
        return breadth * width;
    }
}