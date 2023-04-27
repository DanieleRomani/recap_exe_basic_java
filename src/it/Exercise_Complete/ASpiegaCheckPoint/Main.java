package it.Exercise_Complete.ASpiegaCheckPoint;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("001", Genere.ROMANZO, 3.99);
        Libro libro2 = new Libro("002", Genere.FANTASY, 5.99);
        Libro libro3 = new Libro("003", Genere.PER_RAGAZZI, 6.99);

        HashMap<Libro, Integer> inventario = new HashMap<>();
        inventario.put(libro1, 5);
        inventario.put(libro2, 10);
        inventario.put(libro3,3);

        Biblioteca biblioteca = new Biblioteca(inventario);
        try {
            biblioteca.salvaSuFile("./inventario.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(biblioteca.inventario);

        Biblioteca newBiblioteca = new Biblioteca();
        try {
            newBiblioteca.caricaDaFile("./inventario.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(newBiblioteca.inventario);


    }

}
