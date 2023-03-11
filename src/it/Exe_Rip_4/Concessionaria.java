package it.Exe_Rip_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concessionaria {

    private String nomeConcessionaria;
    private List<Auto> autoPtresenti;

    public Concessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
        this.autoPtresenti = new ArrayList<Auto>();
    }

    public String getNomeConcessionaria() {
        return nomeConcessionaria;
    }

    public void setNomeConcessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
    }

    public List<Auto> getAutoPtresenti() {
        return autoPtresenti;
    }

    public void setAutoPtresenti(List<Auto> autoPtresenti) {
        this.autoPtresenti = autoPtresenti;
    }

    public void stampaAuto() {
        System.out.println("Auto presenti nella concessionaria: ");
        for (Auto auto : autoPtresenti) {
            System.out.println(auto.getModello() + " " + auto.getMarca() + " " + auto.getPrezzo() + " ");
        }
    }

    public void aggiungiAuto(Auto auto) {
        autoPtresenti.add(auto);
    }

    public void rimuoviAuto(Auto auto) {
        autoPtresenti.remove(auto);
    }

    public List<Auto> cercaAuto(String marca){
        List<Auto> listaAutoCercate = new ArrayList<>();
        for (Auto auto : autoPtresenti){
            if (auto.getMarca().equals(marca)) {
                listaAutoCercate.add(auto);
            }
        }
        return listaAutoCercate;
    }

    public Map<String, Integer> conteggioAutoPerMarca() {
        Map<String, Integer> conteggio = new HashMap<>();
        for (Auto auto : autoPtresenti) {
            String marca = auto.getMarca();
            conteggio.put(marca, conteggio.getOrDefault(marca, 0) + 1);
        }
        return conteggio;
    }

}

