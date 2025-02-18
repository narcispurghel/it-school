package com.itschool.session5.homework;

public class Challenge12 {
    /*
        Write a Java program where you declare two boolean variables isRaining and isSunny
        with values of true and false, respectively.
        Use the logical complement operator to negate the values of both variables and print the new values.
     */
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;

        boolean negatedIsRaining = !isRaining;
        boolean negatedIsSunny = !isSunny;

        System.out.println(negatedIsRaining);
        System.out.println(negatedIsSunny);
    }
}
