package it.Java_Advance.Java_A.Exe_30_Abstract_Classes;

class Guitar extends Instrument {
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    public void play() {
        System.out.println("Playing " + name + " guitar by " + brand);
    }
}
