package desafios;

public class DesafioFor {

    public static void desafioFor(String[] args) {
        
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }
        
        //DESAFIO: Não pode usar valor numérico para controlar o laço.
        
        for (String i = "#"; !i.equalsIgnoreCase("######"); i += "#") {
            System.out.println(i);
        }
    }
    
}
