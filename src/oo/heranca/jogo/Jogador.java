package oo.heranca.jogo;

public class Jogador {

    private int vida = 100;
    private int x;
    private int y;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    protected Jogador() {
        /*
        Ao utilizar o 'this' no construtor padrão e passar os parâmetros necessários,
        o construtor padrão chamará outro construtor de acordo com os parâmetros
        informados. 
         */
        this(0, 0);
    }

    protected Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente) {
        /*
        Math.abs retorna apenas valores positivos. Idêntico a módulo.
         */
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

    public boolean andar(Direcao direcao) {

        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }

}
