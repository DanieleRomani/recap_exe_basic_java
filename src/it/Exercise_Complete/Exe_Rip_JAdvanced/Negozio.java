package it.Exercise_Complete.Exe_Rip_JAdvanced;

//import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Negozio {
//    private String nome;
//    private Map<String, Articolo> catalogo;
//
//    public Negozio(String nome) {
//        this.nome = nome;
//        this.catalogo = new HashMap<>();
//    }
//
//    public void addArticolo(Articolo articolo) {
//        catalogo.put(articolo.getNome(), articolo);
//    }
//
//    public void removeArticolo(String nome) {
//        catalogo.remove(nome);
//    }
//
//    public Articolo getArticolo(String nome) {
//        return catalogo.get(nome);
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void applicaScontoPerTipo(TipoProdotto tipoProdotto, double scontoPercentuale) {
//        for (Articolo articolo : catalogo.values()) {
//            if (articolo.getTipoProdotto() == tipoProdotto) {
//                articolo.applicaSconto(scontoPercentuale);
//            }
//        }
//    }
//
//    public void salvaCatalogo(String nomeFile) {
//        try {
//            FileWriter fileWriter = new FileWriter(nomeFile);
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//            printWriter.println("Nome,Descrizione,Prezzo,TipoProdotto");
//            for (Articolo articolo : catalogo.values()) {
//                printWriter.println(articolo.getNome() + "," +
//                        articolo.getDescrizione() + "," +
//                        articolo.getPrezzo() + "," +
//                        articolo.getTipoProdotto());
//            }
//            printWriter.close();
//        } catch (IOException e) {
//            System.out.println("Errore durante la scrittura del file " + nomeFile);
//        }
//    }
//
//    public void caricaCatalogo(String nomeFile) {
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeFile));
//            String line = bufferedReader.readLine(); // salta la prima riga (intestazione)
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] tokens = line.split(",");
//                String nome = tokens[0];
//                String descrizione = tokens[1];
//                double prezzo = Double.parseDouble(tokens[2]);
//                TipoProdotto tipoProdotto = TipoProdotto.valueOf(tokens[3]);
//                Articolo articolo = new Articolo(nome, descrizione, prezzo, tipoProdotto);
//                addArticolo(articolo);
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            System.out.println("Errore durante la lettura del file " + nomeFile);
//        }
//
//    }
//}
