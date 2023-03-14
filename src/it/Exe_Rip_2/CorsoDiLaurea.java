package it.Exe_Rip_2;

public class CorsoDiLaurea {

    /**
     *      * ●
     *      * ● Realizzare un metodo per aggiungere uno studente agli studenti iscritti al
     *      * corso.
     *      * ● Realizzare un metodo che permetta di rimuovere uno studente dal corso di
     *      * laurea
     */
    /**
     * 2) Progettare una classe CorsoLaurea che permetta di memorizzare:
     * - Nome del Corso
     * - Studenti
     */
    private String courseName;
    private String participants;

    /**
     * Implementare un costruttore che riceva solamente in input il nome del corso
     * di laurea.
     */
    public CorsoDiLaurea(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Implementare i getter e i setter per ciascuna variabile.
     */
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    /**
     * Realizzare un metodo che stampi gli studenti iscritti al corso di laurea.
     */
    @Override
    public String toString() {
        return courseName + " - " + participants;
    }
    /**
     * Realizzare un metodo per aggiungere uno studente agli studenti iscritti al
     * mncorso.
     */
}
