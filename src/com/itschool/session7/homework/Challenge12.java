package com.itschool.session7.homework;

import com.itschool.helper.ValidateInput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Challenge12 {
    /*
        Create a program that asks the user for 10 numbers.
        Print the sum of all numbers that are greater than 5.
        If the user enters a number less than or equal to 5,
        use the continue statement to skip the addition for that number.
     */
    public static void main(String[] args) {
        //usingTryCatch();
        usingRegex();
    }

    // Or I can add a new catch block in ValidateInput class please tell me which method is better

    public static void usingTryCatch() {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            System.out.print("Enter 10 numbers delimited by \" \": ");
            try {
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
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
                return false;
            }
        });
    }

    // I think I complicated my code using streams :(, but I've learned a lil bit of functional programming :)

    public static void usingRegex() {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            System.out.print("Enter 10 numbers delimited by \" \": ");
            Stream<String> stream = Arrays.stream(scanner.nextLine().split(" "));
            List<Integer> list = new ArrayList<>();

            stream.forEach( element -> {
                if (element.matches("[-+]?\\d+")) {
                    list.add(Integer.parseInt(element));
                } else {
                    System.out.println("Invalid value: " + element);
                }
            });

            if (list.size() < 10) {
                System.out.println("Please enter 10 valid values!");
                return false;
            } else if (list.size() > 10) {
                System.out.println("You entered too many numbers (MAX=10)");
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

