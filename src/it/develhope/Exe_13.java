package it.develhope;

import java.util.ArrayList;

public class Exe_13 {

        public static void main(String[] args) {
            exercise1();
            exercise2();
            exercise3();
        }

        /**
         * 1: Add 8 random integers to the array list
         * <p>
         * Print out the first item
         * <p>
         * Remove the first 3 items
         * <p>
         * The print out the first remaining item
         */
        public static void exercise1() {
            System.out.println("Exercise 1:");
            ArrayList<Integer> numbers = new ArrayList<>(9);
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            System.out.println(numbers);
            System.out.println(numbers.get(0));
            numbers.remove(0);
            numbers.remove(1);
            numbers.remove(2);
            System.out.println(numbers);
//
            //Write your code here
        }

        /**
         * 2: Create 2 Array Lists,
         * <p>
         * A list of strings called 'menuItems'
         * <p>
         * And a list of Doubles called 'menuPrices'
         * <p>
         * The indexes of these two lists correspond to eachother
         * <p>
         * Create a print statement to output the name and price of each
         * menu item correspond
         */
        public static void exercise2() {
            System.out.println("\nExercise 1:");
            ArrayList<String> menuItems = new ArrayList<>();
            menuItems.add("Pizza");
            menuItems.add("Olive Ascolane");
            menuItems.add("french fries");
            ArrayList<Double> menuPrices = new ArrayList<>();
            menuPrices.add(8.50);
            menuPrices.add(3.50);
            menuPrices.add(3.50);
            System.out.println(menuItems.get(0)+ ": " + menuPrices.get(0));
            System.out.println(menuItems.get(1)+ ": " + menuPrices.get(1));
            System.out.println(menuItems.get(2)+ ": " + menuPrices.get(2));
            //Write your code here
        }

    public Exe_13() {
    }

    /**
         * 3: I changed this to an int array after recording!
         * <p>
         * You'll still need to find the total but using [index] instead of .get(index)
         * <p>
         * Find the total sum of all items in the ArrayList below.
         * <p>
         * Use the + operator
         * <p>
         * print the total
         */
        public static void exercise3() {
            System.out.println("\nExercise 3:");
            int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

            int total = 0;
            for (int i = 0; i < items.length; i++) {
                total += items[i];
            }
            System.out.println("total sum:" + total);
            //Write your code here
        }
}
