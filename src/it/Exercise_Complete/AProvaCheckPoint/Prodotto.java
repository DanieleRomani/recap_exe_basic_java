package it.Exercise_Complete.AProvaCheckPoint;

public class Prodotto {
    private String codiceProdotto;
    private String descrizione;
    private double prezzo;

    public Prodotto() { }

    public Prodotto(String codiceProdotto, String descrizione, double prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
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

    @Override
    public String toString() {
        return "Prodotto{" +
                "codiceProdotto='" + codiceProdotto + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
