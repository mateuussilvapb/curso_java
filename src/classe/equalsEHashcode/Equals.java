package classe.equalsEHashcode;

public class Equals {

    public static void Equals(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Mateus";
        u1.email = "mateuussilvapb@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Mateus";
        u2.email = "mateuussilvapb@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }

}
