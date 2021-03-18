package fundamentos;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("What?".charAt(0));
        System.out.println("What?".charAt(1));
        System.out.println("What?".charAt(2));
        System.out.println("What?".charAt(3));
        System.out.println("What?".charAt(4));

        //Não é possível realizar uma alteração em uma variável do tipo String
        String x = "\nOlá!";
        System.out.println(x);
        x = "Olá...";
        System.out.println(x);
        
        //É possível consultar se a string inicia ou não com uma determinada palavra
        System.out.println(x.startsWith("Olá"));
        System.out.println(x.endsWith("..."));
        System.out.println(x.length());
        System.out.println(x.equals("olá..."));
        System.out.println(x.equalsIgnoreCase("olá..."));
        
        String nome = "Mateus";
        String sobrenome = "Dias";
        byte idade = 24;
        float salario = 1100;
        
        /*O "printf" é uma forma mais fácil de formatar a impressão.
        * Utiliza-se "%s" para representar variáveis do tipo String.
        * Utiliza-se "%d" para representar variáveis do tipo inteiro.
        * Utiliza-se "%f" para representar variáveis do tipo float.
        * Utiliza-se "%.2f" para indicar que você quer que imprima 
        * apenas duas casas decimais depois da vírgula.
        */
        System.out.printf("O senhor: %s %s tem %d anos e ganha R$%.2f.\n\n", 
                nome, sobrenome, idade, salario);
        
        //A mesma coisa contece se você colocar tudo em uma variável String.
        String frase = String.format("O senhor: %s %s tem %d anos e ganha R$%.2f.\n\n", 
                nome, sobrenome, idade, salario);
        System.out.println(frase);
        
        System.out.println("Oi, eu sou Mateus ¬¬".codePointAt(2));
    }

}
