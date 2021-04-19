package oo.heranca.desafio;

/*
'implements' diz respeito a interface
 */
public class Ferrari extends Carro implements Esportivo {

    public Ferrari() {
        this(372, 15);
    }

    public Ferrari(int velocidadeMaxima, int delta) {
        super(velocidadeMaxima, delta);

    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

    @Override
    public void ligarTurbo() {
        super.delta = 35;
    }

    @Override
    public void desligarTurbo() {
        super.delta = 15;
    }

}
