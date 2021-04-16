package oo.heranca.jogo;

public class Jogo {

    public static void jogo(String[] args) {

        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Jogador heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

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
