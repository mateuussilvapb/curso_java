package colecoes.lista;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        /*
        Obs.: ArrayList não utiliza o HashCode
        */
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Mateus");
        lista.add(u1);

        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("Zeneuda"));
        lista.add(new Usuario("Marcos"));
        lista.add(new Usuario("Cleonides"));
        lista.add(new Usuario("Renê"));

        System.out.println(lista.get(0).toString());

        lista.remove(1); //Remove através do índice.
        lista.remove(new Usuario("Renê")); //Remove realizando uma busca.
        
        
        for (Usuario u : lista) {
            System.out.println(u.toString()); //Ou apenas 'u' pois implicitamente ele chama o 'toString'
        }
    }

}
