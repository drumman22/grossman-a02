/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
create input scanner, create constant correct pass
create var for password
ask user for password
compare/validate password with correct pass
output message
 */

import java.util.Scanner;

public class Solution15 {
    public static Scanner input = new Scanner(System.in);
    private static final String CORRECT_PASS = "abc$123";

    public static void main(String[] args) {
        String password;

        System.out.println("What is the password? ");
        password = input.nextLine();

        if (password.equals(CORRECT_PASS)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
