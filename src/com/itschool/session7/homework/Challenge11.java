package com.itschool.session7.homework;

import com.itschool.helper.ValidateInput;

public class Challenge11 {
    /*
        Write a program that prompts the user to enter numbers.
        Calculate the average of these numbers.
        If the user enters 0, break out of the input loop and then
        print the average of the numbers entered so far.
     */
    public static void main(String[] args) {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            int sum = 0;
            int count = 0;

            while (true) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (number == 0) {
                    double average = (double) sum / count;
                    System.out.println("Average: " + average);
                    break;
                }

                sum += number;
                ++count;
            }

            return true;
        });
    }
}
