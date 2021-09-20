/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
Create scanner, int var age
Ask user for age
Print output but use a ternary operator to change its meaning based on age
 */

import java.util.Scanner;

public class Solution16 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int age;

        System.out.println("What is your age? ");
        age = input.nextInt();

        System.out.printf("You are %sold enough to legally drive.", age >= 16 ? "" : "not ");
    }
}