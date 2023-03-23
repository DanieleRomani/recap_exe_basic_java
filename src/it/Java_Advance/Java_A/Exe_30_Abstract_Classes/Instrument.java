package it.Java_Advance.Java_A.Exe_30_Abstract_Classes;
interface Playable {
    void play();
}
abstract class Instrument implements Playable {
        protected String name;
        protected String brand;

        public Instrument(String name, String brand) {
            this.name = name;
            this.brand = brand;
        }
}

