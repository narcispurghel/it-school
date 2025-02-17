package com.itschool.session7.homework;

import java.util.ArrayList;

public class Challenge3 {
    /*
        Counting Negative Numbers
        Given an array of integers, write a program to count and print the number of negative integers in the array.
     */
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(-3);
        integerList.add(-8);

        countNegativeIntegers(integerList);
    }

    public static void countNegativeIntegers(ArrayList<Integer> integerArrayList) {
        int count = 0;
        for (Integer number : integerArrayList) {
            if (number < 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
