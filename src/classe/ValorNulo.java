package classe;

import classe.desafios.Data;
import java.lang.Math;

public class ValorNulo {

    public static void valorNulo(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!"));

        /*
        Variáveis possuem valores padrões atrelados a elas. Por exemplo, caso
        uma variável inteira seja declarada porém não inicializada, seu valor 
        será 0 (para os casos de variáveis globais. Variáveis locais não são
        inicializadas por padrão).
        Já objetos rebem o valor null. Isso significa que caso um objeto seja
        declado, porém não inicializado (como no exemplo abaixo), seu valor 
        será null. Isso significa que não existirá um endereço de memória que 
        esteja armazenando 's2', por exemplo. Por isso, não é possível concatenar
        "!!!" a s2.
        Já s1, apesar de ser vazia, não está nula e, por isso, é possível concatenar
        algo a ela.
         */
        double aleatorio = Math.random();
        Data d1 = aleatorio > 0.5 ? new Data() : null;
        System.out.println(aleatorio);

        if (d1 != null) {
            d1.imprimirDataFormatada();
        }

    }

}
