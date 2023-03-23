package it.Exercise_Complete.Exe_Rip_JAdvanced;

/**
 * 1. Classe Prodotto
 * Crea una classe astratta chiamata Product che rappresenta un generico prodotto con i
 * seguenti campi: nome, prezzo
 */
abstract class Product {
    private String nome;
    private double prezzo;

    public Product(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getName() {
        return nome;
    }

    public double getPrice() {
        return prezzo;
    }

    public abstract void printDetails();
}
