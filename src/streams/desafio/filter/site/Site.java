package streams.desafio.filter.site;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Site {

    public static void site(String[] args) {
        
        Produto p1 = new Produto("IMPRESSORA", 0.31, true);
        Produto p2 = new Produto("NOTEBOOK", 0.31, false);
        Produto p3 = new Produto("SMART TV", 29, true);
        Produto p4 = new Produto("REFRIGERADOR", 25, false);
        Produto p5 = new Produto("AR CONDICIONADO", 40, true);
        
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        
        Predicate<Produto> desconto = p -> p.getDesconto() >= 0.3;
        Predicate<Produto> frete = p -> p.isFreteGratis();
        
        Function<Produto, String> formatador = p -> "O produto " + p.getNome() +
                " está com " + (p.getDesconto() * 100) + "% de desconto e está "
                        + "com frete grátis!\n";
        
        produtos.stream()
                .filter(desconto)
                .filter(frete)
                .map(formatador)
                .forEach(System.out::println);
        
    }

}
