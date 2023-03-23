package it.Exercise_Complete.Exe_Rip_JAdvanced;

/**
 * 3. Enum TipoProdotto:
 * Crea un enumeratore denominato TipoProdotto che rappresenta i diversi tipi di articoli che
 * possono essere venduti nel negozio. Ogni TipoProdotto deve avere un nome e una
 * descrizione.
 */
public enum TipoProdotto {
    FRUTTERIA("Reparto Frutta", "Frutta"),
    PESCRHEIA("Reparto Pescheria", "Pesce"),
    FORNO("Reparto Forno", "Pane, Pizza, Pasta"),;
    private String nome;
    private String descrizione;

    TipoProdotto(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
