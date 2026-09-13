package entidades.animais;

import entidades.produtos.Leite;
import entidades.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class VacaMae extends Animal {
    private List<Animal> filhos = new ArrayList<>();

    public VacaMae(String nome, int idade, String raca) {
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
        System.out.println(nome + " faz: MUUUUUUUUUU!");
    }

    @Override
    public Produto coletarProduto() {
        return new Leite("Leite");
    }
}
