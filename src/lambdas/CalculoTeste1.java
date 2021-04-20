package lambdas;

public class CalculoTeste1 {

    public static void calc1(String[] args) {
        Calculo soma = new Somar();
        Calculo multiplicacao = new Multiplicar();

        double resultado = soma.executar(2, 3);
        System.out.println(resultado);

        resultado = multiplicacao.executar(2, 3);
        System.out.println(resultado);
    }

}
