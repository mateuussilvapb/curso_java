package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    void addItens(Item item) {
        this.itens.add(item);
    }

    double obterValorTotal() {
        double total = 0;
        if (!itens.isEmpty()) {
            for (Item item : itens) {
                if (item.quantidade > 0) {
                    total += item.quantidade * item.produto.preco;
                }
            }
        }
        return total;
    }

}
