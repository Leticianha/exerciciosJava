import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int number;

        System.out.println(" ----- Sistema de números ----- ");

        System.out.println("Digite um número: ");
        number = leitor.nextInt();

        if (number %2 == 0) {
            System.out.println("PAR!");
        } else {
            System.out.println("IMPAR!");
        }

        leitor.close();
    }
}
