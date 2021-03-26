package exercicios;

import java.util.Scanner;

public class NumeroPrimo {

    public static void numeroPrimo(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número e descubra se ele é primo: ");
        int numero = entrada.nextInt();
        int contador = 0;
        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contador = 1;
                System.out.printf("%d / %d = %d\n", 
                        numero, i, numero/i);
            }
        }
        
        if (contador != 0) {
            System.out.printf("O número %d não é primo.\n", 
                    numero);
        } else {
            System.out.printf("O número %d é primo.\n", 
                    numero);
            
        }

        entrada.close();

    }

}
