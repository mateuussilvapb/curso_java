package fundamentos.operadores;

public class DesafioLogico {

    public static void desafioLogico(String[] args) {
        //Trabalho na Terça (V ou F)
        //Trabalho na Quinta (V ou F)

        boolean tTerca = false;
        boolean tQuinta = false;

        boolean tv50 = tTerca && tQuinta;
        boolean tv32 = tTerca ^ tQuinta;
        boolean sorvete = tTerca || tQuinta;
        boolean saldavel = !sorvete;

        System.out.print("\nComprou a televisao de 50\"?  " + tv50);
        System.out.print("\nComprou a televisao de 32\"?  " + tv32);
        System.out.print("\nForam tomar sorvete?  " + sorvete);
        System.out.print("\nEstá mais saudável?  " + saldavel + "\n");

    }

}
