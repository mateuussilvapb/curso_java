package colecoes.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void Fila(String[] args) {

        /*
        'LinkedList' representa filas em Java
         */
        Queue<String> fila = new LinkedList<>();

        /*
        'offer' e 'add' adicionam elementos na fila. A diferença é o
        comportamento quando a fila está cheia.
        No 'add', ele jogará uma exceção.
        No 'offer', ele retornará 'false'.
         */
        fila.add("Mateus");
        fila.offer("Maria");
        fila.add("Zeneuda");
        fila.offer("Marcos");
        fila.add("Cleonides");
        fila.offer("Renê");

        /*
        Ambos os métodos imprimem o próximo item da fila (sem remover). 
        A diferença será quando a fila estiver vazia. Nesse caso, 'peek' 
        retornará nulo e 'element' jogará uma exceção na tela.
         */
        System.out.println(fila.peek());
        System.out.println(fila.element());

        /*
        Alguns outros métodos são:
        'fila.size();' retorna a quantidade de elementos;
        'fila.clear();' limpa a fila (remove todos os elementos);
        'fila.isEmpty();' retorna 'true' se a fila estiver vazia ou 'false',
            caso contrário;
        'fila.contains(...)' verifica se a fila possui determinado elemento;
         */
 /*
        Retorna o próximo elemento da fila e o remove. Caso a fila esteja vazia
        o método retornará 'null'.
         */
        System.out.println(fila.poll());

        /*
        Remove o próximo elemento da fila. Caso a fila esteja vazia o método 
        jogará uma exceção na tela.
         */
        System.out.println(fila.remove());

    }

}
