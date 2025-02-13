package com.itschool.session4.homework;

public class Challange5 {
    /*
        Create a Java program that demonstrates the use of each compound assignment operator with integers.
     */
    public static void main(String[] args) {
        int number = 10;

        System.out.println("Initial value: " + number);

        number += 2;
        System.out.println("Compound addition assignment operator +=: " + number);

        number -= 2;
        System.out.println("Compound subtraction assignment operator -=: " + number);

        number *= 2;
        System.out.println("Compound multiplication assignment operator *=: " + number);

        number /= 2;
        System.out.println("Compound division assignment operator /=: " + number);

        number %= 2;
        System.out.println("Compound modulo assignment operator %=: " + number);
    }
}
