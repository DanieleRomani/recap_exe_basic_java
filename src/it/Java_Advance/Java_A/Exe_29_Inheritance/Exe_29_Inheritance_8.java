package it.Java_Advance.Java_A.Exe_29_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Exe_29_Inheritance_8 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
    Dog ares = new Dog("boxer", 60,50);
    ares.printaAnimal();
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Bird picchio = new Bird(30, 22, 5);
        Fish nemo = new Fish("ClownFish", 2,0.1);

        picchio.printaAnimal();
        nemo.printaAnimal();
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Dog ares = new Dog("boxer", 110,50);
        Bird picchio = new Bird(50, 30, 0.15);
        Fish nemo = new Fish("ClownFish", 2,0.1);

        List<Double> speed = new ArrayList<>();

        speed.add(ares.runSpeedMetersPerSecond());
        speed.add(nemo.swimSpeedMetersPerSecond());
        speed.add(picchio.flySpeedMetersPerSecond());

        double maxSpeed = Double.MIN_VALUE;

        for (int i = 0; i < speed.size(); i++) {
            maxSpeed = Math.max(maxSpeed, speed.get(i));
        }
        if (maxSpeed == ares.runSpeedMetersPerSecond()){
            System.out.println(ares.getClass().getSimpleName() + " has the fastest movement speed in meters per second: \n"
                    + ares.runSpeedMetersPerSecond() + " m/s");
        } else if (maxSpeed == nemo.swimSpeedMetersPerSecond()){
            System.out.println(nemo.getClass().getSimpleName() + " has the fastest movement speed in meters per second: \n"
                    + nemo.swimSpeedMetersPerSecond() + " m/s");
        } else {
            System.out.println(picchio.getClass().getSimpleName() + " has the fastest movement speed in meters per second: \n"
                    + picchio.flySpeedMetersPerSecond() + " m/s");
        }
    }
}
