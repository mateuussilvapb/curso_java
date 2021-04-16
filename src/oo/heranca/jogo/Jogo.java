package oo.heranca.jogo;

public class Jogo {

    public static void jogo(String[] args) {

        Jogador monstro = new Monstro();

        Jogador heroi = new Heroi(10, 11);

        System.out.println("Monstro tem -> " + monstro.vida);
        System.out.println("Herói tem -> " + heroi.vida);
        System.out.println();

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem -> " + monstro.vida);
        System.out.println("Herói tem -> " + heroi.vida);
    }

}
