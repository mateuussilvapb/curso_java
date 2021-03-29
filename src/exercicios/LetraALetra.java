package exercicios;

import java.util.Scanner;

public class LetraALetra {

    public static void letraALetra(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe uma palavra: ");
        String palavra = entrada.next();
        
        for (int i = 0; i < palavra.length(); i++) {
            System.out.printf("\n[%s]", palavra.charAt(i));
        }
        
        entrada.close();
        
    }
    
}
