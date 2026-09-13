package entidades.pessoas;

import entidades.produtos.Leite;
import entidades.produtos.Ovo;
import entidades.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Comerciante extends Pessoa {
    private String nomeComercio;
    private List<Produto> produtosVenda = new ArrayList<>();
    private double valorTotal;
    private int litrosLeite = 0;
    private int ovoPequeno = 0;
    private int ovoMedio = 0;
    private int ovoGrande = 0;

    public Comerciante(String nome, int idade, String cpf, String nomeComercio) {
        super(nome, idade, cpf);
        this.nomeComercio = nomeComercio;
    }

    public void adicionarProduto(Produto produto){
        if(produto instanceof Leite){
            litrosLeite += ((Leite) produto).getLitros();
        } else{
            Ovo ovo = (Ovo) produto;
            verificaTamanhoOvo(ovo);
        }
        valorTotal += produto.getPreco();
        produtosVenda.add(produto);
    }

    public void adicionarProduto(List<Produto> produtos){
        for (Produto p: produtos){
            if(p instanceof Leite){
                litrosLeite += ((Leite) p).getLitros();
            } else{
                Ovo ovo = (Ovo) p;
                verificaTamanhoOvo(ovo);
            }
            valorTotal += p.getPreco();
        }
        produtosVenda.addAll(produtos);
    }

    public void venderProdutos(Produto produto) {
        if (produto instanceof Leite) {

            Leite leite = (Leite) produto;

            if (leite.getLitros() <= litrosLeite) {
                litrosLeite -= leite.getLitros();

                System.out.println("Compra de leite realizada com sucesso!");
                System.out.println("Litros restantes: " + litrosLeite);

            } else {
                System.out.println("Não foi possível comprar essa quantidade de leite.");
            }

        } else if (produto instanceof Ovo) {

            Ovo ovo = (Ovo) produto;

            switch (ovo.getTamanho()) {

                case "Pequeno":
                    if (ovoPequeno > 0) {
                        ovoPequeno--;
                        System.out.println("Ovo pequeno comprado com sucesso!");
                    } else {
                        System.out.println("Não temos mais ovos pequenos no estoque.");
                    }
                    break;

                case "Médio":
                    if (ovoMedio > 0) {
                        ovoMedio--;
                        System.out.println("Ovo médio comprado com sucesso!");
                    } else {
                        System.out.println("Não temos mais ovos médios no estoque.");
                    }
                    break;

                case "Grande":
                    if (ovoGrande > 0) {
                        ovoGrande--;
                        System.out.println("Ovo grande comprado com sucesso!");
                    } else {
                        System.out.println("Não temos mais ovos grandes no estoque.");
                    }
                    break;

                default:
                    System.out.println("Tamanho de ovo inválido.");
            }


        }
    }

    private void verificaTamanhoOvo(Ovo ovo){
        switch (ovo.getTamanho()){
            case "Pequeno":
                ovoPequeno++;
                break;
            case "Médio":
                ovoMedio++;
                break;
            case "Grande":
                ovoGrande++;
                break;
        }
    }

    public String getNomeComercio() {
        return nomeComercio;
    }

    public List<Produto> getProdutosVenda() {
        return produtosVenda;
    }

}
