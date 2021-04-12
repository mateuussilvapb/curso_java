package array;

import java.util.Arrays;

public class Exercicios {

    public static void exercicios(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 3.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        System.out.printf("\nMédia: %.2f.\n", total / notasAlunoA.length);

        /*
        Essa é outra forma de se inicializar um array. Utilizando as chaves, é
        possível atribuir os valores de forma literal, sem que seja necessário
        declarar seu tamanho (está implicito).
         */
        double[] notasAlunoB = {8.3, 9.6, 5.8, 7.2};

        total = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            total += notasAlunoB[i];
        }

        System.out.printf("\nMédia: %.2f.\n", total / notasAlunoB.length);
    }

}
