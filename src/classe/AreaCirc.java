package classe;

import java.lang.Math;

public class AreaCirc {

    double raio;
    /*
    O 'static' indica que o valor da variável 'pi' está associado diretamente a
    classe e não a instância de variável em si.
     */
    static final double PI = 3.1415;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return Math.pow(raio, 2) * PI;
    }

    /*
    Nesse exemplo criamos um método estático. Observe que ele tem o mesmo nome
    do método anterior. O que os diferencia são os parâmetros. 
    Um método estático possitibilita sua invocação sem que seja necessário a
    criação de uma instância. Ou seja, é possível acessá-lo utilizando apenas o 
    nome da classe.
     */
    static double area(double raio) {
        return Math.pow(raio, 2) * PI;
    }

}
