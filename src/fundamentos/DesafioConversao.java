package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void desafioConversao(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu último salário: ");
        String s1 = input.next().replace(",", ".");

        System.out.print("\nInforme seu penúltimo salário: ");
        String s2 = input.next().replace(",", ".");

        System.out.print("\nInforme seu antepenúltimo salário: ");
        String s3 = input.next().replace(",", ".");

        double sa1 = Double.parseDouble(s1);
        double sa2 = Double.parseDouble(s2);
        double sa3 = Double.parseDouble(s3);
        double media = (sa1 + sa2 + sa3) / 3;

        System.out.printf("\nA média dos últimos 3 salários é: %.2f", media);
        input.close();
    }

}
