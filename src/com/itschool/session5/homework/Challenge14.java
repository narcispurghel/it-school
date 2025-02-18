package com.itschool.session5.homework;

public class Challenge14 {
    /*
        Write a Java program where you declare an integer variable total with a value of 100.
        Use the compound assignment operator to decrease the total by 20 and then print the value.
        Next, use another compound assignment operator to multiply the total by 2 and then print the value.
     */
    public static void main(String[] args) {
        int number = 100;
        number -= 20;
        number *= 2;

        System.out.println(number);
    }
}
