package array.desafio;

import java.util.Scanner;
import java.util.Arrays;

public class MediaAluno {

    public static void mediaAluno(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int quantNotas;

        System.out.print("Informe a quantidade de notas "
                + "que você deseja informar: ");
        quantNotas = entrada.nextInt();
        double[] notas = new double[quantNotas];
        entrada = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nInforme a nota %d: ", i + 1);
            notas[i] = entrada.nextDouble();
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        System.out.println(Arrays.toString(notas));
        System.out.printf("\nMédia: %.2f.", soma / notas.length);
        entrada.close();
    }
}
