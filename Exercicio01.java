import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float notaUm, notaDois;

        // entrada
        System.out.println(" ----- Sistema de notas ----- ");

        System.out.println("Digite a nota do aluno: ");
        notaUm = entrada.nextFloat();

        System.out.println("Digite a outra nota do aluno: ");
        notaDois = entrada.nextFloat();

        // processamento
        float media = (notaUm + notaDois) / 2;

        // saida
        System.out.println("A média do aluno é: " + media);

        entrada.close();
    }
}