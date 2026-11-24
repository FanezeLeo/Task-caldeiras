package com.documentacao.transformers;

public class Main {
    public static void main(String[] args) {
        GerenciadorAutobots gerenciador = new GerenciadorAutobots();

        Autobot optimus = new Autobot("Optimus Prime", 850.0, 10);
                Autobot bumblebee = new Autobot("Bumblebee", 320.0, 5);
                Autobot ratchet = new Autobot("Ratchet", 180.0, 7);
        gerenciador.adicionarAutobot(optimus);
        gerenciador.adicionarAutobot(bumblebee);
        gerenciador.adicionarAutobot(ratchet);
        System.out.println("Energon total: " + gerenciador.calcularEnergonTotal());
        Autobot encontrado = gerenciador.buscarAutobotPorNome("Bumblebee");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNome());
        } else {
            System.out.println("Autobot nao encontrado");
        }
        gerenciador.repararAutobot(ratchet);
        System.out.println("Energon do Ratchet: " + ratchet);
        System.out.println("Classificacao: " + gerenciador.classificarAutobot(ratchet));
    }
}