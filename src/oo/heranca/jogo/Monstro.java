package oo.heranca.jogo;

public class Monstro extends Jogador {

    Monstro() {
        this(0, 0);
        this.vida = 200;
    }

    Monstro(int x, int y) {
        super(x, y);
        this.vida = 200;
    }
}
