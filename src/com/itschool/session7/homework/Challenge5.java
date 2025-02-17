package com.itschool.session7.homework;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge5 {
    /*
        Fibonacci Series Generator
        Write a program that generates and prints the first n numbers of the Fibonacci series,
        where n is provided by the user.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                System.out.print("Enter n numbers to print: ");
                int n = scanner.nextInt();

                System.out.print("Generated Fibonacci Series: ");
                fibonacciSeriesGenerator(n);

                inputIsValid = true;
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }

    public static void fibonacciSeriesGenerator(int numberGenerator) {
        BigInteger fNMinus2 = BigInteger.ZERO; // F0 always 0
        BigInteger fNMinus1 = BigInteger.ONE; // F1 always 1
        BigInteger fN;

        if (!(numberGenerator > 1)) {
            throw new RuntimeException("Fibonacci series generator number must be > 1");
        }

        for (int i = 0; i < numberGenerator; ++i) {
            if (i > 1) {
                fN = fNMinus1.add(fNMinus2);
                fNMinus2 = fNMinus1;
                fNMinus1 = fN;

                System.out.print(fN + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        
    }
}
