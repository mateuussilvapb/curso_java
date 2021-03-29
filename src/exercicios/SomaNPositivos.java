package exercicios;

import java.util.Scanner;

public class SomaNPositivos {

    public static void somaNPositivos(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valor = 0;
        double total = 0;

        do {
            System.out.print("Informe um número positivo (informe um número negativo para sair): ");
            valor = entrada.nextDouble();
            if (valor >= 0) {
                total += valor;
                System.out.printf("A soma do valor informado junto com os anteriores é de: %.2f.\n\n", total);
            }
        } while (valor >= 0);

        System.out.printf("O resultado final é: %.2f.\n", total);

        entrada.close();

    }

}
