package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;
    
    /*
    É possível implementar mais de um construtor também. O construtor abaixo é
    idêntico ao construtor padrão da classe. Porém, visto que um construtor foi
    definido anteriormente, o construtor padrão é sobrescrevido e caso seja
    necessário utilizar o construtor padrão, é preciso implementar um construtor
    idêntico ao padrão.
    */
    Produto() {

    }

    /*
    Construtor da classe produto. Toda classe possui um construtor padrão, porém
    é possível construir seu próprio construtor.
     */
    Produto(String nomeInicial) {
        nome = nomeInicial;
    }
  
    // Exemplo de outro construtor.
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    // Exemplo de outro construtor.
    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }
    
    double valorComDesconto() {

        return preco * (1 - desconto);

    }
}
