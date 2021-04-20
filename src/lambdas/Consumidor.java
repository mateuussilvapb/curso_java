package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.printf(
                "---DESCRIÇÃO---\nNome: %s\nValor: %.2f\nCom desconto: %.2f\n\n",
                p.nome, p.preco, (p.preco * (1 - p.desconto)));
        Produto p1 = new Produto("Impressora", 4199, 0.1);
        imprimir.accept(p1);
        Produto p2 = new Produto("Notebook", 4899, 0.1);
        Produto p3 = new Produto("Smart TV", 2199, 0.1);
        Produto p4 = new Produto("Guarda Roupa", 2299, 0.1);
        Produto p5 = new Produto("Máquina de Lavar", 2699, 0.1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);
    }

}
