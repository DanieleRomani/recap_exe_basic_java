package it.Exercise_Complete.Exe_Rip_5;

public class Items {
    private String name;
    private double value;

    public Items(String name, double value) {
        this.name = name;
        this.value = value;
    }
   public Items() {
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
