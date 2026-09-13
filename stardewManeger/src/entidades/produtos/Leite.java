package entidades.produtos;

import java.util.Random;

public class Leite extends Produto {
    private int litros;

    public Leite(String nome) {
        super(nome);
        Random random = new Random();
        this.litros = random.nextInt(5) + 5;
        this.preco = litros * 4.5;
    }

    public Leite(String nome, int litros) {
        super(nome);
        this.litros = litros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
}
