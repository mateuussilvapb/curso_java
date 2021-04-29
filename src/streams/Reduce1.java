package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void red1(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;

        Integer total1 = nums.stream()
                .reduce(soma)
                .get();
        System.out.println(total1);

        Integer total2 = nums.stream()
                .reduce(100, soma);
        System.out.println(total2);

        Integer total3 = nums.parallelStream()
                .reduce(100, soma);
        System.out.println(total3);
        
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                //ifPresent verifica se a função está vazia
                .ifPresent(System.out::println);
    }

}
