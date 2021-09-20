/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
create scanner input
create constants for Wisconsin tax rate and Illinois tax rate
Create doubles vars for orderPrice, tax and taxRate = 0;
Create string vars for state and county
Ask the user what the order's price is and what state they are in
If the user is in Wisconsin then as for the county
Change the taxrate based on the state and county (wisconsin only)
calculate the tax and add it to orderprice
Create a string with tax info so you can use a ternary operation with it
Output information
 */

import java.util.Scanner;

public class Solution20 {
    public static Scanner input = new Scanner(System.in);
    private static final double WI_TAX_RATE = 5/100.0;
    private static final double IL_TAX_RATE = 8/100.0;

    public static void main(String[] args) {
        double orderPrice, tax, taxRate = 0;
        String state, county;

        // Input
        System.out.println("What is the order amount?");
        orderPrice = Double.parseDouble(input.nextLine());
        System.out.println("What state do you live in?");
        state = input.nextLine();

        // If/elif/else branch for finding correct tax
        if (state.equals("Wisconsin")) {
            taxRate = WI_TAX_RATE;
            System.out.println("What county do you live in?");
            county = input.nextLine();

            if (county.equals("Eau Claire")) {
                taxRate += 0.5/100.0;
            } else if (county.equals("Dunn")) {
                taxRate += 0.4/100.0;
            }
        } else if (state.equals("Illinois")) {
            taxRate = IL_TAX_RATE;
        }

        // Calculation
        tax = taxRate * orderPrice;
        orderPrice += tax;
        String taxString = String.format("The tax is $%.2f.%n", Math.ceil(tax * 100.0) / 100.0);

        System.out.printf("%sThe total is $%.2f.", tax != 0 ? taxString:"", Math.ceil(orderPrice * 100.0) / 100.0);
    }
}