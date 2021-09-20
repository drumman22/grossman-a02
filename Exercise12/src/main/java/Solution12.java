/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
Create scanner input, int vars for principal and years,
double vars for interest rate and the result
Ask user for princiapl and interest rate
calculate the expected value after # years with #% rate
output information
 */

import java.util.Scanner;

public class Solution12 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int principal, years;
        double interestRate, result;

        System.out.println("Enter the principal: ");
        principal = input.nextInt();
        System.out.println("Enter the rate of interest: ");
        interestRate = input.nextDouble();
        System.out.println("Enter the number of years: ");
        years = input.nextInt();

        // Calculate the result from interest after # years
        result = principal * (1 + ((interestRate/100) * years));
        double resultCeil = Math.ceil(result * 100.0) / 100.0;

        // Output
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.%n", years, interestRate, resultCeil);
    }
}
