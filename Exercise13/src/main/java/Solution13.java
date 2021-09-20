/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
Create scanner input, int vars for years and compounds per year,
double vars for principal, interest rate and the result
Ask user for princiapl, interest rate and how many times compounded per year
calculate the expected value after # years with #% rate compounded # times
output information
 */

import java.util.Scanner;

public class Solution13 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int years, compoundedPerYear;
        double principal, interestRate, result;

        System.out.println("What is the principal? ");
        principal = input.nextDouble();
        System.out.println("What is the rate of interest? ");
        interestRate = input.nextDouble();
        System.out.println("What is the number of years? ");
        years = input.nextInt();
        System.out.println("What is the number of times the interest is compounded per year? ");
        compoundedPerYear = input.nextInt();

        // Calculate the result from interest after # years
        result = principal * Math.pow(1 + ((interestRate/100.0)/(double)compoundedPerYear), compoundedPerYear * years);
        double resultCeil = Math.ceil(result * 100.0) / 100.0;

        // Output
        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f", principal, interestRate, years, compoundedPerYear, resultCeil);
    }
}