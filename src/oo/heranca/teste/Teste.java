package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Corolla;
import oo.heranca.desafio.Ferrari;

public class Teste {

    public static void main(String[] args) {

        Carro corolla = new Corolla();
        Ferrari ferrari = new Ferrari();

//        ferrari.ligarTurbo();
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();

        System.out.println(ferrari);
    }

}
