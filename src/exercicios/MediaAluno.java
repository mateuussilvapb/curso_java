package exercicios;

import java.util.Scanner;

public class MediaAluno {
    
    public static void mediaAluno(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("\nInforme a segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 7 && media <= 10) {
            System.out.println("\nAprovaodo!");
        } else if (media >= 4 && media < 7) {
            System.out.println("\nEm recuperação!");
        } else if (media < 4 && media >= 0) {
            System.out.println("\nReprovado!");
        } else {
            System.out.println("\nNota informada inválida!");
        }
        
        entrada.close();
        
    }
    
}
