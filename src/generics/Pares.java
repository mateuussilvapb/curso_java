package generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> itens = new HashSet<>();

    public void adicionar(C chave, V valor) {
        /*
        A utilização do return em um método void serve para sair do método naquele
        ponto.
         */
        if (chave == null) {
            return;
        }
        Par<C, V> novoPar = new Par(chave, valor);
        if (itens.contains(novoPar)) {
            itens.remove(novoPar);
        }
        if (chave != null) {
            itens.add(new Par(chave, valor));
        }
    }

    public V getValor(C chave) {
        if (chave == null) {
            return null;
        }
        Optional<Par<C, V>> parOpcional = itens.stream()
                .filter(par -> chave.equals(par.getChave()))
                .findFirst();
        return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
    }
}
