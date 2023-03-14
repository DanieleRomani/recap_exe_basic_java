package it.Exe_29_Inheritance;

public class Fish extends Animal{
    private String spices;
    public Fish(String spices, double height, double weight) {
        super(height, weight);
        this.spices = spices;
    }
    public double swimSpeedMetersPerSecond(){
        return getWeight() * 2;
    }

    public String getSpices() {
        return spices;
    }

    public void setSpices(String spices) {
        this.spices = spices;
    }
    @Override
    public void printaAnimal() {
        System.out.println(this.spices + " - " + getWeight() + " - " + getHeight());
    }
}
