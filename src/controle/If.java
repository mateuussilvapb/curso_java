package controle;

import java.util.Scanner;

public class If {

    public static void iff(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado.");
            System.out.println("Parabéns.");
        }
        if (media < 7 && media >= 5) {
            System.out.println("Em recuperção.");
        }
        if (media < 5 && media >= 0) {
            System.out.println("Repovrado.");
        }
        entrada.close();
    }
}
