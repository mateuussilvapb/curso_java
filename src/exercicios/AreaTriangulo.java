package exercicios;

import javax.swing.JOptionPane;

public class AreaTriangulo {

    public static void areaTriangulo(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo (em cm)."));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo (em cm)."));
        double area = (base * altura) / 2;
        System.out.printf("A area do triângulo corresponde a %.2f cm²", area);
    }
}
