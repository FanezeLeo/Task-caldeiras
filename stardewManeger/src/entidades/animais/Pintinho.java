package entidades.animais;

import entidades.produtos.Produto;

public class Pintinho extends Animal {
    private Animal mae;

    public Pintinho(String nome, int idade, String raca, Animal mae) {
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
        System.out.println("Piu piu!");
    }

    @Override
    public Produto coletarProduto() {
        return null;
    }
}
