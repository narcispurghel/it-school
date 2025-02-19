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
        //usingStreams();
        usingRegex();
    }

    // Or I can add a new catch block in ValidateInput class please tell me which method is better

    public static void usingStreams() {
        ValidateInput.runProgram((scanner) -> {
            System.out.print("Enter 10 numbers delimited by \" \": ");
            List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

            if (list.size() < 10) {
                System.out.println("Please enter 10 values!");
                return false;
            } else if (list.size() > 10) {
                System.out.println("You entered too many numbers (MAX=10)!");
                return false;
            }

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

    // I think I complicated my code using streams :(, but I've learned a lil bit of functional programming :)

    public static void usingRegex() {
        ValidateInput.runProgram((scanner) -> {
            System.out.print("Enter 10 numbers delimited by \" \": ");
            String[] splitInput = scanner.nextLine().split(" ");
            List<Integer> list = new ArrayList<>();

            for (String element : splitInput) {
                if (element.matches("[-+]?\\d+")) {
                    list.add(Integer.parseInt(element));
                } else {
                    System.out.println("Invalid value: " + element);
                }
            }

            if (list.size() < 10) {
                System.out.println("Please enter 10 values!");
                return false;
            } else if (list.size() > 10) {
                System.out.println("You entered too many numbers (MAX=10)!");
                return false;
            }

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

