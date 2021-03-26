package controle;

import java.util.Scanner;

public class SwitchComBreak {

    public static void switchComBreak(String[] args) {

        String conceito = "";

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a nota: ");
        int nota = entrada.nextInt();
        entrada.close();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
                conceito = "E";
                break;
            case 0:
                conceito = "F";
                break;
            default:
                conceito = "não informado corretamente.";
                break;
        }

        System.out.printf("\nResultado: %s\n", conceito);

    }
}
