package it.Exercise_Complete.Checkpoint;

import java.util.HashMap;
import java.util.Map;

public class CarrelloSpesa {
    /**
     * Progettare una classe CarrelloSpesa con i seguenti attributi:
     * - Id Carrello
     * - Mappa di prodotti // Prodotto, int → Prodotto, Quantità del prodotto nel
     * carrello
     */
    private int idCarrello;
    private Map<Prodotto, Integer> prodotti;

    /**
     * Implementare un costruttore senza alcun parametro
     */
    public CarrelloSpesa() {
        this.idCarrello = 0;
        this.prodotti = new HashMap<>();
    }

    /**
     * Implementare i getter e i setter per ciascuna variabile.
     */
    public int getIdCarrello() {
        return idCarrello;
    }

    public void setIdCarrello(int idCarrello) {
        this.idCarrello = idCarrello;
    }

    public Map<Prodotto, Integer> getProdotti() {
        return prodotti;
    }

    public void setProdotti(Map<Prodotto, Integer> prodotti) {
        this.prodotti = prodotti;
    }

    /**
     * Realizzare un metodo che restituisca il numero di prodotti nel carrello
     */
    public int getNumeroProdotti() {
        int numeroProdotti = 0;
        for (int quantita : prodotti.values()) {
            numeroProdotti += quantita;
        }
        return numeroProdotti;
    }

    /**
     * Realizzare un metodo che restituisca il prezzo totale dei prodotti nel carrello.
     */
    public double getPrezzoTotale() {
        double prezzoTotale = 0.0;
        for (Map.Entry<Prodotto, Integer> entry : prodotti.entrySet()) {
            Prodotto prodotto = entry.getKey();
            int quantita = entry.getValue();
            prezzoTotale += prodotto.getPrezzo() * quantita;
        }
        return prezzoTotale;
    }

    /**
     * Realizzare un metodo che stampi tutti i prodotti presenti nel carrello con la
     * relativa quantità.
     */
    public void stampaProdotti() {
        for (Map.Entry<Prodotto, Integer> entry : prodotti.entrySet()) {
            Prodotto prodotto = entry.getKey();
            int quantita = entry.getValue();
            System.out.println(prodotto + "Quantità: " + quantita + " ");
        }
    }
    /**
     * Realizzare un metodo che per aggiungere un prodotto al carrello passando
     * come input il codice prodotto
     */
    public void aggiungiProdotto(String codiceProdotto, int quantita) {
        for (Prodotto prodotto : prodotti.keySet()) {
            if (prodotto.getCodiceProdotto().equals(codiceProdotto)) {
                aggiungiProdotto(String.valueOf(prodotto), quantita);
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }
    /**
     * Realizzare un metodo per rimuovere un prodotto dal carrello passando come
     * input il codice prodotto.
     */
    public void rimuoviProdotto(String codiceProdotto) {
        for (Prodotto prodotto : prodotti.keySet()) {
            if (prodotto.getCodiceProdotto().equals(codiceProdotto)) {
                rimuoviProdotto(String.valueOf(prodotto));
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }
}