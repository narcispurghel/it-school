package com.itschool.session5.homework;

public class Challange7 {
    /*
        Write a Java program that determines the type of triangle based on its sides.
         Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
         Determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
     */
    public static void main(String[] args) {
        int sideOne = 2;
        int sideTwo = 2;
        int sideThree = 2;

        if (sideOne == sideTwo && sideOne == sideThree) {
            System.out.println("Equilateral");
        }
        else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
                System.out.println("Isosceles");
        } else {
                System.out.println("Scalene");
        }
    }
}
