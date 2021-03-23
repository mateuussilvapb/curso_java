package fundamentos.operadores;

public class Relacionais {

    public static void main(String[] args) {
        int a = 97;
        int b = 97;

        //Igual
        System.out.println(a == b);
        //Diferente
        System.out.println(a != b);
        //Maior
        System.out.println(a > b);
        //Maior ou igual
        System.out.println(a >= b);
        //Menor
        System.out.println(a < b);
        //Menor ou igual
        System.out.println(a <= b);

        double nota = 7.1;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = passouPorMedia && bomComportamento;
        
        System.out.println("\nTem desconto? " + temDesconto);
    }
}
