package com.itschool.session4.homework.slide22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        /*
        Challenge
            Numeric Promotion:
            Write a program where you perform operations between an integer and a double.
            Display the result and discuss why it is in that format (due to Numeric Promotion).
            Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
            Explain why the result is or is not what you'd expect, based on the rules of numeric promotion.
         */

        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        int firstNumber = 0;
        double secondNumber = 0.0;
        String operation = null;

        do {
            try {
                System.out.print("Enter an integer: ");
                firstNumber = scanner.nextInt();

                System.out.print("Enter a double: ");
                secondNumber = scanner.nextDouble();

                System.out.print("Enter operation (+ - * / %): ");
                operation = scanner.next();

                inputIsValid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a valid value");
                scanner.nextLine();
            }
        } while (!inputIsValid);

        performOperationsBetweenIntegerAndDouble(firstNumber, secondNumber, operation);

        /**
         * After execution of the program operations between integer variable firstNumber
         * and double variable secondNumber will result always in a double data type
         * result due to Numeric Promotion
         * Java will always choose the biggest data type
         */

        inputIsValid = false;
        byte byteNumber1 = 0;
        byte byteNumber2 = 0;

        do {
            try {
                System.out.print("Enter a byte value: ");
                byteNumber1 = scanner.nextByte();

                System.out.print("Enter another byte value: ");
                byteNumber2 = scanner.nextByte();

                inputIsValid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a valid value");
                scanner.nextLine();
            }
        } while (!inputIsValid);

        // byte result = addTwoBytesValues(byteNumber1, byteNumber2); doesn't work
        int integerResult = addTwoBytesValues(byteNumber1, byteNumber2);
        byte byteResult = (byte)addTwoBytesValues(byteNumber1, byteNumber2); // overflow risk

        System.out.printf("Integer value: %d\n", integerResult);
        System.out.printf("Byte value: %d\n", byteResult);

        /**
         * The result is not what I expected due to Numeric Promotion
         * defined in Java Language Specification (JLS)
         * Two byte values added together will promote to integer
         * to ensure no data loss like overflow, underflow etc.
         * Same behaviour is expected for shor and char data types
         * To make it works I need to explicitly cast it
         */

        scanner.close();
    }

    static void performOperationsBetweenIntegerAndDouble(int firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+":
                System.out.printf("%d + %f = %f\n", firstNumber, secondNumber, (firstNumber + secondNumber));
                break;
            case "-":
                System.out.printf("%d - %f = %f\n", firstNumber, secondNumber, (firstNumber - secondNumber));
                break;
            case "*":
                System.out.printf("%d * %f = %f\n", firstNumber, secondNumber, (firstNumber * secondNumber));
                break;
            case "/":
                System.out.printf("%d / %f = %f\n", firstNumber, secondNumber, (firstNumber / secondNumber));
                break;
            case "%":
                System.out.printf("%d modulo %f = %f\n", firstNumber, secondNumber, (firstNumber % secondNumber));
                break;
            default:
                System.out.println("Unknown operation");
        }
    }

    static int addTwoBytesValues(byte firstNumber, byte secondNumber) {
        return (firstNumber + secondNumber);
    }
}
