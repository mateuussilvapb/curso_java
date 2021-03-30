package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void desafioDiaSemana(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String dia = entrada.next();
        int codigo;

        if (dia.equalsIgnoreCase("domingo")) {
            codigo = 1;
        } else if (dia.equalsIgnoreCase("segunda")) {
            codigo = 2;
        } else if (dia.equalsIgnoreCase("terça")
                || dia.equalsIgnoreCase("terca")) {
            codigo = 3;
        } else if (dia.equalsIgnoreCase("quarta")) {
            codigo = 5;
        } else if (dia.equalsIgnoreCase("quinta")) {
            codigo = 6;
        } else if (dia.equalsIgnoreCase("sexta")) {
            codigo = 7;
        } else if (dia.equalsIgnoreCase("sábado") 
                || dia.equalsIgnoreCase("sabado")) {
            codigo = 8;
        } else {
            System.out.println("Dia inválido.");
            codigo = -1;
        }

        System.out.println(codigo);

        entrada.close();
    }

}
