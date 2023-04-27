package it.Exercise_Complete.ASpiegaCheckPoint;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    Map<Libro, Integer> inventario = new HashMap<>();


    public Biblioteca() {}
    public Biblioteca(Map<Libro, Integer> inventario) {
        this.inventario = inventario;
    }

    public Map<Libro, Integer> getInventario() {
        return inventario;
    }

    public void setInventario(Map<Libro, Integer> inventario) {
        this.inventario = inventario;
    }

    public void salvaSuFile(String path) throws IOException {
        // 1. Metodo di salvataggio
        String fileContent = "";
        for (Libro libro: this.inventario.keySet()) {
            fileContent += libro.getId() + "," + libro.getGenere().toString() + "," +
                    libro.getPrezzo() + "," +
                    inventario.get(libro) + "\n";
        }
        Files.writeString(Path.of(path), fileContent);

        // 2. Metodo salvataggio
        /*
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        for (Libro libro: this.inventario.keySet()) {
            fileWriter.append(libro.getId()).append(",")
                    .append(libro.getGenere().toString()).append(",")
                    .append(String.valueOf(libro.getPrezzo())).append(",")
                    .append(String.valueOf(inventario.get(libro))).append(",")
                    .append("\n");
        }
        fileWriter.close();
         */
    }

    public void caricaDaFile(String path) throws IOException {
        HashMap<Libro, Integer> tmpInventario = new HashMap<>();
        File file = new File(path);
        String fileContent = Files.readString(file.toPath());
        String[] lines = fileContent.split("\n");
        for (String line : lines) {
            String[] info_riga = line.split(",");
            String genere = info_riga[1];
            Genere tmpGenere;
            switch (genere) {
                case "FANTASY":
                    tmpGenere = Genere.FANTASY;
                    break;
                case "PER_RAGAZZI":
                    tmpGenere = Genere.PER_RAGAZZI;
                    break;
                case "ROMANZO":
                    tmpGenere = Genere.ROMANZO;
                    break;
                default:
                    throw new IllegalArgumentException("Genere non riconosciuto");
            }

            Libro tmpLibro = new Libro(info_riga[0], tmpGenere, Double.parseDouble(info_riga[2]));
            tmpInventario.put(tmpLibro, Integer.parseInt(info_riga[3]));
        }

        this.inventario = tmpInventario;

    }

}

/*
Progettare una classe Biblioteca con i seguenti attributi:
Mappa di libri // Libro, int → Libro, Quantità di libri presenti nella biblioteca
Implementare un costruttore con l’unico attributo presente nella classe ed il costruttore di default.
Implementare getter e setter.
Realizzare un metodo salvaSuFile(String path) per salvare su file l'insieme di libri presenti nella biblioteca con le relative disponibilità.
Realizzare un metodo caricaDaFile(String path) che carichi da file i libri e li sostituisca alla mappa di prodotti presenti.
Realizzare un metodo che stampi tutti i libri presenti nella biblioteca con la relativa quantità.*/
