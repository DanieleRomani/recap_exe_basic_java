package it.Java_Advance.Java_A.Exe_32_Records_Ternary_operator_BigIntege;

import it.Java_Advance.Java_A.Exe_32_Records_Ternary_operator_BigIntege.Person_for_exe2.Person;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Records_Ternary_operator_BigIntege {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

       // generate a random number
        double x = Math.random() * 100;

        // Using ternary operator
        String output = x >= 50 ? "x is greater than or equal to 50" : "x is less than 50";

        // Print the output
        System.out.println("My random numb is : " + x + " - "
                + "My output is : " + output);

    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person = new Person("Daniele", 25, "Viale Winston Churchill");
        System.out.println(person);
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInteger = new BigInteger("100000000000000");
        BigDecimal bigDecimal = new BigDecimal("1000000000.1000");

        BigInteger dividedBigInteger = bigInteger.divide(BigInteger.valueOf(3));
        BigDecimal dividedBigDecimal = bigDecimal.divide(BigDecimal.valueOf(Math.PI));

        System.out.println("Divided BigInteger: " + dividedBigInteger);
        System.out.println("Divided BigDecimal: " + dividedBigDecimal);
    }
}
