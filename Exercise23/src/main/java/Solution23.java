/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
create scanner input
have helper functions to get and validate input, returning a boolean
use the tree to create the if/else structure
output the information the user needs
 */

import java.util.Scanner;

public class Solution23 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        if (getInput("Is the car silent when you turn the key?")) {
            if (getInput("Are the battery terminals corroded?")) {
                System.out.println("Clean the terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            if (getInput("Does the car make a slicking noise?")) {
                System.out.println("Replace the battery.");
            } else {
                if (getInput("Does the car crank up but fail to start?")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    if (getInput("Does the engine start and then die?")) {
                        if (getInput("Does your car have fuel injection?")) {
                            System.out.println("Get it in for service");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing");
                        }
                    } else {
                        System.out.println("This should not be possible");
                    }
                }
            }
        }
    }

    public static boolean getInput(String message) {
        System.out.println(message);
        return validateInput(input.nextLine(), message);
    }

    private static boolean validateInput(String in, String message) {
        if (in.equalsIgnoreCase("y")) {
            return true;
        } else if (in.equalsIgnoreCase("n")) {
            return false;
        }

        System.out.println("(Response must be Y or N)");
        System.out.println(message);
        return validateInput(input.nextLine(), message);
    }
}