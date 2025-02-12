package com.itschool.session4.homework;

public class Challange4 {
    /*
        Write a Java program that uses both the increment (++)
        and decrement (--) operators in a loop to count up to 10 and then back down to 1.
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                for (int j = i; j >= 1; j--) {
                    System.out.println(j);
                }
            } else {
                System.out.println(i);
            }
        }
    }
}
