package fundamentos.operadores;

public class Logico {

    public static void operadoresLogicos(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);
        
        System.out.println("\nTabela verdade 'and'");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        System.out.println("\nTabela verdade 'or'");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        System.out.println("\nTabela verdade 'xor'");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        
        System.out.println("\nTabela verdade 'not'");
        System.out.println(!true);
        System.out.println(!false);
    }
}
