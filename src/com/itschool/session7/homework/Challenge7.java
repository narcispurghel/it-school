package com.itschool.session7.homework;

import com.itschool.helper.ValidateInput;

public class Challenge7 {
    /*
        Create a program where the user is prompted to guess a predefined number.
        After each guess, the program should inform the user if the guess is too high or too low.
        The program should keep prompting the user until they guess correctly. Using a do-while loop,
        ensure the user is always asked at least once.
     */
    public static void main(String[] args) {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            int predefined = 5;
            int guess = 0;

            do {
                System.out.print("Guess the number!\nYour guess: ");
                guess = scanner.nextInt();

                if (guess > predefined) {
                    System.out.println("Your guess is too high!");
                } else if (guess < predefined) {
                    System.out.println("Your guess is too low!");
                } else {
                    System.out.println("Your guess is correct! You won! :)");
                }
            } while (guess != predefined);

            return true;
        });
    }
}
