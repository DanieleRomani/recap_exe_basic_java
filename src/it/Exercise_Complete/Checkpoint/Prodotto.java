package it.Exercise_Complete.Checkpoint;

public class Prodotto {
    /**
     *  Definire una classe "Prodotto" che abbia i seguenti attributi:
     * - Codice prodotto
     * - Descrizione
     * - Prezzo
     */
    private String codiceProdotto;
    private String descrizione;
    private double prezzo;

    /**
     * Implementare almeno due tipologie di costruttori e i relativi getter e setter per
     * ciascuna variabile.
     */
    public Prodotto(String codiceProdotto, String descrizione, double prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    public Prodotto(){
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Implementare il metodo toString() per mostrare in output alcune info relative
     * all’istanza della classe
     */
    @Override
    public String toString() {
        return "Codice prodotto: " + codiceProdotto +
                "\nDescrizione: " + descrizione +
                "\nPrezzo: " + prezzo + " euro";
    }
}
