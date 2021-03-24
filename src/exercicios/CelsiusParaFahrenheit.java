package exercicios;

import javax.swing.JOptionPane;

public class CelsiusParaFahrenheit {

    public static void celsiusParaFahrenheit(String[] args) {

        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius"));
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("O valor em Celsius é de %.2fº.\n"
                + "Já o valor em Fahrenheit é de %.2fº.\n",
                celsius, fahrenheit);
    }

}
