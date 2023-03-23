package it.Exercise_Complete.Exe_Rip_JAdvanced;

public interface Sconto {
    /**
     * 2. Interfaccia Sconto:
     * Crea un'interfaccia chiamata Sconto che abbia un campo sconto ed i seguenti metodi:
     */

    double sconto = 0.0;

//     applicaSconto: un metodo che applica uno sconto al prodotto. Lo sconto deve essere
//     espresso in percentuale (ad esempio, uno sconto del 10% deve essere passato come 10,0).

    void applicaSconto (double percentualeSconto);

//  calcolaPrezzoScontato(): un metodo che a partire dal prezzo del prodotto e dallo
//  sconto impostato, calcola il prezzo effettivo.

    double CalcolaPrezzoScontato();
}