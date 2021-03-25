package controle;

import javax.swing.JOptionPane;

public class IfElse {

    public static void iffElse(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe um número");
       
        int numero = Integer.parseInt(valor);
        int modulo = numero % 2;

        if (modulo == 0) {
            System.out.println("Número é par.");
        } else {
            System.out.println("Número é impar.");
        }
        
        System.out.println(modulo);
    }

}
