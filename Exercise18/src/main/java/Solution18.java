/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
create scanner, string var for temperature type
create int vars for temperature input and for the converted temperature
create a bool var that signifies if the user pressed C or F
ask user if they want to convert to Celsius or Fahreinheit
ask user for the temperature to convert
calculate conversion
output conversion
 */

import java.util.Scanner;

public class Solution18 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String tempType;
        int tempInput, tempConversion;
        boolean isInputTempC;

        // Get input
        System.out.printf("Press C to convert from Fahrenheit to Celsius%nPress F to convert from Celsius to Fahrenheit%n");
        tempType = input.nextLine();
        isInputTempC = tempType.equalsIgnoreCase("C");

        System.out.printf("Please enter the temperature in %s:%n", !isInputTempC ? "Celsius" : "Fahrenheit");
        tempInput = input.nextInt();

        // Calculate Conversion
        if (isInputTempC) {
            // C to F
            tempConversion = (tempInput - 32) * (5 / 9);
        } else {
            // F TO C
            tempConversion = (tempInput * (9 / 5)) + 32;
        }

        // Output
        System.out.printf("The temperature in %s is %d", isInputTempC ? "Celsius" : "Fahrenheit", tempConversion);
    }
}