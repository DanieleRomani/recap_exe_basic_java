package it.Exercise_Complete.File_and_File;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OperazioniFile {
    public static Map<String, Integer> frequenzaParole(String fileName) throws IOException {
        Map<String, Integer> frequenza = new TreeMap<>();
        FileReader reader = new FileReader(fileName);
        BufferedReader buffer = new BufferedReader(reader);                                                                 // quando chiameremo frequenza parole prenderà il file e lo tratteà come file d leggere
        while (buffer.ready()) {
            String line = buffer.readLine();                                                                                // creami una linea ogni volta che leggi una stringa
            List<String> listaDeParole = List.of(line.split("\\W+"));
            for (int i = 0; i < listaDeParole.size(); i++) {
                if (!listaDeParole.get(i).isEmpty()) {                                                                      // Il metodo isEmpty() in Java viene utilizzato per verificare se una stringa è vuota. Il metodo restituisce un valore booleano, true se la stringa è vuota (ossia ha una lunghezza pari a 0) e false altrimenti.
                    frequenza.put(listaDeParole.get(i).toLowerCase(), frequenza.getOrDefault(listaDeParole.get(i).toLowerCase(),0)+ 1);
                }
            }
        }
        return frequenza;
    }
    // metodo che scrive file
    public static void scriviMappaSuFile(String fileName , Map<String,Integer>frequenza) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, Integer> entry : frequenza.entrySet()) {
                writer.write(entry.getKey().toUpperCase() + " - " + entry.getValue());
                writer.newLine();
            }
        }
    }


}
