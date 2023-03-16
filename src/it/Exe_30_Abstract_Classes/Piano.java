package it.Exe_30_Abstract_Classes;

class Piano extends Instrument {
    public Piano(String name, String brand) {
        super(name, brand);
    }

    public void play() {
        System.out.println("Playing " + name + " piano by " + brand);
    }
}