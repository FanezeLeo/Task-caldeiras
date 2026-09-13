package entidades.animais;

import entidades.produtos.Produto;

public class Bezerro extends Animal {
    private Animal mae;

    public Bezerro(String nome, int idade, String raca, Animal mae) {
        super(nome, idade, raca);
        this.mae = mae;
    }

    public Animal getMae() {
        return mae;
    }

    public void setMae(Animal mae) {
        this.mae = mae;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Muuu!");
    }

    @Override
    public Produto coletarProduto() {
        return null;
    }
}
