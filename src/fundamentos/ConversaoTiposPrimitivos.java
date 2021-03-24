package fundamentos;

public class ConversaoTiposPrimitivos {

    public static void conversaoPrimitivos(String[] args) {

        /*Observe o exemplo abaixo
        * float f = 1.0;
        * Visto que o valor 1.0, para o JAVA, é um valor double (implicito),
        * a IDE não aceita esse tipo de atribuição. Existem duas maneiras de
        * realizar a "conversão" do valor para um float.
        * 1ª float f = 1.0F;
        * 2ª float f = (float) 1.0;
        * A 2ª opção é chamada de "casting". Basicamente, você está explicitando
        * a IDE que você quer converter aquele valor considerado como double
        * para um valor float.
         */
        float f = (float) 1.0;
        double d = 12.6352498521465;
        f = (float) 12.6352498521465;

        System.out.println("Valor armazenado em double: " + d
                + "\nValor armazenado em float: " + f);

        int i = 129;
        byte b = (byte) i;

        System.out.println("\nValor armazenado em inteiro: " + i
                + "\nValor armazenado em byte: " + b);

        double db = 1.65254632;
        int it = (int) db;

        System.out.println("\nValor armazenado em double: " + db
                + "\nValor armazenado em inteiro: " + it);
    }

}
