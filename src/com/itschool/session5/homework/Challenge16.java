package com.itschool.session5.homework;

import java.util.Scanner;

public class Challenge16 {
    /*
        Write a Java program that takes a double variable score representing a student’s score on a test.
        Use “if-else if” conditional statements to classify the score into letter grades A, B, C, D, or F
        according to the following scale:

            A: 90-100
            B: 80-89
            C: 70-79
            D: 60-69
            F: 0-59

         Print the resulting letter grade.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;

        do {
            try {
                System.out.print("Enter student's test score: ");
                double studentScore = scanner.nextDouble();

                System.out.println(classifyScore(studentScore));
                inputIsValid = true;
            }
            catch (RuntimeException e) {
                System.err.println("Error: Value not accepted");
            }

        } while (!inputIsValid);
    }

    private static char classifyScore(double score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else if (score >= 0 && score <= 59) {
            return 'F';
        } else {
            throw new RuntimeException("Score must be in range 0-100");
        }
    }
}
