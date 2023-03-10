package it.Exe_27_Enums;

import java.util.Scanner;

public class Exe_27_Enums_6 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        // Define the Seasons enum
        enum Seasons {
            SPRING,
            SUMMER,
            FALL,
            WINTER
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a season (SPRING, SUMMER, FALL, WINTER): ");
        String input = scanner.nextLine().toUpperCase();

        Seasons season;
        try {
            season = Seasons.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input, please try again.");
            return;
        }

        switch (season) {
            case SPRING:
                System.out.println("March, April, May");
                break;
            case SUMMER:
                System.out.println("June, July, August");
                break;
            case FALL:
                System.out.println("September, October, November");
                break;
            case WINTER:
                System.out.println("December, January, February");
                break;
            default:
                System.out.println("Invalid season.");
                break;
        }

    }


    /**
     * 3:
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light
     * as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        enum TrafficLight {
            GREEN,
            YELLOW,
            RED
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a season (GREEN, YELLOW, RED): ");
        String input = scanner.nextLine().toUpperCase();

        TrafficLight trafficLight;
        try {
            trafficLight = TrafficLight.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input, please try again.");
            return;
        }

        switch (trafficLight) {
            case GREEN:
                System.out.println("YELLOW");
                break;
            case YELLOW:
                System.out.println("RED");
                break;
            case RED:
                System.out.println("GREEN");
                break;

            default:
                System.out.println("Invalid state");
        }


    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        boolean isWeekend = true;
        for (Days day : Days.values()) {
            if (day == Days.MONDAY) {
                System.out.println(day.name() + " is Weekend ? " + !isWeekend);
            } else if (day == Days.TUESDAY) {
                System.out.println(day.name() + " is Weekend ? " + !isWeekend);
            } else if (day == Days.WEDNESDAY) {
                System.out.println(day.name() + " is weekends ? " + !isWeekend);
            } else if (day == Days.THURSDAY) {
                System.out.println(day.name() + " is weekends ? " + !isWeekend);
            } else if (day == Days.FRIDAY) {
                System.out.println(day.name() + " is weekends ? " + !isWeekend);
            } else if (day == Days.SATURDAY) {
                System.out.println(day.name() + " is weekends ? " + isWeekend);
            } else {
                System.out.println(day.name() + " is weekends ? " + isWeekend);
            }
        }
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private enum Operator {ADD, SUBTRACT, MULTIPLY, DIVIDE}

    ;

    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        operations(num1, num2);
    }

    public static void operations(double num1, double num2) {
        System.out.println("numbers of operations : " + num1 + " - " + num2);
        for (Operator operator : Operator.values()) {
            if (operator == Operator.ADD){
                System.out.println(operator.name() + " operation: " + (num1 + num2));
            } else if (operator == Operator.SUBTRACT){
                System.out.println(operator.name() + " operation: " + (num1 - num2));
            } else if (operator == Operator.MULTIPLY){
                System.out.println(operator.name() + " operation: " + (num1 * num2));
            } else {
                System.out.println(operator.name() + " operation: " + (num1 / num2));
            }
        }

    }
}
