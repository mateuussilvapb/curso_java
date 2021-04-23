package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void fornecedor(String[] args) {
        /*
        'Supplier' implementa uma interface que não recebe nem um parâmetro para
        realizar a operação. Tendo em vista isso, é necessário que, antes da estrutura
        da função, seja colocado um parêntese vasio, indicando que a função não recebe
        nada como parâmetro.
        */
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Lia", "Bia", "Gui");
        System.out.println(umaLista.get());
    }

}
