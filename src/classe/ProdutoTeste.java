package classe;

public class ProdutoTeste {

    public static void produtoTeste(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4365.63;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 1.50;
        p2.desconto = 0.29;

        double precoComDesconto1 = p1.valorComDesconto();
        double precoComDesconto2 = p2.valorComDesconto();
        
        System.out.printf("Nome: %s."
                + "\nPreço: %.2f."
                + "\nDesconto: %.2f%%."
                + "\nValor com desconto: %.2f\n",
                p1.nome, 
                p1.preco, 
                p1.desconto * 100, 
                precoComDesconto1);
    }

}
