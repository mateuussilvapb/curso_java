package lambdas.desafio;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import lambdas.Produto;

public class Desafio {

    public static void desafio(String[] args) {

        //Recebe um tipo e retorna outro
        Function<Produto, Double> valorFinal
                = produto -> produto.getPreco() * (1 - produto.getDesconto());

        //Recebe um tipo e retorna o mesmo
        UnaryOperator<Double> impostoMunicipal
                = valor -> valor >= 2500 ? valor * 1.085 : valor;

        //Recebe um tipo e retorna o mesmo
        UnaryOperator<Double> frete
                = valor -> valor >= 3000 ? valor + 100 : valor + 50;

        //Recebe um tipo e retorna o mesmo
        UnaryOperator<Double> arredondar
                = valor -> Double.parseDouble(String.format("%.2f", valor));

        //Recebe um tipo e retorna outro
        Function<Double, String> formatar
                = valor -> ("R$" + valor).replace(".", ",");

        Produto p = new Produto("iPad", 4000, 0.1);
        String preco = (valorFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p));

        System.out.println("O preco final é: " + preco);
    }

}
