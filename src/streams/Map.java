package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void map(String[] args) {
     
        /*
        Consumer é uma interface que recebe um parâmetro e não retorna nada.
        */
        Consumer<String> print = System.out::print;
        
        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
        
        /*
        'stream()' é a operação de built, ou seja, é a operação que constroi
        a stream.
        'map()' é uma função intermediária. Por meio dela, é possível chamar
        outras funções intermediárias.
        'forEach()' é uma função terminal. Isso significa que após ela, não
        poderá ter outras funções.
        */
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);
        
//        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
//        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + " ";
//        UnaryOperator<String> grito = n -> n + "!!! ";
        
        //É possível utilizar o System.out.printl
        System.out.println(Utilitarios.maiuscula.andThen(Utilitarios.primeiraLetra).andThen(Utilitarios::grito).apply("BMW"));
        
        //Utilizando Stram
        System.out.println("\n\n--- USANDO COMPOSIÇÃO ---");
        marcas.stream().map(Utilitarios.maiuscula).forEach(print);
        System.out.println("\n");
        marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).forEach(print);
        System.out.println("\n");
        marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).map(Utilitarios::grito).forEach(print);
    }

}
