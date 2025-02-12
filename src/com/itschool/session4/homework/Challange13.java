package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange13 {
    /*
        Write a program to calculate the price after discount. Take the original price and discount percentage as input.
         Use compound assignment operator to perform the calculation.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                System.out.print("Enter the original price: ");
                double originalPrice = scanner.nextDouble();

                System.out.print("Enter the discount percentage (0-100): ");
                double discountPercentage = scanner.nextDouble();

                if (discountPercentage <= 0 || discountPercentage > 100) {
                    System.err.println("Error: discount percentage value is not valid!");
                } else {
                    System.out.println("Price after discount: " + calculatePriceAfterDiscount(originalPrice, discountPercentage));
                    inputIsValid = true;
                }
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);
    }

    private static double calculatePriceAfterDiscount(double originalPrice, double discountPercentage) {
        originalPrice -= (discountPercentage / 100) * originalPrice;
        return originalPrice;
    }
}
