package com.itschool.session4.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange9 {
    /*
        Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        double breadth, length ;

        do {
            try {
                System.out.print("Enter the breadth: ");
                breadth = scanner.nextDouble();

                System.out.print("Enter the width: ");
                length = scanner.nextDouble();

                inputIsValid = true;

                System.out.println("Rectangle area is: " + calculateRectangleArea(breadth, length));
            }
            catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter a valid value!");
                scanner.nextLine();
            }
        } while (!inputIsValid);
    }

    static double calculateRectangleArea(double breadth, double length) {
        return breadth * length;
    }
}