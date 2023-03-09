package it.Exe_26_Hending_Exception;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exe_26_Hendling_Exception {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (IOException e) {
            System.out.println("Error creating");
        }
    }
    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
            String userInputFileName = "test-file.txt";
        try {
            FileReader fileReader = new FileReader(userInputFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            int number = Integer.parseInt("house");
            System.out.println("The numb convertion is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Input not valid: " + e.getMessage());
        }
    }

    /**
     * 4:
     *
     * Write a try block that around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        int num1 = 10;
        String num2AsString = "0.0";
        try {
            int num2 = Integer.parseInt(num2AsString);
            System.out.println(num1/num2);
        } catch (NumberFormatException e) {
            System.out.println("Input not valid: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Impossible to divide by zero: " + e.getMessage());
        }
    }
}
