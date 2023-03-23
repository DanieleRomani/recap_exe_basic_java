package it.Exercise_Complete.Exe_Rip_JAdvanced;

public class Articolo extends Product implements Sconto {
    private int id;
    private String descrizione;
    private TipoProdotto tipoProdotto;
    private double sconto = 0.0;

    public Articolo(int id, String nome, double prezzo, String descrizione, TipoProdotto tipoProdotto) {
        super(nome, prezzo);
        this.id = id;
        this.descrizione = descrizione;
        this.tipoProdotto = tipoProdotto;
    }

    @Override
    public void applicaSconto(double sconto) {
        this.sconto = sconto;
    }

    @Override
    public double calcolaPrezzoScontato() {
        double prezzo = getPr
        ezzo();
        double sconto = this.sconto / 100.0;
        return prezzo - (prezzo * sconto);
    }

    public int getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public TipoProdotto getTipoProdotto() {
        return tipoProdotto;
    }
}