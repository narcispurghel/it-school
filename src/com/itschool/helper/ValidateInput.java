package com.itschool.helper;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;

public class ValidateInput {

    public static void runProgram(Function<Scanner, Boolean> businessLogic) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                inputIsValid = businessLogic.apply(scanner);
            }
            catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Error: Value not accepted");
            }
        } while (!inputIsValid);
    }

}