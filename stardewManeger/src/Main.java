import entidades.animais.*;
import entidades.pessoas.Comerciante;
import entidades.pessoas.Fazendeiro;
import entidades.produtos.Leite;
import entidades.produtos.Ovo;
import entidades.produtos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Fazendeiro fazendeiro = new Fazendeiro("João", 45, "111.111.111-11", "Fazenda Boa Vista");

        Comerciante comerciante = new Comerciante("Carlos", 38, "222.222.222-22", "Mercado do Carlos");

        VacaMae vaca = new VacaMae("Mimosa", 5, "Holandesa");

        GalinhaMae galinha = new GalinhaMae("Cocota", 3, "Caipira");

        Bezerro bezerro = new Bezerro("Belo", 1, "Holandês", vaca);

        Pintinho pintinho = new Pintinho("Piu", 1, "Caipira", galinha);

        vaca.getFilhos().add(bezerro);
        galinha.getFilhos().add(pintinho);

        fazendeiro.adicionarAnimal(vaca);
        fazendeiro.adicionarAnimal(galinha);
        fazendeiro.adicionarAnimal(bezerro);
        fazendeiro.adicionarAnimal(pintinho);

        boolean continua = true;

        while (continua) {

            System.out.println("\n==============================");
            System.out.println("       FAZENDA BOA VISTA");
            System.out.println("==============================");
            System.out.println("1 - Ver animais do fazendeiro");
            System.out.println("2 - Adicionar animal");
            System.out.println("3 - Ver produtos coletados");
            System.out.println("4 - Coletar produto");
            System.out.println("5 - Enviar produtos ao comerciante");
            System.out.println("6 - Vender produtos");
            System.out.println("7 - Sair");
            System.out.println("==============================");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\n--- ANIMAIS DO FAZENDEIRO ---");

                    if (fazendeiro.getAnimais().isEmpty()) {
                        System.out.println("O fazendeiro não possui animais.");
                    } else {
                        for (Animal animal : fazendeiro.getAnimais()) {
                            System.out.println(animal);
                        }
                    }

                    break;

                case 2:
                    System.out.println("\n--- ADICIONAR ANIMAL ---");
                    System.out.println("1 - Vaca");
                    System.out.println("2 - Galinha");
                    System.out.println("3 - Bezerro");
                    System.out.println("4 - Pintinho");
                    System.out.print("Escolha: ");

                    Animal mae = null;

                    int tipoAnimal = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Raça: ");
                    String raca = scanner.nextLine();

                    Animal novoAnimal = null;

                    switch (tipoAnimal) {
                        case 1:
                            novoAnimal = new VacaMae(nome, idade, raca);
                            break;

                        case 2:
                            novoAnimal = new GalinhaMae(nome, idade, raca);
                            break;

                        case 3:
                            System.out.println("Para criar um bezerro você deve escolher uma mãe\n\n");
                            for(Animal a: fazendeiro.getAnimais()){
                                if(a instanceof VacaMae){
                                    System.out.println(a);
                                }
                            }

                            System.out.println("Digite o nome da mãe desse ");
                            mae = fazendeiro.buscarAnimalPorNome(scanner.nextLine());

                            if (mae instanceof VacaMae) {
                                novoAnimal = new Bezerro(nome, idade, raca, mae);

                                ((VacaMae) mae).getFilhos().add(novoAnimal);
                            }else {
                                System.out.println("Mãe não encontrada!");
                            }

                            break;

                        case 4:
                            //corrigir
                            System.out.println("Para criar um pintinho você deve escolher uma mãe\n\n");
                            for(Animal a: fazendeiro.getAnimais()){
                                if(a instanceof GalinhaMae){
                                    System.out.println(a);
                                }
                            }

                            System.out.println("Digite o nome da mãe desse ");
                            mae = fazendeiro.buscarAnimalPorNome(scanner.nextLine());

                            if (mae instanceof GalinhaMae) {
                                novoAnimal = new Pintinho(nome, idade, raca, mae);

                                ((GalinhaMae) mae).getFilhos().add(novoAnimal);
                            }else {
                                System.out.println("Mãe não encontrada!");
                            }

                            break;

                        default:
                            System.out.println("Tipo de animal inválido.");
                    }

                    if (novoAnimal != null) {
                        fazendeiro.adicionarAnimal(novoAnimal);

                        System.out.println("Animal " + nome + " adicionado com sucesso!");
                    }

                    break;

                case 3:
                    System.out.println("\n--- PRODUTOS COLETADOS ---");

                    if (fazendeiro.getProdutosColetados().isEmpty()) {
                        System.out.println("Nenhum produto coletado.");

                    } else {
                        for (Produto produto : fazendeiro.getProdutosColetados()) {

                            System.out.println(produto.getNome()
                                            + " | Preço: R$ "
                                            + produto.getPreco());
                        }
                    }

                    break;

                case 4:
                    System.out.println("\n--- COLETAR PRODUTO ---");

                    if (fazendeiro.getAnimais().isEmpty()) {
                        System.out.println("Não existem animais.");

                    } else {

                        for (int i = 0; i < fazendeiro.getAnimais().size(); i++) {
                            Animal animal = fazendeiro.getAnimais().get(i);

                            System.out.println((i + 1) + " - " + animal);
                        }

                        System.out.print("Escolha o animal: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        if (indice >= 1 && indice <= fazendeiro.getAnimais().size()) {

                            Animal animal = fazendeiro.getAnimais().get(indice - 1);

                            Produto produto = animal.coletarProduto();

                            if (produto != null) {
                                fazendeiro.adicionarProduto(produto);

                                System.out.println("Produto coletado: " + produto.getNome());

                                System.out.println("Preço: R$ " + produto.getPreco());

                            } else {
                                System.out.println(animal.getNome() + " não produz nenhum produto.");
                            }

                        } else {
                            System.out.println("Animal inválido.");
                        }
                    }

                    break;

                case 5:

                    System.out.println("\n--- ENVIAR PRODUTOS ---");

                    List<Produto> produtos = fazendeiro.getProdutosColetados();

                    if (produtos.isEmpty()) {
                        System.out.println("O fazendeiro não possui produtos.");

                    } else {
                        comerciante.adicionarProduto(new ArrayList<>(produtos));

                        System.out.println(produtos.size() + " produto(s) enviado(s) ao comerciante.");

                        fazendeiro.limparProdutos();
                    }

                    break;

                case 6:
                    System.out.println("\n--- VENDA DE PRODUTOS ---");

                    System.out.println( "Digite o produto que deseja vender.");

                    System.out.println("1 - Comprar leite");
                    System.out.println("2 - Comprar ovo");
                    System.out.print("Escolha: ");

                    int tipoProduto = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoProduto == 1) {
                        System.out.println("Digite quantos LITROS de leite deseja comprar: ");
                        int litros = scanner.nextInt();
                        scanner.nextLine();
                        comerciante.venderProdutos(new Leite("Leite", litros));

                    } else if (tipoProduto == 2) {
                        System.out.println("Digite o TAMANHO do ovo que deseja comprar: ");
                        String tamanho = scanner.nextLine();

                        comerciante.venderProdutos(new Ovo("Ovo", tamanho));

                    } else {
                        System.out.println("Opção inválida.");
                    }

                    break;

                case 7:
                    continua = false;
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}