package generics;

//Semelhante as collections
public class Caixa<T> {

    private T coisa;

    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return this.coisa;
    }

}
