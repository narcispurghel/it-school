package com.itschool.session7.homework;

import com.itschool.helper.ValidateInput;

public class Challenge6 {
    /*
        Write a program that asks the user to enter numbers.
        The program should continue prompting the user until they enter -1.
        After they enter -1, print the sum of all numbers entered (excluding -1).
     */
    public static void main(String[] args) {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            int currentNumber = 0;
            int sum = 0;

            while (currentNumber != -1) {
                System.out.print("Enter a number: ");
                currentNumber = scanner.nextInt();
                sum = currentNumber != -1 ? sum + currentNumber : sum;
            }

            System.out.println(sum);

            return true;
        });
    }
}
