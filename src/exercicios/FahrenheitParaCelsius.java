package exercicios;

import javax.swing.JOptionPane;

public class FahrenheitParaCelsius {

    public static void fahrenheitParaCelsius(String[] args) {
        
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog
        ("Informe a tempera em Fahrenheit"));
        
       double celsius = (fahrenheit - 32)/1.8;
       
       System.out.printf("O valor em Fahrenheit é de %.2fº.\n"
                + "Já o valor em Celsius é de %.2fº.\n",
                fahrenheit, celsius);
    }

}
