package oo.composicao.transporte;

import java.lang.Math;

public class Motor {

    final Carro CARRO;
    double fatorInjecao = 1;
    boolean ligado = false;

    Motor (Carro carro) {
        this.CARRO = carro;
    }
    /*
    'Math.round' arredonda o valor para o inteiro mais próximo
     */
    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 1000);
        }
    }

}
