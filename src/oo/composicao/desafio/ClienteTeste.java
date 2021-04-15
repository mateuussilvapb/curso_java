package oo.composicao.desafio;

public class ClienteTeste {

    public static void clienteTeste(String[] args) {

        Cliente cliente1 = new Cliente("Mateus");

        Produto p1 = new Produto("Caneta Azul", 1);
        Produto p2 = new Produto("Borracha", 2);
        Produto p3 = new Produto("Resma", 15);
        Produto p4 = new Produto("Carregador", 25);
        Produto p5 = new Produto("Fone", 20);
        Produto p6 = new Produto("Película", 15);

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        Item item1 = new Item(10, p1);
        Item item2 = new Item(20, p2);
        Item item3 = new Item(10, p3);
        Item item4 = new Item(1, p4);

        compra1.addItens(item1);
        compra1.addItens(item2);
        compra2.addItens(item3);
        compra2.addItens(item4);

        cliente1.addCompra(compra1);
        cliente1.addCompra(compra2);

        System.out.println(cliente1.valorTotal());
    }

}
