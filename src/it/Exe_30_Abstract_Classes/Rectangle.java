package it.Exe_30_Abstract_Classes;

class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }
    public double calculateArea() {
        return height * width;
    }
}
