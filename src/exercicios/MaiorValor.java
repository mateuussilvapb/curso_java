package exercicios;

import java.util.Scanner;

public class MaiorValor {

    public static void maiorValor(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int atual;
        int controle;
        System.out.print("Informe o 1º valor: ");
        atual = entrada.nextInt();
        controle = atual;

        for (int i = 2; i <= 10; i++) {
            System.out.printf("\nInforme o %dº valor: ", i);
            atual = entrada.nextInt();
            if (atual > controle) {
                controle = atual;
            }
        }
        
        System.out.printf("\nO mairo valor informado foi: %d.\n", controle);
        
        entrada.close();

    }

}
