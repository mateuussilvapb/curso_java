package classe;

import java.util.Scanner;

public class CalculadoraAvancada {

    public static void calculadoraAvancada(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("CALCULADORA!\n");

        System.out.print("Informe o primeiro valor: ");
        double n1 = entrada.nextDouble();

        System.out.print("\nInforme a operação: ");
        String op = entrada.next();

        System.out.print("\nInforme o segundo valor: ");
        double n2 = entrada.nextDouble();

        double resultado;

        switch (op) {
            case "+":
                resultado = soma(n1, n2);
                break;
            case "-":
                resultado = subtracao(n1, n2);
                break;
            case "/":
                resultado = divisao(n1, n2);
                break;
            case "*":
                resultado = multiplicacao(n1, n2);
                break;
            default:
                System.out.println("OPERAÇÃO INFORMADA INVÁLIDA!");
                resultado = 0;
                break;
        }

        System.out.printf("\n%.2f %s %.2f = %.2f.\n",
                n1, op, n2, resultado);

        entrada.close();

    }

    public static double soma(double n1, double n2) {

        double resultado = n1 + n2;
        return resultado;

    }

    public static double subtracao(double n1, double n2) {

        double resultado = n1 - n2;
        return resultado;

    }

    public static double multiplicacao(double n1, double n2) {

        double resultado = n1 * n2;
        return resultado;

    }

    public static double divisao(double n1, double n2) {

        double resultado = n1 / n2;
        return resultado;

    }

}
