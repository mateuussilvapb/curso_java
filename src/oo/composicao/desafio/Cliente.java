package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void addCompra(Compra compra) {
        this.compras.add(compra);
    }

    double valorTotal() {
        double total = 0;
        if (!compras.isEmpty()) {
            for (Compra compra : compras) {
                total += compra.obterValorTotal();
            }
        }
        return total;
    }

}
