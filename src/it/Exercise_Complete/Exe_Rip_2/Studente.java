package it.Exercise_Complete.Exe_Rip_2;

import java.util.HashMap;
import java.util.Map;

public class Studente {
    /**
     *      * Progettare una classe Studente con i seguenti attributi privati:
     *      * - Num. Matricola
     *      * - Nome
     *      * - Cognome
     *      * - Votazioni // mappa <String, Integer>
     *      * - Numero studenti creati // contatore che tenga traccia di quante istanze
     *      * vengono create
     *      * ● Implementare almeno due tipologie di costruttori e i relativi getter e setter per
     *      * ciascuna variabile.
     *      * ● Implementare un metodo che permetta di aggiungere una nuova valutazione
     *      * alla mappa
     *      * ● Implementare il metodo toString() per mostrare in output alcune info relative
     *      * all’istanza della classe.
     */

    private int registrationNumber;
    private String nome;
    private String surname;
    private Map<String,Integer> vote;
    private static int studentCreateNumber = 0;

    public Studente(String registrationNumber, String nome, String surname) {
        this.registrationNumber = Integer.parseInt(registrationNumber);
        this.nome = nome;
        this.surname = surname;
        this.vote = new HashMap<String, Integer>();
        studentCreateNumber++;
    }

    public Studente(){
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Map<String, Integer> getVote() {
        return vote;
    }

    public void setVote(Map<String, Integer> vote) {
        this.vote = vote;
    }

    public static int getStudentCreateNumber() {
        return studentCreateNumber;
    }

    public static void setStudentCreateNumber(int studentCreateNumber) {
        Studente.studentCreateNumber = studentCreateNumber;
    }

    @Override
    public String toString() {
        return "Studente [numMatricola=" + registrationNumber + ", nome=" + nome + ", cognome=" + surname + ", votazioni="
                + vote + "]";
    }

}
