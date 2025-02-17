package com.itschool.session7.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge4 {
    /*
        String Reverser
        Ask the user to enter a string. Print the reversed version of this string.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                System.out.println("Enter a string: ");
                String userString = scanner.nextLine();

                System.out.println(reverseString(userString));
                inputIsValid = true;
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }

    public static String reverseString(String initial) {
        String reversed = "";

        char[] chars = initial.toCharArray();
        for (int i = chars.length - 1; i >= 0; --i) {
            reversed += chars[i];
        }

        return reversed;
    }
}
