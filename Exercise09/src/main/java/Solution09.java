/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create input scanner
create int vars len, width, area, and gallonsneeded
get input for length and width
calculate area and gallons needed
output information
 */

import java.util.Scanner;

public class Solution09 {
    static Scanner input = new Scanner(System.in);
    private static final int SQRFT_PER_GALLON = 350;

    public static void main(String[] args) {
        int len, width, area, gallonsNeeded;

        // Get input
        System.out.println("What is the length of the room?");
        len = input.nextInt();
        System.out.println("What is the width of the room?");
        width = input.nextInt();

        // Calculate
        area = len * width;
        gallonsNeeded = (int)Math.ceil(area / (double)SQRFT_PER_GALLON);

        // Output
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", gallonsNeeded, area);
    }
}
