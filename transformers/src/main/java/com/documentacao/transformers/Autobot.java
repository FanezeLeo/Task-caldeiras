package com.documentacao.transformers;

public class Autobot {
    //nome das variaveis não estão claras, especificar o que é "n" e "e"
    //encapsulamento das variaveis, estavam publicas
    private String nome;
    private double energon;
    private int nivel;
    
    public Autobot(String nome, double energon, int nivel) {
        this.nome = nome;
        this.energon = energon;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergon() {
        return energon;
    }

    public void setEnergon(double energon) {
        this.energon = energon;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}