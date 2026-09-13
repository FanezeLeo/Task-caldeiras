public class oldSteve {

    public static void Main(String[] args) {

        Picareta picaretaMadeira = new Picareta("madeira", 50, 2);
        Picareta picaretaPedra = new Picareta("pedra", 70, 4);
        Picareta picaretaFerro = new Picareta("ferro", 100, 6);
        Picareta picaretaOuro = new Picareta("ouro", 30, 8);

        System.out.println("Madeira:");
        System.out.println("Material: " + picaretaMadeira.getMaterial());
        System.out.println("Durabilidade: " + picaretaMadeira.getDurabilidade());
        System.out.println("Força: " + picaretaMadeira.getForca());

        picaretaMadeira.minerar(10);

        picaretaMadeira.repararPicareta(5);

        System.out.println("\nPedra:");
        System.out.println("Material: " + picaretaPedra.getMaterial());
        System.out.println("Durabilidade: " + picaretaPedra.getDurabilidade());
        System.out.println("Força: " + picaretaPedra.getForca());

        picaretaPedra.minerar(20);

        picaretaPedra.repararPicareta(30);

        System.out.println("\nFerro:");
        System.out.println("Material: " + picaretaFerro.getMaterial());
        System.out.println("Durabilidade: " + picaretaFerro.getDurabilidade());
        System.out.println("Força: " + picaretaFerro.getForca());

        picaretaFerro.minerar(40);

        picaretaFerro.repararPicareta(20);

        System.out.println("\nOuro:");
        System.out.println("Material: " + picaretaOuro.getMaterial());
        System.out.println("Durabilidade: " + picaretaOuro.getDurabilidade());
        System.out.println("Força: " + picaretaOuro.getForca());

        picaretaOuro.minerar(35);
        picaretaOuro.repararPicareta(50);


    }
}