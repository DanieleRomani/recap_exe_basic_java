package it.Exe_29_Inheritance;

public class Bird extends Animal{
    private double wingSpan;
    public Bird(double wingSpan,double height, double weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double flySpeedMetersPerSecond(){
        return getWingSpan() * 4;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    @Override
    public void printaAnimal() {
        System.out.println(this.wingSpan + " - " + getWeight() + " - " + getHeight());
    }
}
