package controle;

import java.util.Scanner;

public class DoWhile {

    public static void doWhile(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String texto = "";
        
        do {
            System.out.println("\nVocê precisa falar as "
                    + "palavras mágicas...");
            System.out.print("Quer sair? R: ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));
                
        System.out.println("Obrigado!");
        
        entrada.close();
        
    }

}
