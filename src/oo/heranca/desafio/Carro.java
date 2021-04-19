package oo.heranca.desafio;

public class Carro {

    /*
    Variáveis constantes em classes precisam ser inicializadas na declaração em si
    ou pelo menos no construtor.
     */
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 0;
    int delta;

    protected Carro(int velocidadeMaxima, int delta) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "Velocidade atual -> " + this.velocidadeAtual + "km/h.\n";
    }

    public void acelerar() {
        if (velocidadeAtual + delta > this.VELOCIDADE_MAXIMA) {
            this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
            System.out.println("O CARRO ALCANÇOU A VELOCIDADE MÁXIMA PERMITIDA.");
        } else {
            velocidadeAtual += delta;
        }
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            this.velocidadeAtual -= 5;
        } else if (velocidadeAtual == 0) {
            System.out.println("O CARRO ESTÁ PARADO.");
        } else {
            velocidadeAtual = 0;
        }
    }
}
