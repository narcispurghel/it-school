package com.itschool.session7.homework;

public class Challenge8 {
    /*
        Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
     */
    public static void main(String[] args) {
        int fNMinus2 = 0; // F0 always 0
        int fNMinus1 = 1; // F1 always 1
        int fN;

        for (int i = 0; i < 10 ; ++i) {
            if (i > 1) {
                fN = fNMinus1 + fNMinus2;
                fNMinus2 = fNMinus1;
                fNMinus1 = fN;
                System.out.println(fN);
            } else {
                System.out.println(i);
            }
        }
    }
}
