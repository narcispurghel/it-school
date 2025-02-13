package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange7 {
    /*
        Write a program where you perform operations between an integer and a double. Display the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        int firstNumber;
        double secondNumber;

        do {
            try {
                System.out.print("Enter first number: ");
                firstNumber = scanner.nextInt();

                System.out.print("Enter second number: ");
                secondNumber = scanner.nextDouble();

                if (secondNumber > 0) {
                    inputIsValid = true;
                    performOperationsBetweenIntegerAndDouble(firstNumber, secondNumber);
                }
                else {
                    System.err.println("Error: Numerator must be > 0");
                }
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }

    /**
     * After execution of the program operations between integer variable firstNumber
     * and double variable secondNumber will result always in a double data type
     * result due to Numeric Promotion
     * Java will always choose the biggest data type
     */

    public static void performOperationsBetweenIntegerAndDouble(int number1, double number2) {
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
