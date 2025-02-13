package com.itschool.helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetVariablesFromConsoleStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {

            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }

        } while (!inputIsValid);
    }
}
