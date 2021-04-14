package oo.composicao.venda;

public class CompraTeste {

    public static void compraTeste(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Mateus Dias";
        compra1.adicionarItens("Caneta", 20, 7.5);
        compra1.adicionarItens("Borracha", 12, 3.89);
        compra1.adicionarItens("Caderno", 3, 18.79);

    }

}
