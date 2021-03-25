package desafios;

import java.util.Scanner;

public class DesafioWhile1 {

    public static void desafioWhile1(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String resposta = "";

        while (!resposta.equalsIgnoreCase("sair")) {

            System.out.print("\nMe diz o que? R: ");
            resposta = entrada.nextLine();

        }

        entrada.close();

    }

}
