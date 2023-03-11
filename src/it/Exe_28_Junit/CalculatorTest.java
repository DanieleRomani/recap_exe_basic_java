package it.Exe_28_Junit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        Calculator calculator = new Calculator();
        // Positive numbers
        Assert.assertEquals(calculator.add(3, 5), 8);
        Assert.assertEquals(calculator.subtract(5, 3), 2);

        // Test case 2: negative numbers
        Assert.assertEquals(calculator.add(-5, -3), -8);
        Assert.assertEquals(calculator.subtract(-5, -3), -2);

        // Test case 3: zero
        Assert.assertEquals(calculator.add(0, 0), 0);
        Assert.assertEquals(calculator.subtract(0, 0), 0);
    }


    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Calculator calculator = new Calculator();
        // Test case 1: positive numbers
        Assert.assertEquals(calculator.multiply(3, 5), 15);
        Assert.assertEquals(calculator.divide(15, 3), 5);

        // Test case 2: negative numbers
        Assert.assertEquals(calculator.multiply(-5, -3), 15);
        Assert.assertEquals(calculator.divide(-15, -3), 5);

        // Test case 3: zero
        Assert.assertEquals(calculator.multiply(0, 0), 0);
        Assert.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        Calculator calculator = new Calculator();

        // Test case 1: base and exponent are zero
        Assert.assertEquals(calculator.power(0, 0), 1.0);

        // Test case 2: base is positive and exponent is zero or one
        Assert.assertEquals(calculator.power(2.0,0.0),1.0);
        Assert.assertEquals(calculator.power(2.0, 1.0), 2.0);

        // Test case 3: base is negative and exponent is zero or one
        Assert.assertEquals(calculator.power(-2, 0), 1.0);
    }

}
