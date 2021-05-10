package generics;

public class CaixaTeste {

    public static void cxTeste(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo.");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.3);
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }

}
