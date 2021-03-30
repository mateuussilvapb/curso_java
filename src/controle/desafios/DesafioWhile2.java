package controle.desafios;

import java.util.Scanner;

public class DesafioWhile2 {

    public static void desafioWhile2(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double total = 0;
        double atual = 0;
        int contador = 0;

        do {
            System.out.print("Informe uma nota: ");
            atual = entrada.nextDouble();
            if (atual >= 0 && atual <= 10) {
                total = total + atual;
                contador++;
            } else if (atual != -1) {
                System.out.println("Nota digitada está inválida!");
            }
        } while (atual != -1);

        double media = total / contador;

        System.out.printf("\nObrigado!\n"
                + "A média é de %.2f\n", media);

        entrada.close();

    }

}
