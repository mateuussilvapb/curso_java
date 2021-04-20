package lambdas;

/*
Ao utilizar a marcação 'FunctionalInterface' além de especificar que a classe
é uma interface, é especificado também que serão utilizadas funções lambdas associadas
a essa classe. 

Com isso, não será possível definir outros métodos na interface, visto que uma
interface funcional é uma interface com apenas um único método abstrato.
Observe também que, apesar de termos definido apenas um método abstrato, nada impede
que um método 'default' seja definido. 

Um método 'default' é um método que não precisa necessariamente ser sobrescrito 
nas classes que herdam e, por obrigação, implementam uma interface. Ou seja, o método
'default' só precisa ser implementado de fato na interface.

Também é possível implementar métodos 'static'. Os métodos e variáveis 'static' são
aqueles que não precisam estar relacionados a uma variável ou instância de classe.
 */
@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String muitoLegal() {
        return "MUITO LEGAL";
    }

    static String legal() {
        return "LEGAL";
    }
}
