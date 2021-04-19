package oo.heranca.jogo;

public class Monstro extends Jogador {

    public Monstro() {
        this(0, 0);
        this.setVida(200);
    }

    public Monstro(int x, int y) {
        super(x, y);
        this.setVida(200);
    }
}
