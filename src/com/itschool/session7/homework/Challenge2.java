package com.itschool.session7.homework;

import com.itschool.helper.ValidateInput;
public class Challenge2 {
    /*
        Month Name Finder
        Write a program that asks the user to enter a number between 1 and 12.
        Print the name of the corresponding month or "Invalid Month" if out of range.
     */
    public static void main(String[] args) {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            System.out.print("Enter a month number: ");
            int monthNumber = scanner.nextInt();

            System.out.println("Your corresponding month number: " + toMonth(monthNumber));

            return true;
        });
    }

    public static String toMonth(int number) {
        return switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
        };
    }
}
