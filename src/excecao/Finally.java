package excecao;

import java.util.Scanner;

public class Finally {

    public static void finallyy(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println(7 / entrada.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        //finally sempre é chamado dando erro na execução do try ou não
        } finally {
            System.out.println("finally...");
            entrada.close();
        }

        System.out.println("FIM");
    }

}
