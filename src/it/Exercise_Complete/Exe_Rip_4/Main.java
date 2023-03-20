package it.Exercise_Complete.Exe_Rip_4;

public class Main {
public static void main(String[] args) {
    Auto bmw1 = new Auto("BMW", "X5", 49999.99);
    Auto bmw2 = new Auto("BMW", "X6", 89999.99);
    Auto fiat1 = new Auto("FIAT", "Punto", 15000.00);

    Concessionaria pierino = new Concessionaria("Pierino");

    pierino.aggiungiAuto(bmw1);
    pierino.aggiungiAuto(bmw2);
    pierino.aggiungiAuto(fiat1);

    pierino.stampaAuto();

    Auto bmw3 = new Auto("BMW", "M4", 129999999.99);
    pierino.aggiungiAuto(bmw3);
    pierino.rimuoviAuto(fiat1);

    pierino.stampaAuto();

    System.out.println(pierino.cercaAuto("FIAT"));

    System.out.println(pierino.conteggioAutoPerMarca());

    }
}
