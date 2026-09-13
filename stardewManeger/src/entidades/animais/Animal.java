package entidades.animais;

import entidades.produtos.Produto;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String raca;

    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIndade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public abstract void emitirSom();


    public abstract Produto coletarProduto();

    @Override
    public String toString() {
        return "Nome: " + nome
                + " | Idade: " + idade
                + " | Raça: " + raca;
    }
}
