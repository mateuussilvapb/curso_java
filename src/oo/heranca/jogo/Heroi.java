package oo.heranca.jogo;

public class Heroi extends Jogador {

    public Heroi(int x, int y) {
        /*
        Utilizando o 'super' no construtor de uma classe herdada, a classe chamará
        o construtor da classe pai. O construtor chamado irá variar de acordo com
        a quantidade de parâmetros informados.
         */
        super(x, y);
    }

    @Override
    public boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }

}
