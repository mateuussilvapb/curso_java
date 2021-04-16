package oo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari() {
        this(372);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }

}
