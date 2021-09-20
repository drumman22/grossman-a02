/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
create scanner input
create int vars for weight and height
create double for bmi
ask for weight and height
calculate bmi
output their bmi
output whether they are underweight, overweight or at good weight standing
 */

import java.util.Scanner;

public class Solution19 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int weight, height;
        double bmi;

        // input
        height = getInput("What is your height in inches?");
        weight = getInput("What is your weight in pounds?");

        // Calculate BMI
        bmi = (weight / (double)(height * height)) * 703;

        // Output
        System.out.printf("Your BMI is %.1f.%n", bmi);

        if (bmi > 25) {
            System.out.println("You are overweight. You should see your doctor");
        } else if (bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor");
        } else {
            System.out.println("You are within the ideal weight range.");
        }
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
            System.out.println("Response must be an integer! Try again..");
            System.out.println(message);
            return validateIntInput(input.nextLine(), message);
        }

        return response;
    }
}