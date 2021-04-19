package oo.heranca.teste;

import oo.heranca.jogo.Heroi;
import oo.heranca.jogo.Jogador;
import oo.heranca.jogo.Monstro;

public class Jogo {

    public static void jogo(String[] args) {

        Jogador monstro = new Monstro();

        Jogador heroi = new Heroi(10, 11);

        System.out.println("Monstro tem -> " + monstro.getVida());
        System.out.println("Herói tem -> " + heroi.getVida());
        System.out.println();

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem -> " + monstro.getVida());
        System.out.println("Herói tem -> " + heroi.getVida());
    }

}
