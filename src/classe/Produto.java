package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    double valorComDesconto() {
        
        return preco * (1 - desconto);
        
    }
}
