package cofre;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        moedas.remove(moeda);
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            for (Moeda moeda : moedas) {
                moeda.info();
            }
        }
    }

    public double calcularTotalEmReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}