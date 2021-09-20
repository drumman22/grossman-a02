/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
Create input scanner, create vars for exchangeRate, euros and dollars
Ask for how many euros and the exchange rate
Calculate the conversion to us dollars
Calculate the rounded up dollars
Output information
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution11 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double exchangeRate, euros, dollars;

        // Get euros and exchange rate
        System.out.println("How many euros are you exchanging? ");
        euros = input.nextDouble();
        System.out.println("What is the exchange rate? ");
        exchangeRate = input.nextDouble();

        // Calculate
        dollars = exchangeRate * euros;
        double roundedDollars = Math.ceil(dollars * 100.0) / 100.0;

        // Output
        System.out.printf("%.2f euros at an exchange rate of %f is%n%.2f U.S. dollars.", euros, exchangeRate, roundedDollars);

    }
}
