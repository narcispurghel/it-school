package com.itschool.session4.homework.slide22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        /*
        Assignment and Compound Assignment Operators:
        Create a Java program that demonstrates the use of each compound assignment operator with integers.
        Write a program to calculate the price after discount. Take the original price and discount percentage as input.
        Use compound assignment operator to perform the calculation.
         */

        assignmentAndCompoundOperators();

        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        double price = 0.0, discount = 0.0;

        do {
            try {
                System.out.print("Enter price: ");
                price = scanner.nextDouble();

                System.out.print("Enter discount: ");
                discount = scanner.nextDouble();

                inputIsValid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);

        System.out.printf("%.2f$", calculatePriceAfterDiscount(price, discount));
        scanner.close();
    }

    static void assignmentAndCompoundOperators() {
        int number1 = 10;
        int number2 = number1;

        System.out.println("Simple assignment operator (number1 = number2):");
        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);

        System.out.println("Compound assignment operators: ");
        System.out.println("number1 += number2: " + (number1 += number2));
        number1 = 10;
        System.out.println("number1 -= number2: " + (number1 -= number2));
        number1 = 10;
        System.out.println("number1 *= number22: " + (number1 *= number2));
        number1 = 10;
        System.out.println("number1 /= number22: " + (number1 /= number2));
        number1 = 10;
        System.out.println("number1 %= number22: " + (number1 %= number2));
    }

    static double calculatePriceAfterDiscount(double price, double discount) {
        return (price -= price * (discount / 100));
    }
}
