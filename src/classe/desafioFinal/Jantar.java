package classe.desafioFinal;

import java.util.Scanner;

public class Jantar {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String comida, nome;
        double peso;
        
        System.out.print("\nInforme o nome do primeiro prato: ");
        comida = entrada.nextLine();
        System.out.print("Informe o peso do primeiro prato: ");
        peso = entrada.nextDouble();
        Comida c1 = new Comida(comida, peso);
        entrada = new Scanner(System.in);
        
        System.out.print("\nInforme o nome do segundo prato: ");
        comida = entrada.nextLine();
        System.out.print("Informe o peso do segundo prato: ");
        peso = entrada.nextDouble();
        Comida c2 = new Comida(comida, peso);
        entrada = new Scanner(System.in);
        
        System.out.print("\nInforme o nome da pessoa: ");
        nome = entrada.nextLine();
        System.out.print("Informe o peso da pessoa: ");
        peso = entrada.nextDouble();
        Pessoa p1 = new Pessoa(nome, peso);
        
        System.out.printf("\nNome: %s.\nPeso antigo: %.2f",
                p1.nome, p1.peso);
        p1.comer(c1);
        p1.comer(c2);
        System.out.printf("\n\nNome: %s.\nPeso atual: %.2f",
                p1.nome, p1.peso);
        
        entrada.close();
    }
}
