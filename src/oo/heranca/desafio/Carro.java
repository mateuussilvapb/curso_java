package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual = 0;

    @Override
    public String toString() {
        return "Velocidade atual -> " + this.velocidadeAtual + "km/h.\n";
    }

    void acelerar() {
        if (velocidadeAtual <= 245) {
            this.velocidadeAtual += 5;
        } else if (velocidadeAtual == 250) {
            System.out.println("O CARRO ALCANÇOU A VELOCIDADE MÁXIMA PERMITIDA.");
        } else {
            velocidadeAtual = 250;
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
