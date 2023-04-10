package it.Exercise_Complete.File_and_File;

import java.io.IOException;
import java.util.Map;

public class Boooobs {
    public static void main(String[] args) throws IOException {

        Map<String , Integer> map = OperazioniFile.frequenzaParole("src/it/Exercise_Complete/File_and_File/testo.txt");
        OperazioniFile.scriviMappaSuFile("src/it/Exercise_Complete/File_and_File/frequenza.txt", map);


    }
}
