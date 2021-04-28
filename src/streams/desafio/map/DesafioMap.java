package streams.desafio.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void desafioMap(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Object> println = System.out::println;

        UnaryOperator<String> inverter = 
                s -> new StringBuilder(s).reverse().toString();
        /*
        'parseInt(s, 2)' faz com que o Integer entenda que o que está sendo 
        passado é um valor binário. Além disso, ele converte o valor binário
        para inteiro.
        */
        Function<String, Integer> binarioToInt = 
                s -> Integer.parseInt(s, 2);
        
        System.out.println("--- NÚMEROS ANTES DA CONVERSÃO ---");
        nums.stream().forEach(println);
        System.out.println("--- NÚMEROS DEPOIS DA CONVERSÃO---");
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioToInt)
                .forEach(println);
    }

}
