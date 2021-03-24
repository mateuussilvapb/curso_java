package fundamentos;

public class NotacaoPonto {

    public static void notacaoPonto(String[] args) {

        String s = "Bom dia X";

        s.toUpperCase();
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        s.replace("X", "Senhora");
        System.out.println(s);

        s = s.replace("X", "Senhora");
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        s = s.concat("!!!");
        System.out.println(s);

        /*Isso acontece por que o java atribui o tipo ao valor literal da variável.
        * Ou seja, o java já entende que "Leo" é uma string.
        * Isso ocorre também para todos os valores primitivos e por isso é necessário
        * usar a letra L, por exemplo,no fianl dos números do tipo longo, visto que o java
        * os entende como do tipo inteiro.
         */
        System.out.println("Leo".toUpperCase());

        //O código abaixo tanto pode ficar apenas em uma linha como também em várias.
        String x = "Bom dia X"
                .replace("X", "NoobMaster")
                .toUpperCase()
                .concat(" !!!");

        System.out.println(x);

        //Tipos primitivos não tem o operador "." (ponto)
    }
}
