package colecoes.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void pilha(String[] args) {

        /*
        'Deque' defina uma pilha em Java.
         */
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno príncipe.");//Retorna um valor booleano
        livros.push("Harry Potter.");//Não retorna nada
        livros.push("O Hobbit.");//Não retorna nada

        for (String livro : livros) {
            System.out.println(livro);
        }

        System.out.println(livros.peek());//Retorna o último elemento adicionado.
        System.out.println(livros.element());//Retorna o último elemento adicionado.

        System.out.println(livros.poll());//Retorna e remove o último elemento adicionado na pilha e retorna null se a pilha estiver vazia
        System.out.println(livros.pop());//Retorna e remove o último elemento adicionado na pilha e joga uma exceção se a pilha estiver vazia
        System.out.println(livros.remove());//Retonra e remove o último elemento adicionado na pilha e joga uma exceção se a pilha estiver vazia

        /*
        Alguns outros métodos são:
        'fila.size();' retorna a quantidade de elementos;
        'fila.clear();' limpa a fila (remove todos os elementos);
        'fila.isEmpty();' retorna 'true' se a fila estiver vazia ou 'false',
            caso contrário;
        'fila.contains(...)' verifica se a fila possui determinado elemento;
         */
    }

}
