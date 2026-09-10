public class Picareta {

    private String material;
    private int durabilidade;
    private int forca;

    public Picareta(String material, int durabilidade, int forca) {
        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;
    }

    public int minerar(int blocos){
        System.out.println("\n=== MINERANDO COM PICARETA DE " + material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + this.durabilidade);
        System.out.println("Força: " + this.forca);
        System.out.println("Blocos a minerar: " + blocos);

        if (this.durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
            return 0;
        }

        int blocosMinerados = 0;

        for (int i = 0; i < blocos; i++) {
            if (this.durabilidade <= 0) {
                System.out.println(" Picareta quebrou no bloco " + (i + 1));
                break;
            }
            this.durabilidade--;
            blocosMinerados++;
        }

        System.out.println("\nMinerados " + blocosMinerados + " blocos");
        System.out.println("Durabilidade restante: " + this.durabilidade);

        if (this.durabilidade <= 0) {
            System.out.println(" A picareta de " + this.material + " quebrou completamente!");
        }

        return this.durabilidade;
    }

    public void repararPicareta(int quantidade) {
        System.out.println("\n=== REPARANDO PICARETA DE " + this.material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + this.durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        int durabilidadeNova = this.durabilidade + quantidade;
        int limiteMaximo = 0;

        switch (this.material.toLowerCase()) {
            case "madeira": limiteMaximo = 50;
                break;

            case "pedra": limiteMaximo = 70;
                break;

            case "ferro": limiteMaximo = 100;
                break;

            case "ouro": limiteMaximo = 30;
                break;

            default: limiteMaximo = 60;
        }

        if (durabilidadeNova > limiteMaximo) {
            System.out.println(" Reparo limitado a " + limiteMaximo);
            this.durabilidade = limiteMaximo;
        } else {
            System.out.println(" Durabilidade nova: " + durabilidadeNova);
            this.durabilidade = durabilidadeNova;
        }

    }



    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
