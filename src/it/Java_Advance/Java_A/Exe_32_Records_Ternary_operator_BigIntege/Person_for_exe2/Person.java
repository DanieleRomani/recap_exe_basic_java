package it.Java_Advance.Java_A.Exe_32_Records_Ternary_operator_BigIntege.Person_for_exe2;

public record Person(String name, int age, String address) {
       @Override
        public String toString () {
        return String.format("Date person = " + " Name: " + name + " Age: " + age + " Address: " + address);
    }
}
