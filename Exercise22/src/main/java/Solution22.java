/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
create scanner input
create a list of numbers
ask user for three numbers
find the max using a function
output the max
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution22 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        System.out.println("Enter the first number: ");
        nums.add(input.nextInt());
        System.out.println("Enter the second number: ");
        nums.add(input.nextInt());
        System.out.println("Enter the third number: ");
        nums.add(input.nextInt());

        System.out.printf("The largest number is %d.", maxNum(nums));
    }

    public static int maxNum(List<Integer> numsList) {
        int max = 0;
        for (Integer n : numsList) {
            if (max == 0) {
                max = n;
            } else if (n > max) {
                max = n;
            }
        }

        return max;
    }
}