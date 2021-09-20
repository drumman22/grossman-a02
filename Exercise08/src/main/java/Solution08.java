/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jason Grossman
 */

/*
-- Psuedocode --
create scanner input
create vars for people, pizzas, slices per pizza, total slices (pizzas * slices per pizza),
and slices per person (totalslices / people)
get input for people, pizzas and slices per pizza
validate that input is an integer
calculate total slices and slicers per person
output information
 */

import java.util.Scanner;

public class Solution08 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int people, pizzas, slicesPerPizza, totalSlices, slicesPerPerson;

        people = getInput("How many people? ");
        pizzas = getInput("How many pizzas do you have? ");
        slicesPerPizza = getInput("How many slices per pizza? ");

        totalSlices = slicesPerPizza * pizzas;
        slicesPerPerson = totalSlices / people;

        System.out.printf("%d people with %d pizzas (%d Slices)%n", people, pizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.%n", slicesPerPerson);
        System.out.printf("There are %d leftover pieces.", totalSlices % people);
    }

    // Get input and validate it
    public static int getInput(String message) {
        System.out.println(message);
        return validateIntInput(input.nextLine(), message);
    }

    private static int validateIntInput(String in, String message) {
        int response;
        try {
            response = Integer.parseInt(in);
        } catch (Exception e) {
            System.out.println("Response must be an integer! Try again..");
            System.out.println(message);
            return validateIntInput(input.nextLine(), message);
        }

        return response;
    }
}
