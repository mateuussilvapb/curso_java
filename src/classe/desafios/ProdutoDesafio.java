package classe.desafios;

public class ProdutoDesafio {

    String nome;
    static double desconto = 0.25;
    double valor;

    ProdutoDesafio(String nomeInicial, double valorInicial) {
        nome = nomeInicial;
        valor = valorInicial;
    }

    double valorComDesconto() {
        double valorDeDesconto = valor * (1 - desconto);
        return valorDeDesconto;
    }
    
    

}
