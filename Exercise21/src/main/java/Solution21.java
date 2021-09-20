/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
create input scanner
create int month and a string to hold the name of the corresponding month
ask user the number of the month
use a switch case to get the monthName
output month name
 */

import java.util.Scanner;

public class Solution21 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int month;
        String monthName;

        System.out.println("Please enter the number of the month: ");
        month = input.nextInt();

        monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
        };
        
        System.out.printf("The name of the month is %s.", monthName);
    }
}