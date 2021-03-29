package exercicios;

import java.lang.Math;
import java.util.Scanner;

public class JogoAdvinhacao {

    public static void jogoAdvinhacao(String[] args) {

        int numAleatorio = (int) (Math.random() * 100) + 1;
        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        int tentativas = 1;
        System.out.println("JOGO DA ADVINHAÇÃO!\n");

        do {
            System.out.printf("Você está na sua %dº tentativa!\nInforme um número: ", tentativas);
            valor = entrada.nextInt();
            tentativas++;
            if (valor > numAleatorio) {
                System.out.println("--O valor informado é maior que o número secreto.--\n");
            } else if (valor < numAleatorio) {
                System.out.println("--O valor informado é menor que o número secreto.--\n");
            }
        } while (valor != numAleatorio && tentativas <= 10);
        
        if (valor == numAleatorio) {
            System.out.printf("\nParabén, você acertou!\n"
                    + "O número gerado aleatoriamente foi: %d\n",
                    numAleatorio);
        } else if (tentativas == 11 && valor == numAleatorio) {
            System.out.printf("\nParabén, você acertou!\n"
                    + "O número gerado aleatoriamente foi: %d\n",
                    numAleatorio);
        } else if (tentativas == 11 && valor != numAleatorio) {
            System.out.printf("\nInfelizmente, não foi dessa vez!\n"
                    + "O número aleatório foi: %d.\n", numAleatorio);
        } else {
            System.out.println("ERRO!");
        }

        entrada.close();
    }

}
