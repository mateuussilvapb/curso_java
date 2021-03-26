package exercicios;

import java.util.Scanner;

public class Entre0e10Par {

    public static void entre0e10Par(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um valor (entre 0 e 10): ");
        int numero = entrada.nextInt();
        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
            System.out.printf("O número informado foi: %d.\n"
                    + "Ele é par.\n", numero);
        } else if (numero >= 0 && numero <= 10) {
            System.out.printf("O número informado foi: %d.\n"
                    + "Ele é impar.\n", numero);
        } else {
            System.out.println("Número inválido. \n"
                    + "Digite um número entre 0 e 10.");
        }
        entrada.close();

    }

}
