package oo.heranca.desafio;

public class Carro {

    /*
    Variáveis constantes em classes precisam ser inicializadas na declaração em si
    ou pelo menos no construtor.
     */
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 0;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Velocidade atual -> " + this.velocidadeAtual + "km/h.\n";
    }

    void acelerar() {
        if (velocidadeAtual + 5 > this.VELOCIDADE_MAXIMA) {
            this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
            System.out.println("O CARRO ALCANÇOU A VELOCIDADE MÁXIMA PERMITIDA.");
        } else {
            velocidadeAtual += 5;
        }
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            this.velocidadeAtual -= 5;
        } else if (velocidadeAtual == 0) {
            System.out.println("O CARRO ESTÁ PARADO.");
        } else {
            velocidadeAtual = 0;
        }
    }
}
