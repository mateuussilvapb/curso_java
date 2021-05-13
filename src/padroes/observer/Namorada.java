package padroes.observer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Namorada implements ObservadorChegadaAniversariante{

    @Override
    public void chegou(EventoChegadaAniversariante evento) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Namorada.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("AVISAR OS CONVIDADOS...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Namorada.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("APAGAR AS LUZES...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Namorada.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("ESPERAR UM POUCO...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Namorada.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("SURPRESA!!!");
    }

}
