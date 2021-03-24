package fundamentos.operadores;

public class Atribuicao {

    public static void atribuicao(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; //c = c + b;
        c -= a; //c = c - a;
        c *= b; //c = c * b;
        c /= a; //c = c / a;
        c %= b; //c = c % b;

        c %= 2; //c = c % 2; Caso o resultado seja 0, o valor é par.

        System.out.printf("A = %d\n"
                + "B = %d\n"
                + "C = %d\n", a, b, c);
    }
}
