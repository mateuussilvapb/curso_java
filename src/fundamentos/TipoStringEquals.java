package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void tipoStringEquals(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        String s2 = "2";

        System.out.println("2" == s1);
        System.out.println("2" == s2);
        System.out.println("2".equals(s1));

        Scanner input = new Scanner(System.in);
        /*
        '.nextLine()' coleta toda a informação da linha, até espaços em branco.
        Já o 'next()' coleta ignora os espaços em branco.
         */
        String s3 = input.nextLine();

        //'.trim' remove os espaços em branco da String
        System.out.println("2" == s3.trim());
        System.out.println("2".equals(s3.trim()));

        input.close();

        //Moral da história: use '.equals()' para comparar strings. rsrsrs
    }

}
