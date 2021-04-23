package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    /*
    Predicado: Interface funcional que recebe um parâmetro de entrada e retorna 
    'true' ou 'false'
     */
    public static void predicadoComposicao(String[] args) {

        Predicate<Integer> isPar = n -> n % 2 == 0;
        Predicate<Integer> isTresDigitos = n -> n >= 100 && n <= 999;

        System.out.println(isPar.and(isTresDigitos).negate().test(101));
        System.out.println(isPar.or(isTresDigitos).test(101));
    }

}
