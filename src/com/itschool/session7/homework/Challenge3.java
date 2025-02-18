package com.itschool.session7.homework;

import java.util.ArrayList;

public class Challenge3 {
    /*
        Counting Negative Numbers
        Given an array of integers, write a program to count and print
        the number of negative integers in the array.
     */
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, -3, -4, -5};

        countNegativeIntegers(array);
    }

    public static void countNegativeIntegers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number < 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
