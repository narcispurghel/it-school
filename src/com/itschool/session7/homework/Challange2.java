package com.itschool.session7.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange2 {
    /*
        Month Name Finder
        Write a program that asks the user to enter a number between 1 and 12.
        Print the name of the corresponding month or "Invalid Month" if out of range.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                System.out.println("Enter a month number: ");
                int month = scanner.nextInt();

                System.out.println(toMonth(month));
                inputIsValid = true;
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }

    public static String toMonth(int number) {
        switch (number) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid Month";
        }
    }
}
