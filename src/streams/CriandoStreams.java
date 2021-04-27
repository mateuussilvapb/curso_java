package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void criandoStreams(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Pearl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        /*
        Imprime um array definindo quais elementos devem ser impressos.
        Para o exemplo, o elemento de índice 3 não é adicionado a impressão.
         */
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        /*
        Executa o código de forma paralela. Ou seja, as informações no array 
        podem ser mostradas sem estar em sequência
         */
        outrasLangs.parallelStream().forEach(print);

        /*
        Gera uma stream potencialmente infinita sem ordenação
         */
        Stream.generate(() -> "A").forEach(print);

        /*
        Gera uma stream potencialmente infinita com ordenação.
        O primeiro parâmetro é o valor inicial.
         */
        Stream.iterate(0, n -> n + 1).forEach(println);

    }

}
