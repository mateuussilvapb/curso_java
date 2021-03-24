package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void desafioCalculadora(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor 1: ");
        double n1 = Double.parseDouble(entrada.nextLine().replace(",", "."));
        
        System.out.print("\nInforme o valor 2: ");
        double n2 = Double.parseDouble(entrada.nextLine().replace(",", "."));
        
        System.out.print("\nInforme a operação: ");
        String op = entrada.next();
        
        double resultado = op.equals("+") ? n1+n2 : 0;
        resultado = op.equals("-") ? n1 - n2 : resultado;
        resultado = op.equals("*") ? n1 * n2 : resultado;
        resultado = op.equals("/") ? n1 / n2 : resultado;
        resultado = op.equals("%") ? n1 % n2 : resultado;
        
        System.out.printf("\n%.2f %s %.2f = %.2f", 
                n1, op, n2, resultado);
        
        entrada.close();
               
    }
}
