package com.itschool.session5.homework;

public class Challange13 {
    /*
        Write a Java program where you declare an integer variable counter with a value of 0.
        Use the increment operator to increase the value of counter by 1 and then print the value.
        After that, use the decrement operator to decrease the value of counter by 1 and then print the value.
     */
    public static void main(String[] args) {
        int counter = 0;
        int increasedCounter = ++counter;
        int decreasedCounter = --counter;

        System.out.println(increasedCounter);
        System.out.println(decreasedCounter);
    }
}
