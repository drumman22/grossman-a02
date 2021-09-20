/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

import java.util.Scanner;

public class Solution17 {
    public static Scanner input = new Scanner(System.in);
    private static final double ALC_RATIO_M = 0.73;
    private static final double ALC_RATIO_W = 0.66;
    private static final double BAC_LIMIT = 0.08;

    public static void main(String[] args) {
        int gender, alcohol, weight, hours;
        double bac;

        gender = getInput("Enter a 1 if you are male or a 2 if you are female: ");
        alcohol = getInput("How many ounces of alcohol did you have? ");
        weight = getInput("What is your weight, in pounds? ");
        hours = getInput("How many hours has it been since your last drink? ");

        bac = ((alcohol * 5.14) / (weight * (gender == 1 ? ALC_RATIO_M : ALC_RATIO_W))) - (0.015 * hours);

        System.out.printf("Your BAC is %f%nIt is %slegal for you to drive.", bac, bac >= BAC_LIMIT ? "not ":"");
    }

    // Get input and validate it
    public static int getInput(String message) {
        System.out.println(message);
        return validateIntInput(input.nextLine(), message);
    }

    private static int validateIntInput(String in, String message) {
        int response;
        try {
            response = Integer.parseInt(in);
        } catch (Exception e) {
            System.out.println("Response must be an integer!");
            System.out.println(message);
            return validateIntInput(input.nextLine(), message);
        }

        return response;
    }
}