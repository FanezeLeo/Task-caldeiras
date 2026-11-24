package com.documentacao.transformers;

import java.util.ArrayList;
import java.util.List;
/**
 * Gerencia os Autobots da base.
 */
public class GerenciadorAutobots {
    private List<Autobot> lista = new ArrayList<>();
    private final String ELITE = "ELITE";
    private final String PADRAO = "PADRAO";
    private final String RESERVA = "RESERVA";

    //Nome do metodo muito generico, informar o que o metodo adiciona
    //Nome da variavel parametro não informa o que a variavel armazena
    public void adicionarAutobot(Autobot autobot) {
        lista.add(autobot);
    }
    public double calcularEnergonTotal() {
        double total = 0;
        /*
        Erro de compilação: A lista começa sempre com 0 por esse motivo nunca terá
        a casa com numero igual ao tamanho da lista, o for deve ser < ista.size(), não <=
         */
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i).getEnergon();
        }
        return total;
    }

    //O nome do metodo não informa que a busca e feita pelo nome do autobot
    public Autobot buscarAutobotPorNome(String nome) {
        for (Autobot autobot : lista) {
            if (autobot.getNome() == nome) {
                return autobot;
            }
        }
        return null;
    }
    public void repararAutobot(Autobot autobot) {
        try {
            if (autobot.getEnergon() < 0) {
                throw new Exception("Energon negativo");
            }
            autobot.setEnergon(autobot.getEnergon() + 100);
        } catch (Exception ex) {
            //Não era retornado uma mensagem clara do erro
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    public String classificarAutobot(Autobot autobot) {
        //valores imutaveis que não estão em variaveis final
        if (autobot.getEnergon() > 500) {
            return ELITE;
        } else if (autobot.getEnergon() > 200) {
            return PADRAO;
        } else {
            return RESERVA;
        }
    }
}