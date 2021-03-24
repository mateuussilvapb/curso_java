package fundamentos.operadores;

public class Unarios {

    public static void unarios(String[] args) {
        int a = 1;
        int b = 2;

        a++; //a = a + 1;
        a--; //a = a - 1;

        ++b; //b = b + 1;
        --b; //b = b - 1;

        System.out.printf("A = %d\n"
                + "B = %d\n", a, b);

        /* Como os operadores estão pós fixados em 'b', a ordem de execução não
        * dá prioridade ao decremento. Ou seja, essa comparação está fazendo o 
        * seguinte: a + 1 == b?. Por isso, o resultado é 'true'.
        * Já no caso do 'a', como os operadores estão pré fixados, o código
        * dá prioridade a realizar o incremento primeiro e depois realiza a
        * comparação.
         */
        System.out.println(++a == b--);

        System.out.println(a == b);

        System.out.println(a);
        System.out.println(b);

    }

}
