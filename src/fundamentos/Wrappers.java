package fundamentos;

public class Wrappers {

    public static void wrappers(String[] args) {
        /*Os tipos primitivos não possuem as funcionalidades que os objetos
        * possuem. Com isso, Wrappers traz a possibilidade de realizar alterações
        * com os tipos primitivos
         */

        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("10000");
        Long l = 100000L;
        Float f = 123.00F;
        Double d = 1234.5678;
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toUpperCase());
        Character c = '%';
        System.out.println(c.toString());
    }

}
