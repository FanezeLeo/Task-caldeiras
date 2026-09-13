package entidades.animais;

import entidades.produtos.Ovo;
import entidades.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class GalinhaMae extends Animal {
    private List<Animal> filhos = new ArrayList<>();

    public GalinhaMae(String nome, int idade, String raca) {
        super(nome, idade, raca);
        this.filhos = filhos;
    }

    public void adicionarFilho(Animal animal){
        filhos.add(animal);
    }

    public List<Animal> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<Animal> filhos) {
        this.filhos = filhos;
    }

    @Override
    public void emitirSom() {
        System.out.println("Có có có!");
    }

    @Override
    public Produto coletarProduto() {
        return new Ovo("Ovo");
    }
}
