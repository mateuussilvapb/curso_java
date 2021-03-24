package exercicios;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Imc {

    public static void imc(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura").replace(",", "."));

        double imc = peso / Math.pow(altura, 2);

        String resultado = imc < 18.5 ? "Você está abaixo do peso ideal." : "";
        resultado = imc >= 18.5 && imc <= 24.9 ? "Você está no seu peso ideal." : resultado;
        resultado = imc >= 25 && imc <= 29.9 ? "Você está com sobrepeso." : resultado;
        resultado = imc >= 30 && imc <= 34.9 ? "Você está com obesidade de grau I." : resultado;
        resultado = imc >= 35 && imc <= 39.9 ? "Você está com obesidade de grau II." : resultado;
        resultado = imc >= 40 ? "Você está com obesidade de grau III (mórbida)." : resultado;

        System.out.printf("Seu IMC é de: %.2f.\n"
                + "%s\n", imc, resultado);
    }

}
