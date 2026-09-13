package entidades.pessoas;

import entidades.animais.Animal;
import entidades.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Fazendeiro extends Pessoa {
    private String nomeFazenda;
    private List<Animal> animais = new ArrayList<>();
    private List<Produto> produtosColetados = new ArrayList<>();

    public Fazendeiro(String nome, int idade, String cpf, String nomeFazenda) {
        super(nome, idade, cpf);
        this.nomeFazenda = nomeFazenda;
    }

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public void adicionarProduto(Produto produto){
        produtosColetados.add(produto);
    }

    public Animal buscarAnimalPorNome(String nome){
        for (Animal a: animais){
            if (a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
    }

    public void limparProdutos(){
        produtosColetados.clear();
    }

    public String getNomeFazenda() {
        return nomeFazenda;
    }

    public void setNomeFazenda(String nomeFazenda) {
        this.nomeFazenda = nomeFazenda;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public List<Produto> getProdutosColetados() {
        return produtosColetados;
    }

}
