package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void imprimindoObjetos(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        //PRIMEIRA FORMA DE IMPRIMIR (JEITO TRADICIONAL)
        System.out.println("--- JEITO TRADICIONAL ---");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        //SEGUNDA FORMA DE IMPRIMIR (forEach)
        System.out.println("\n--- UTILIZANDO forEach ---");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        //TERCEIRA FORMA DE IMPRIMIR (USANDO ITERATOR)
        System.out.println("\n--- UTILIZANDO ITERATOR ---");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        //QUARTA FORMA DE IMPRIMIR (UTILIZANDO STREAM)
        System.out.println("\n--- UTILIZANDO STREAM ---");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }

}
