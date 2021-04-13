package colecoes.mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void mapa(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        
        /*
        Semelhante ao método 'add', 'put' também adiciona informações a estrutura.
        A diferença entre os dois é que, caso outro 'put' seja chamado com o mesmo
        identificador (para o exemplo que se segue: 1), ao invés de adicionar um
        novo valor a estrutura, ele irá substituir a informação que possua o mesmo
        identificador. Ou seja, 'put' serve tanto para incluir quanto para substituir.
        As chaves em um Map não podem ser duplicadas.
        */
        usuarios.put(1, "Mateus");
        System.out.println(usuarios.toString());
        usuarios.put(1, "Maria");
        System.out.println(usuarios.toString());
        usuarios.put(2, "Mateus");
        System.out.println(usuarios.toString());
        usuarios.put(3, "Zeneuda");
        usuarios.put(4, "Marcos");
        usuarios.put(5, "Marcos");
        usuarios.put(6, "Marcos");
        
        /*
        Alguns outros métodos.
        */
        System.out.println(usuarios.size()); //Tamanho da estrutura
        System.out.println(usuarios.isEmpty()); //Estrutura está vazia?
        System.out.println(usuarios.keySet()); //Chaves da estrutura
        System.out.println(usuarios.values()); //Valores da estrutura
        System.out.println(usuarios.entrySet()); //Chaves com respectivos valores
        System.out.println(usuarios.containsKey(4)); //Verifica se determinada chave está presente na estrutura
        System.out.println(usuarios.containsValue("Mateus")); //Verifica se determinado valor está presente na estrutura
        System.out.println(usuarios.get(1)); //Retorna o valor da chave 1 (caso ele exista)
        System.out.println(usuarios.remove(5)); //Remove um valor a partir de uma chave
        System.out.println(usuarios.remove(6, "Renê")); //Remove uma linha inteira caso a chave e o valor sejam compatíveis com os que foram informados.
        
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
            System.out.println(usuarios.get(chave));
        }
        
        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }
        
        for (Entry<Integer, String> usuario: usuarios.entrySet()) {
            System.out.println("[ " + usuario.getKey() + " --> " + usuario.getValue() + " ]");
        }
        
    }
}
