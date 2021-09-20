/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Pseudocode --
create input scanner
create variables for age, retireAge, and the difference between retireAge and age (named retireAgeDif)
get input for age and retireAge
process age difference
output the years left to retirement
create object to get instance of date
add age differnce to date
output new date that resembled retired year
 */

import java.util.Scanner;
import java.util.Calendar;

public class Solution06 {
   public static void main(String[] arg) {
       Scanner input = new Scanner(System.in);
       int age, retireAge, retireAgeDif;

       // Request age and wanted retire age
       System.out.println("What is your current age?");
       age = input.nextInt();
       System.out.println("At what age would you like to retire?");
       retireAge = input.nextInt();

       // Output age difference to becomming retired
       retireAgeDif = retireAge - age;
       System.out.printf("You have %d years left until you can retire.%n", retireAgeDif);

       // Create calendar obj, output the year to be retired
       Calendar date = Calendar.getInstance();
       date.add(Calendar.YEAR, retireAgeDif);
       System.out.println(date.get(Calendar.YEAR));
   }
}
