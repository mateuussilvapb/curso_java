package padroes.observer;

public class AniversarioSurpresa {

    public static void anSur(String[] args) {
     
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();
        
        porteiro.registrarObservador(namorada);
        porteiro.monitorar();
    }

}
