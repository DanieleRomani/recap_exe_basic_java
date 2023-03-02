package it.Exe_20;

public class Student {
    private String name;
    private int age;
    private int birthDate;
    private String surname;
    private int monthBirthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("invalid name");
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ) {
            System.out.println("Invalid age");}
        this.age = age;
    }

    public int getBirthDate() {
        return birthDate;
    }

     public void setBirthDate(int birthDate) {
        if (birthDate <= 0 && birthDate > 31 ) {
            System.out.println("invalidDate");
        }
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMonthBirthDay() {
        return monthBirthDay;
    }

    public void setMonthBirthDay(int monthBirthDay) {
        this.monthBirthDay = monthBirthDay;
    }
}
