/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
Create scanner input, create constant for WI TAX RATE
Create double vars orderPrice and tax
Create string to resemble a state
Get input for the order's price and what state
Check if the state is WI, if so then tax it, displaying extra info
Output the total
 */

import java.util.Scanner;

public class Solution14 {
    public static Scanner input = new Scanner(System.in);
    private static final double WI_TAX_RATE = 5.5/100.0;

    public static void main(String[] args) {
        double orderPrice, tax;
        String state;

        // Input
        System.out.println("What is the order amount? ");
        orderPrice = Double.parseDouble(input.nextLine());
        System.out.println("What is the state? ");
        state = input.nextLine();

        // Calculations
        if (state.equals("WI")) {
            tax = orderPrice * WI_TAX_RATE;
            // Output extra info
            System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%n", orderPrice, tax);
            orderPrice += tax;
        }

        System.out.printf("The total is $%.2f.", orderPrice);
    }
}
