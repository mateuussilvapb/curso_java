package colecoes;

import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

public class ConjuntoComportado {

    public static void conjuntoComportado(String[] args) {

        /*
        Ao acrescentar '<String>' após o 'Set', estamos informando que o conjunto
        de dados será do tipo String.
         */

 /*
        'SortedSet' é um conjunto de sets que podem ser configurados de forma 
        ordenada.
        'TreeSet' ordena os itens de forma alfabética ou do menor para o maior.
         */
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("MATEUS");
        listaAprovados.add("MARIA");
        listaAprovados.add("ZENEUDA");
        listaAprovados.add("MARCOS");
        listaAprovados.add("CLEONIDES");
        listaAprovados.add("RENÊ");
        for (String candidatos : listaAprovados) {
            System.out.println("Nome: " + candidatos);
        }

        SortedSet<Integer> numeros = new TreeSet<>();
        numeros.add(9);
        numeros.add(7);
        numeros.add(76);
        numeros.add(5);
        numeros.add(1);

        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

    }

}
