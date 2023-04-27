package it.Exercise_Complete.AProvaCheckPoint;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Magazzino {

    List<Prodotto> catalogo = new ArrayList<>();
    public Magazzino() { }
    public Magazzino(List<Prodotto> catalogo) {
        this.catalogo = catalogo;
    }

    public List<Prodotto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Prodotto> catalogo) {
        this.catalogo = catalogo;
    }

    /**
     * codiceProdotto, descrizione, prezzo
     *      01       ,    penna0   , 2.1;
     *      02       ,    penna1   , 2.5;
     *      03       ,    penna2   , 3.1;
     * @param path
     */

    // metodo che salva sul file (String path)
    public void salvaSuFile(String path) throws IOException {
        String fileContent = "";
        for (Prodotto prodotto : this.catalogo) {
            String rowProdotto = prodotto.getCodiceProdotto() + " , "
                    + prodotto.getDescrizione() + " , "
                    + prodotto.getPrezzo() + "\n";
            fileContent += rowProdotto;
        }
        Files.writeString(Path.of(path), fileContent);
    }

}
