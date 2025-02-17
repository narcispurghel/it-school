package com.itschool.helper;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BiFunction;

public class ValidateInput {

    public static void runProgram(BiFunction<Boolean, Scanner, Boolean> businessLogic) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                inputIsValid = businessLogic.apply(inputIsValid, scanner);
            }
            catch (InputMismatchException e) {
                System.err.println("Error: Value not accepted");
                scanner.nextLine();
            }
        } while (!inputIsValid);
    }

}