package array.desafio;

import java.util.Scanner;
import java.util.Arrays;

public class MediaAlunoAprimorado {

    public static void nediaAlunosAprimorado(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeAlunos, quantidadeNotas;
        System.out.print("Informe a quantidade de aluno: ");
        quantidadeAlunos = entrada.nextInt();
        System.out.print("\nInforme a quantidade de notas que cada aluno possui: ");
        quantidadeNotas = entrada.nextInt();
        double[][] matrizNotas = new double[quantidadeAlunos][quantidadeNotas];

        entrada = new Scanner(System.in);
        for (int i = 0; i < matrizNotas.length; i++) {
            for (int j = 0; j < matrizNotas[0].length; j++) {
                System.out.printf("\nInforme a nota %d do aluno %d: ",
                        (j + 1), (i + 1));
                matrizNotas[i][j] = entrada.nextDouble();
            }
        }

        double[] medias = new double[matrizNotas.length];
        for (int i = 0; i < matrizNotas.length; i++) {
            double soma = 0;
            for (int j = 0; j < matrizNotas[0].length; j++) {
                soma += matrizNotas[i][j];
            }
            medias[i] = soma / matrizNotas[0].length;
        }

        for (int i = 0; i < medias.length; i++) {
            System.out.printf("\nA média do aluno %d é de %.2f.",
                    (i + 1), medias[i]);
        }

        entrada.close();

    }

}
