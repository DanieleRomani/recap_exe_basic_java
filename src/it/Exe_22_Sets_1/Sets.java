package it.Exe_22_Sets_1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1:
     * <p>
     * 1. Add some numbers (1, 1, 5, 2, 1) to the set using the add() method.
     * 2. Remove '1' from  the set using the .remove(1)
     * 3. Print the set again to confirm the element was removed.
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        Set<Integer> ourSet = new HashSet<>();

        // Add some numbers using the add method
        // Your code

        ourSet.add(1);
        ourSet.add(1);
        ourSet.add(5);
        ourSet.add(2);
        ourSet.add(1);

        if (ourSet.containsAll(Set.of(5, 2, 1))) {
            System.out.println("1a. Set contains all numbers");
        } else {
            System.out.println("1a. Set does not contain all numbers");
        }

        System.out.println(ourSet);

        // Remove the element '1'
        // Your code
        ourSet.remove(1);

        System.out.println(ourSet);

        if (ourSet.contains(1)) {
            System.out.println("1b. The set still contains 1");
        } else {
            System.out.println("1b. The set does not contain 1");
        }
    }

    /**
     * 2:
     * <p>
     * Read the comments below and write comments on what you think our print statement will output!
     */
    private static void exercise2() {
        Set<String> fruitsSet = new HashSet<>();

        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        fruitsSet.add("kiwi");
        fruitsSet.add("mango");

        fruitsSet.addAll(fruitsSet);

        //2a. What will this output? [my output is: banana,orange,apple,kiwi,mango in no particular order because Set]
        System.out.println(fruitsSet);

        List<String> fruitsList = List.of("apple", "banana", "grapes", "pear", "mango");

        fruitsSet.addAll(fruitsList);

        //2b. What will this output? [my output is: Banana,orange,apple,kiwi,pear,mango,grapes in no particular order because List]
        System.out.println(fruitsSet);
    }

    /**
     * 3: Write code to solve the following problems
     */
    private static void exercise3() {
        // 3a. Find the min and max values in the Set below
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer number : numbers) {
            // Your code
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        // Riga di controllo
        // System.out.println("min value is= " + min + " " + "max value is= " + max);
        if (max != 10 || min != 1) {
            System.out.println("3a. Incorrect min or max values");
        }
//  "Hai modificato solamente l'implementazione del calcolo del min/max. Quella parte era corretta anche prima. " +
//  "Ciò che non è corretto è l'inizializzazione alla riga 90/91. Prova a stampare il min e il max calcolato per capire cosa " +
//  "sta succedendo ( mettiti alla riga 103) oppure leggi cosa ti sta dicendo IntelliJ sulle condizioni degli if." +
//  " Se hai dubbi scrivimi su discord C'è un errore nell'es3. Controlla le inizializzazioni di min e max alla riga 90/91"

        // 3b. Find which items from set a are also in set b, add these to itemsContainedInBothSets
        //     use the `contains` method and "nested" for loop
        Set<Integer> setA = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> setB = Set.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Set<Integer> itemsContainedInBothSets = new HashSet<>();

        // Your code
        for (Integer item : setA) {
            if (setB.contains(item)) {
                System.out.println(itemsContainedInBothSets.add(item));
            }
        }

        if (!itemsContainedInBothSets.equals(Set.of(5, 6, 7, 8, 9, 10))) {
            System.out.println("3b. Incorrect number of items in itemsContainedInBothSets");
        } else {
            System.out.println("3b. Correct number of items in itemsContainedInBothSets");
        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     */
    private static void exercise4() {
        Set<Integer> orderedNumbers = new TreeSet<>();
        orderedNumbers.addAll(Set.of(5, 3, 1, 2, 4, 6, 7, 8, 9, 10));
        // 4a. Find the min value in the TreeSet with as few loops as possible,
        //     you can use `break;` to exit the loop once you've found it!
        int min = Integer.MAX_VALUE;
        // Your code
        for (int num : orderedNumbers) {
            if (num < min) {
                min = num;
                if (min == 1) {
                    break;
                }
            }
        }
        if (min != 1) {
            System.out.println("4a. Incorrect min value");
        } else {
            System.out.println("4a. Correct min value");
        }
    }
}
