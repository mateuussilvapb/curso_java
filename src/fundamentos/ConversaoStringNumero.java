package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

    public static void conversaoStringNumero(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número: ");
        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.printf("\nA soma dos valores é: %.2f", soma);
        System.out.printf("\nA media dos valores é: %.2f", soma / 2);

        //Ver classe BigDecimal
    }

}
