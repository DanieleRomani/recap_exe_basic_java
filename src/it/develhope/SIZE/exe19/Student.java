package it.develhope.SIZE.exe19;

public class Student {

    String name;
    int age;

    public Student(String name, int age) {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }
/**
 * 2: Add 3 more constructors to student, remember you need to change the parameters
 *    a constructor accepts in order to allow multiple.
 *
 *    a Constructor that takes only a student's age
 *    a Constructor that takes only a student's name
 *    a Constructor that does not take any parameters
 */
    public Student(int age) {
    System.out.println("Constructing!");
    this.age = age;
    System.out.println("Constructed!");
    }
    public Student(String name) {
        System.out.println("Constructing!");
        this.name = name;
        System.out.println("Constructed!");
    }
    public Student() {
    }
}
