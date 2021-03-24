package fundamentos;

public class ConversaoNumeroString {

    public static void conversaoNS(String[] args) {
        Integer i = 1000;
        String n = i.toString();

        //Algumas funções só estão presentes em Strings. Ex.: ".length()"
        System.out.println(i.toString().length());

        //É possível utilizar as funções do Integer em primitivos.
        int i2 = 10000;
        System.out.println(Integer.toString(i2));

        //É possível "forçar" uma conversão, mas não é a maneira correta
        System.out.println(("" + i2).length());
        System.out.println(("" + i).length());
    }

}
