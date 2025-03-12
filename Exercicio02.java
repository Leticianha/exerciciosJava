import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float notaUm, notaDois;
        float media; 

        System.out.println(" ----- Sistema de notas ----- ");

        System.out.println("Digite a nota do aluno: ");
        notaUm = entrada.nextFloat();

        System.out.println("Digite a outra nota do aluno: ");
        notaDois = entrada.nextFloat();

        media = (notaUm + notaDois) / 2;

        // Se a media >= 7 então escreva APROVADO
        boolean aprovado = (media >= 7);

        if( aprovado == true ) {
            System.out.println("APROVADO");
        } else {
            if ( media >= 5) {
                System.out.println("EXAME");
            }
            else {
                System.out.println("REPROVADO...");
            }
        }

        System.out.println("A média do aluno é: " + media);

        entrada.close();
    }
}