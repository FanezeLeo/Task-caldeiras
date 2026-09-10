import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        boolean continua = true;

        while(continua){
            System.out.println("1 - Ver animais do curral");
            System.out.println("2 - Comércio (Coletar/retirar produtos");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    break;
            }
        }

    }
}