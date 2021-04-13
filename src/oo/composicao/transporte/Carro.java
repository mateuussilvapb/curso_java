package oo.composicao.transporte;

public class Carro {

    final Motor MOTOR;
    
    Carro () {
        this.MOTOR = new Motor(this);
    }

    void acelerar() {
        if (MOTOR.fatorInjecao <= 2.6) {
            MOTOR.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (MOTOR.fatorInjecao >= 0.5) {
            MOTOR.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        MOTOR.ligado = true;
    }

    void desligar() {
        MOTOR.ligado = false;
    }

    boolean estaLigado() {
        return MOTOR.ligado;
    }
}
