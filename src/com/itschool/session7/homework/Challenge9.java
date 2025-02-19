package com.itschool.session7.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge9 {
    /*
        Given an array of integers, write a program that prints each number in the array
        followed by "Even" if the number is even, or "Odd" if the number is odd.
        Utilize a for-each loop for this task.
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Array with parity: ");
        for (int number: array) {
            String parity = number % 2 == 0 ? "Even" : "Odd";
            System.out.println(number + ": " + parity);
        }
    }
}
