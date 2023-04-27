package it.Exercise_Complete.ASpiegaCheckPoint;

public class Libro {   private String id;
    private Genere genere;
    private double prezzo;

    public Libro(String id, Genere genere, double prezzo) {
        this.id = id;
        this.genere = genere;
        this.prezzo = prezzo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id='" + id + '\'' +
                ", genere=" + genere +
                ", prezzo=" + prezzo +
                '}';
    }
}
