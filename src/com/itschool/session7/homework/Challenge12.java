package com.itschool.session7.homework;

import com.itschool.helper.ValidateInput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge12 {
    /*
        Create a program that asks the user for 10 numbers.
        Print the sum of all numbers that are greater than 5.
        If the user enters a number less than or equal to 5,
        use the continue statement to skip the addition for that number.
     */
    public static void main(String[] args) {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            System.out.println("Enter 10 numbers delimited by \" \": ");
            List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

            int sum = 0;

            for (Integer number: list) {
                if (number <= 5) {
                    continue;
                }

                sum += number;
            }

            System.out.println(sum);

            return true;
        });
    }
}
