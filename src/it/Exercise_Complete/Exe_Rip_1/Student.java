package it.Exercise_Complete.Exe_Rip_1;

public class Student {
    /**
     * Progettare una classe Studente con i seguenti attributi privati:
     * - Num. Matricola
     * - Nome
     * - Cognome
     * - Indirizzo di residenza
     * ● Implementare almeno due tipologie di costruttori e i relativi getter e setter per
     * ciascuna variabile.
     * ● Implementare il metodo toString() per mostrare in output alcune info relative
     * all’istanza della classe
     */
    private int numMatricola;
    private String name;
    private String cognome;
    private String indirizzo;

    public Student(String name, String cognome, int numMatricola, String indirizzo) {
        this.name = name;
        this.numMatricola = numMatricola;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
                "numMatricola=" + numMatricola +
                ", name='" + name + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }

    public Student(){

    }

    public int getNumMatricola() {
        return numMatricola;
    }

    public void setNumMatricola(int numMatricola) {
        this.numMatricola = numMatricola;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
