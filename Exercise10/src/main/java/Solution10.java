/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create scanner
create constant TAX_RATE
create a list of doubles
create vars for subtotal, tax, and total
ask for the price and quanity by looping, add the prices to list
add everything in list for subtotal
calculate tax and total
output subtotal, tax and total
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution10 {
    public static Scanner input = new Scanner(System.in);
    private static final double TAX_RATE = 5.5/100;

    public static void main(String[] args) {
        List<Double> itemPrices = new ArrayList<Double>();
        double subtotal = 0, tax, total;

        // Ask for the price and quantity three times, add to itemPrices list
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter the price of item %d:%n", i + 1);
            itemPrices.add(input.nextDouble());
            System.out.printf("Enter the quantity of item %d:%n", i + 1);
            // Set list[i] to List[i] * quantity
            itemPrices.set(i, itemPrices.get(i) * (input.nextInt()));
        }

        // Iterate itemPrices adding to subtotal
        for (Double price : itemPrices) {
            subtotal += price;
        }
        tax = subtotal * TAX_RATE;
        total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);
    }
}
