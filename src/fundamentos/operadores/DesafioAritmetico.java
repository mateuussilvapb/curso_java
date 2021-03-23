package fundamentos.operadores;

import java.lang.Math;

public class DesafioAritmetico {

    public static void desafioAritmetico(String[] args) {
        double v1 = 6 * (3 + 2);
        double v2 = Math.pow(v1, 2);
        double v3 = 3 * 2;
        double v123 = v2 / v3;

        double v4 = ((1 - 5) * (2 - 7)) / 2;
        double v5 = Math.pow(v4, 2);

        double v1234 = v123 - v5;
        double vf = Math.pow(v1234, 3);

        double denominador = Math.pow(10, 3);

        int divisao = (int) vf / (int) denominador;

        System.out.println(divisao);

//        double v1 = Math.pow(((3 + 2) * 6), 2);
//        double v2 = Math.pow((((1-5)*(2-7))/2), 2);
//        v1 = v1/(3*2);
//        double v3 = Math.pow((v1-v2), 3);
//        double v4 = Math.pow(10, 3);
//        double fim = v3/v4;
//        System.out.println(fim);
    }

}
