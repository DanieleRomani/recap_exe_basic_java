package it.Exe_31_Obj.Class_Method_Overriding_Equals_toString.Person_For_Exe2;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return String.format("Date: " + " Name: " + name
                + " Age: " + age
                + " Address: " + address);
    }
    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(age) + address.hashCode();
    }
}
