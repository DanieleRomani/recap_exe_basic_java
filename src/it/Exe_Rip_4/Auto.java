package it.Exe_Rip_4;

public class Auto {

    /**
     *
     */
    private String marca;
    private String modello;
    private double prezzo;

    public Auto(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public Auto() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String toString() {
        return marca + " "
                + modello + " "
                + prezzo + " " +
                " €";
    }

}
