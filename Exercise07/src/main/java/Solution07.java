/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create input scanner
create constant var
create vars for len, width, area and area in meters
ask for length and width
calculate area and convert area to meters
output information
*/

import java.util.Scanner;

public class Solution07 {
    private static final double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len, width, area;
        double areaInMeter;

        // Request length and width
        System.out.println("What is the length of the room in feet?");
        len = input.nextInt();
        System.out.println("What is the width of the room in feet?");
        width = input.nextInt();

        // Math
        area = len * width;
        areaInMeter = area * CONVERSION_FACTOR;

        // Output
        System.out.printf("You entered dimensions of %d feet by %d feet.%nThe area is%n%d square feet%n%.3f square meters", len, width, area, areaInMeter);
    }
}