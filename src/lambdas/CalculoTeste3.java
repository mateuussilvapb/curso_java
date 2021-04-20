package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void calc3(String[] args) {
        /*
        O trecho de código abaixo define uma função lambda. Observe que a classe
        'Calculo' que é uma interface possui apenas um método que recebe duas
        variáveis e retorna um double.
        
        Ao associar a variável 'soma' com a interface 'Calculo' é possível implementar
        uma função "sem nome", visto que na interface a função não está implementada
        de fato, mas apenas definida.
        
        Na primeira parte, '(x, y)' representam as duas variáveis que a função 
        'executar' na interface 'Calculo' recebe. Após o '->', O que estiver
        definido dentro dos colchetes representa o retorno da função, desde que
        seja condizente com o método definido na interface.

        O java não permite a conversão implicita de int -> Double.
        Porém, ele permite a conversão implicita de double -> Double.
         */
        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.apply(2.0, 3.0));

        /*
        No exemplo abaixo, a função não foi definida dentro de colchetes.
        Ao utilizar lambda dessa forma, não é necessário utilizar o 'return',
        visto que o mesmo fica implicito
         */
        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));

        /*
        O 'pulo do gato' das funções lambdas está na sua simplicidade. Observe que
        não é necessário implementar uma classe para definir os métodos de uma interface.
        No próximo exemplo, utilizando os colchetes, observe que é possível criar toda
        uma sentença de código, desde que a mesma esteja dentro dos colchetes.
        Observe também que com apenas uma variável foi possível criar diversos métodos.
         */
        calc = (x, y) -> {
            double a;
            a = x / y;
            return a;
        };
        System.out.println(calc.apply(2.0, 3.0));
    }
}
