package it.Java_Advance.Java_A.Exe_30_Abstract_Classes;


class Circle extends Shape {
    public Circle(double radius) {
        super(radius, radius);
    }

    public double calculateArea() {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
