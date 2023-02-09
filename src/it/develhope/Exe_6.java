package it.develhope;

public class Exe_6 {
        // Don't forget to use comments to clear things up if you need them!
        public static void main(String[] args) {
            exercise1();
            exercise2();
            exercise3();
            exercise4Bonus();
        }

        /**
         * 1: Create a double variable called value, create another double variable called valueSquareRoot
         *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
         */
        private static void exercise1() {
            System.out.println("Exercise 1:");
            double value = 5;
            double valueSquareRoot = Math.sqrt(value);
            System.out.println("The square root of " + value + " is " + valueSquareRoot);
            // Write your code here
        }

        /**
         * 2: See the code below
         *    Print out the highest value using Math.max()
         *    Then print out the lowest value using Math.min()
         *    You must put your variables into these methods and separate them with a comma
         */
        private static void exercise2() {
            System.out.println("\nExercise 2:");
            int valueA = 5;
            int valueB = 10;

            System.out.println("Max=" + Math.max(valueA, valueB));
            System.out.println("Min=" + Math.min(valueA, valueB));
            // Write your code here
        }

        /**
         * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
         */
        private static void exercise3() {
            System.out.println("\nExercise 3:");

            int totalMoney = 50;
            int costPerBurger = 9;
            int burgers = 3;
            int remainder = totalMoney % costPerBurger;
            System.out.println("Remainder=" + remainder);
            // Write your code here
        }

        /**
         * 4: BONUS! This is an optional task, but it is recommended you complete it
         * ----------------------------------------------------------------------
         * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
         * You do not need to write any code
         * Answers can be found in resources
         */
        private static void exercise4Bonus() {
            System.out.println("\nExercise 4 (Bonus!):");
            double ourValue = 4.5;

            // Replace with your comment 1
            // Restituisce il valore double più piccolo (il più vicino all'infinito negativo) che è maggiore
            // o uguale all'argomento ed è uguale a un numero intero matematico. Casi speciali -
            // Se il valore dell'argomento è già uguale a un numero intero matematico, il risultato è lo stesso dell'argomento.
            // Se l'argomento è NaN o un infinito o zero positivo o zero negativo, il risultato è lo stesso dell'argomento.
            // Se il valore dell'argomento è minore di zero ma maggiore di -1.0, il risultato è zero negativo.
            System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));

            // Replace with your comment 2
            // Restituisce il valore double più grande (il più vicino all'infinito positivo)
            // che è minore o uguale all'argomento ed è uguale a un numero intero matematico. Casi speciali:
            // Se il valore dell'argomento è già uguale a un numero intero matematico, il risultato è lo stesso dell'argomento.
            // Se l'argomento è NaN o un infinito o zero positivo o zero negativo, il risultato è lo stesso dell'argomento.
            System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));

            // Replace with your comment 3
            // è una funzione matematica incorporata che restituisce il long più
            // vicino all'argomento. Il risultato viene arrotondato a un numero intero aggiungendo 1/2 , prendendo
            // il valore minimo del risultato dopo aver aggiunto 1/2 e trasformando il risultato in type long.
            //Se l'argomento è NaN, il risultato è 0.
            //Se l'argomento è infinito negativo o minore o uguale al valore di Integer.MIN_VALUE,
            // il risultato è uguale al valore di Integer.MIN_VALUE.
            //Se l'argomento è infinito positivo o maggiore o uguale al valore di Integer.MAX_VALUE ,
            // il risultato è uguale al valore di Integer.MAX_VALUE.
            System.out.println(ourValue + " after using round=" + Math.round(ourValue));

            // Replace with your comment 4
            // prende due parametri o argomenti di tipo double. Il primo 4,5 è il valore che
            // voglio elevare a potenza 2. Il metodo ci restituisce il
            // valore a potenza di tipo double primitivo. (4,5^2)
            System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));

            // Replace with your comment 5
            // prende due parametri o argomenti di tipo double. Il primo 4,5 è il valore che
            // voglio elevare a potenza 3. Il metodo ci restituisce il
            // valore a potenza di tipo double primitivo. (4,5^3)
            System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));

            // Replace with your comment 6
            // Restituisce un valore random all'interno di un intervallo
            System.out.println(ourValue + " times random =" + Math.random() * ourValue);
        }

}
