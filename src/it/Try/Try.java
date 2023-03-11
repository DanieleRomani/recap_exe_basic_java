package it.Try;

public class Try {

    // GENERO METODO
    public static void main(String[] args){
        // questo è un metodo
        // metodo per eseguire il programma
        // main = nome metodo

        // creo ogg
        // sintassi: nomeClasse variabile = new nomeClasse(parametri se ce ne sono)

        Try pippo = new Try("pippo",10);

        System.out.println(pippo);
    }

    // CONSTRUCTOR
    // 1 creo variabile
    private String name;
    private int num;

    // generate constructor
    //
    public Try (String name, int num){
        this.name = name;  // this si riferisce a quella varibili situate all'esterno del costruttore
        this.num = num;     // accessibili solo ed unicamente con il this
    }

    // METTODO OVERRIDE * STAMPA
    // I METODI SEMPRE CON LA MINUSCOLA INIZIANO SEGA
    @Override
    public String toString() {
        return name + " - " + num;
    }
}
