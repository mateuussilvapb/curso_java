package streams.desafio.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class VendaPrazo {

    public static void venaPrazo(String[] args) {

        Cliente c1 = new Cliente("MARINEZ DE BABADO", 10, true);
        Cliente c2 = new Cliente("MATEUS DIAS", 100, false);
        Cliente c3 = new Cliente("PAIZINHA", 50, true);
        Cliente c4 = new Cliente("ZENEUDA", 100, false);
        Cliente c5 = new Cliente("JOSIMAR DOS CONJUNTOS", 20, true);

        Predicate<Cliente> acimaDeDez = c -> c.getDivida() > 10;
        Predicate<Cliente> atrasaOuNao = c -> c.isAtrasou();
        Function<Cliente, String> veaco 
                = c -> "O(A) cliente " + c.getNome() + " está tentando\n"
                        + "realizar uma compra de mais de 10 e \n"
                        + "geralmente atrasa os pagamentos!\n";
        
        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5);
        
        clientes.stream()
                .filter(acimaDeDez)
                .filter(atrasaOuNao)
                .map(veaco)
                .forEach(System.out::println);
        

    }

}
