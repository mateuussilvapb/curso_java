package generics;

public class CaixaNumeroTeste {

    public static void cxNumTeste(String[] args) {
     
        CaixaNumero<Double> caixa = new CaixaNumero<>();
        caixa.guardar(1.2);
        Double coisa = caixa.abrir();
        System.out.println(coisa);
     
        CaixaNumero<Integer> caixa2 = new CaixaNumero<>();
        caixa2.guardar(1);
        Integer coisa2 = caixa2.abrir();
        System.out.println(coisa2);
    }
}
