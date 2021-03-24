package exercicios;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Potencia {

    public static void potencia(String[] args) {

        double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor."));
        double pot2 = Math.pow(numero, 2);
        double pot3 = Math.pow(numero, 3);

        System.out.printf("O valor elevado a dois é de: %.2f.\n"
                + "O valor elevado a 3 é de: %.2f.\n",
                pot2, pot3);

    }

}
