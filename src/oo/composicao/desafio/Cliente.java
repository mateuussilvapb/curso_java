package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double obterValorTotal() {
        double total = 0;
        if (!compras.isEmpty()) {
            for (Compra compra : compras) {
                if (!compra.itens.isEmpty()) {
                    for (Item item : compra.itens) {
                        if (item.quantidade > 0) {
                            total += item.quantidade * item.produto.preco;
                        }
                    }
                }
            }
        }
        return total;
    }

}
