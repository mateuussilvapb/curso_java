package generics;

public class CaixaIntTeste {

    public static void cxIntTeste(String[] args) {
        
        CaixaInt caixa = new CaixaInt();
        caixa.guardar(1);
        Integer coisa = caixa.abrir();
        System.out.println(coisa);
    }

}
