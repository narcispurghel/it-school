package com.itschool.session5.homework;

import com.itschool.helper.ValidateInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challange3 {
    /*
        Write a Java program that declares an integer variable age
        with a value that can be inserted from keyboard.
        Print a statement saying "I am adult" if age is 18 or more,
        else print "I am a child", using the ternary operator.
     */
    public static void main(String[] args) {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            String userMaturity = age > 18 ? "I am adult" : "I am a child";
            System.out.println(userMaturity);

            return inputIsValid;
        });
    }
}
