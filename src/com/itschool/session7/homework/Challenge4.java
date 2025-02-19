package com.itschool.session7.homework;

import com.itschool.helper.ValidateInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge4 {
    /*
        String Reverser
        Ask the user to enter a string. Print the reversed version of this string.
     */
    public static void main(String[] args) {
        ValidateInput.runProgram((scanner) -> {
            System.out.print("Enter a string: ");
            String userString = scanner.nextLine();

            System.out.println(reverseString(userString));

            return true;
        });
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
