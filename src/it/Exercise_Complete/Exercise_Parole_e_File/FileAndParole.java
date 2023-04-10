package it.Exercise_Complete.Exercise_Parole_e_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Spesso è interessante analizzare uno o più file di testo in una determinata lingua per comprendere quali siano le parole
 * più frequenti (o anche le lettere più frequenti). Vogliamo realizzare la classe FileAndParole, che effettua alcune di
 * queste operazioni ed è composta dai seguenti metodi:
 * <p>
 * <p>
 * stampaParole(Path file): questo metodo prende in input un oggetto della classe Path del
 * package java.nio.file rappresentante un file di testo e stampa riga per riga tutte le parole
 * contenute nel testo. Si supponga che ogni parola sia separata da spazio e non vi siano segni di punteggiatura.
 */
public class FileAndParole {
    public void stampaParole(Path file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file.toFile()));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parole = line.split(" ");
            for (String parola : parole) {
                System.out.println(parola);
            }
        }
        reader.close();
    }

    /**
     * occorrenzeParole(Path file): questo metodo prende in input un oggetto della classe Path
     * del package java.nio.file rappresentante un file di testo e ritorna una HashMap dove le
     * chiavi sono le parole e i valori sono il numero di occorrenze delle parole stesse nel testo.
     * Si supponga che ogni parola sia separata da spazio, siano tutte minuscole e non vi siano
     * segni di punteggiatura.
     */
    public HashMap<String, Integer> occorrenzeParole(Path file) throws IOException {
        HashMap<String, Integer> occorrenze = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(file.toFile()));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parole = line.split(" ");
            for (String parola : parole) {
                parola = parola.toLowerCase();
                Integer count = occorrenze.get(parola);
                if (count == null) {
                    occorrenze.put(parola, 1);
                } else {
                    occorrenze.put(parola, count + 1);
                }
            }
        }
        reader.close();
        return occorrenze;
    }

    /**
     * occorrenzeParoleTesto(Path file): questo metodo prende in input un oggetto della classe
     * Path del package java.nio.file rappresentante un file di testo e ritorna una HashMap dove
     * le chiavi sono le parole e i valori sono il numero di occorrenze delle parole stesse nel testo. In questo caso il testo può comprendere punteggiatura e lettere maiuscole. SUGGERIMENTO: per eliminare la punteggiatura da una riga di testo utilizzare il metodo
     * riga.split("\W+").
     */
    public HashMap<String, Integer> occorrenzeParoleTesto(Path file) throws IOException {
        HashMap<String, Integer> occorrenze = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(file.toFile()));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parole = line.split("\\W+");
            for (String parola : parole) {
                parola = parola.toLowerCase();
                Integer count = occorrenze.get(parola);
                if (count == null) {
                    occorrenze.put(parola, 1);
                } else {
                    occorrenze.put(parola, count + 1);
                }
            }
        }
        reader.close();
        return occorrenze;
    }

    /**
     * paroleInRima(Path file): questo metodo prende in input un oggetto della classe Path del
     * package java.nio.file rappresentante un file di testo in italiano e il suo obiettivo è quello
     * di catalogare le parole in rima. Due parole in italiano di intendono in rima se:
     * Terminano con una sequenza vocale-consonante-vocale identica.
     * Terminano con una sequenza vocale-consonante-consonante-vocale identica.
     * Il metodo deve ritornare una HashMap dove le chiavi sono i dittonghi finali (le rime) e i
     * valori sono ArrayList contenenti tutte le parole che terminano con quel dittongo (rima).
     */
    public static HashMap<String, ArrayList<String>> paroleInRima(Path file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file.toFile()));
        String line;
        HashMap<String, ArrayList<String>> rime = new HashMap<String, ArrayList<String>>();
        while ((line = reader.readLine()) != null) {
            String[] parole = line.split("\\W+");
            for (String parola : parole) {
                if (parola.length() < 4) {
                    continue;
                }
                parola = parola.toLowerCase();
                String dittongo = getDittongo(parola);
                if (dittongo != null) {
                    if (!rime.containsKey(dittongo)) {
                        rime.put(dittongo, new ArrayList<String>());
                    }
                    ArrayList<String> paroleInRima = rime.get(dittongo);
                    paroleInRima.add(parola);
                    rime.put(dittongo, paroleInRima);
                }
            }
        }
        reader.close();
        return rime;
    }

    private static String getDittongo(String parola) {
        String regex = "(?<=[aeiou])[bcdfghjklmnpqrstvwxyz]*(?=[aeiou]{1,2}$)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(parola);
        if (matcher.find()) {
            return matcher.group().toLowerCase();
        } else {
            return "";
        }
    }
}
