package padroes.observer;

import java.awt.event.MouseEvent;
import java.util.Date;

public class EventoChegadaAniversariante {

    private final Date MOMENTO;
    
    public EventoChegadaAniversariante(Date momento){
        this.MOMENTO = momento;
    }

    public Date getMOMENTO() {
        return MOMENTO;
    }

}
