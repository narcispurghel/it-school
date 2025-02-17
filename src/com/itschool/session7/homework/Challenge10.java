package com.itschool.session7.homework;

import com.itschool.helper.ValidateInput;

public class Challenge10 {
    /*
        Create a menu-driven program where the user is presented with options:

            Print "Hello World"
            Print the user's name.
            Exit.

        Based on the user's input, perform the necessary action.
        Once an action is completed, show the menu again, unless the user chooses the Exit option.
        Use jump statements to control the flow of the program.
     */
    public static void main(String[] args) {
        ValidateInput.runProgram((inputIsValid, scanner) -> {
            System.out.println("Register!");
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            PARENT_LOOP:
            while (true) {
                System.out.println(
                        "Select an option:" +
                                "\n(1) Print \"Hello World\"" +
                                "\n(2) Print the user's name." +
                                "\n(3) Exit."
                );

                int option = scanner.nextInt();

                switch (option) {
                    case 1 -> System.out.println("Hello World");
                    case 2 -> System.out.println(name);
                    case 3 -> {
                        System.out.println("Exiting...");
                        break PARENT_LOOP;
                    }
                    default -> {
                        System.out.println("Please enter a valid choice!");
                        continue PARENT_LOOP; // Unnecessary but I don't know where to use continue in this challenge
                    }
                }
            }

            return true;
        });
    }
}
