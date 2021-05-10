package generics;

public class CaixaObjetoTeste {

    public static void cxObjTes(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); //double -> Double
        
        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);
        
        CaixaObjeto caixaB = new CaixaObjeto();
        caixaA.guardar("Olá"); //double -> Double
        
        String coisaB = (String) caixaA.abrir();
        System.out.println(coisaB);
    }

}
