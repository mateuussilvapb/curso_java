package colecoes.hash;

import java.util.HashSet;

public class Hash {

    public static void hash(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Mateus"));
        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("Zeneuda"));
        usuarios.add(new Usuario("Marcos"));

        boolean resultado = usuarios.contains(new Usuario("Marcos"));
        System.out.println(resultado);
    }

}
