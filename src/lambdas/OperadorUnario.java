package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void operadorUnario(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> menosDois = n -> n - 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> divididoDois = n -> n / 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;
        
        /*
        'andThen' executa a sequência de funções em sequência, de acordo com que
        foram chamadas.
        */
        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(resultado1);
        
        /*
        'compose' faz exatamente o contrário que 'andThen'
        */
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);
        
    }

}
