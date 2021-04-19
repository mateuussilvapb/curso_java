package oo.heranca.desafio;

/*
'implements' diz respeito a interface
 */
public class Ferrari extends Carro implements Esportivo, Luxo {

    boolean ligarTurbo;
    boolean ligarAr;

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
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarAr && !ligarAr) {
            return 25;
        } else {
            return 15;
        }
    }

}
