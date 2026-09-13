package entidades.produtos;

import java.util.Random;

public class Ovo extends Produto {
    private String tamanho;
    private final String[] tamanhos = {"Pequeno", "Médio", "Grande"};

    public Ovo(String nome) {
        super(nome);
        Random random = new Random();
        this.tamanho = tamanhos[random.nextInt(tamanhos.length)];

        switch (this.tamanho) {
            case "Pequeno":
                this.preco = 0.80;
                break;

            case "Médio":
                this.preco = 1.00;
                break;

            case "Grande":
                this.preco = 1.30;
                break;
        }
    }

    public Ovo(String nome, String tamanho){
        super(nome);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
