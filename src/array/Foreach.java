package array;

public class Foreach {

    public static void forEach(String[] args) {

        double[] notas = {9.9, 8.7, 7.2, 9.4};

        /*
        No exemplo abaixo utilizou-se o foreach. Isso quer dizer que para cada
        elemento em 'notas[]', a variável 'nota' (que tem que ser do mesmo tipo
        de 'notas[]') receberá o valor que está no primeiro índice do array até
        o último.
         */
        for (double nota : notas) {
            System.out.println(nota);
        }
    }

}
