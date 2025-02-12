package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange8 {
    /*
        Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
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
         * Same behaviour is expected for short and char data types
         * To make it works I need to explicitly cast it
         */
    }

    private static int addTwoBytesValues(byte firstNumber, byte secondNumber) {
        return (firstNumber + secondNumber);
    }
}
