package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void predicado(String[] args) {

        Predicate<Produto> isCaro
                = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        Produto produto = new Produto("NOTEBOOK", 3893, 0.15);

        System.out.println(isCaro.test(produto));
    }

}
