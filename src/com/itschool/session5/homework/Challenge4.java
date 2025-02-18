package com.itschool.session5.homework;

public class Challenge4 {
    /*
         Write a Java program where you declare two integer variables heightOne
         and heightTwo with any values. Use the ternary operator to determine
         the greater height and assign it to a variable maximumHeight. Print the result.
     */
    public static void main(String[] args) {
        int heightOne = 170;
        int heightTwo = 180;

        int maximumHeight = heightOne > heightTwo ? heightOne : heightTwo;
        System.out.println(maximumHeight);
    }
}
