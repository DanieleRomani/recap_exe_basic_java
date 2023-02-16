package it.develhope;

public class Exe_3 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        String first = "D";
        System.out.print(first);

        String second = "R" ;
        System.out.print(second);

        String third = "T";
        System.out.print(third);
        // Write your code here
        // System.out.print(first + " " + second + " " + third);
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        System.out.println("My age is " + 34);

        boolean hadLunchToday = true;
        double lunchCost = 4.99;

        System.out.println("Lunch cost=" + " " + hadLunchToday);
        System.out.println("Has Eaten lunch=" + " " + lunchCost);

        // Write your code here
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        char favouriteLetter = 'n';
        System.out.print("My favourite letter=");
        System.out.println(favouriteLetter);
        // Write your code here

        char favouriteLetter2 = 68;
        System.out.print("My favourite letter=");
        System.out.println(favouriteLetter2);
    }




}
