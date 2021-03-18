package fundamentos;

import java.util.Scanner;

public class Console {

    public static void consoleScanner(String[] args) {
//        System.out.print("Olá");
//        System.out.println("Olá");
//        System.out.printf("Megasena: %d %d %d %d %d %d", 
//                03, 05, 17, 12, 95, 97);
//        System.out.printf("\nSalário: %.1f.%n", 
//                12359.6795);
//        System.out.printf("\nNome: %s.%n", 
//                "Mateus");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite seu idade: ");
        int idade = entrada.nextInt();

        System.out.printf("\n\nOlá senhor %s %s. Seja bem vindo a plataforma! :D\n"
                + "Notamos que sua idade é: %d anos.\n", 
                nome, sobrenome, idade);
        
        //Fecha o Scanner para economizar recursos alocados
        entrada.close();
    }
}
