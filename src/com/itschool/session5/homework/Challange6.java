package com.itschool.session5.homework;

public class Challange6 {
    /*
        Write a Java program where you declare an integer variable temperature.
        Assign a value to it and print "Hot" if the
        temperature is more than 30, "Warm" if the temperature is
        between 20 and 30, and "Cold" if it's less than 20.
     */
    public static void main(String[] args) {
        int temperature = 19;

        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature > 19) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
