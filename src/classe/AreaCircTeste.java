package classe;

public class AreaCircTeste {

    public static void areaCircTeste(String[] args) {

        /*
        Observe que o resultado desse código será 0 em ambas as saídas. Isso se 
        dá porque a variável 'pi' está associada diretamente a classe. Ou seja, 
        quando o valor de 'pi' é alterado, ele não o é apenas em uma instância,
        mas sim na própria classe.
         */
        AreaCirc a1 = new AreaCirc(5.6);
        //a1.PI = 1000;

        AreaCirc a2 = new AreaCirc(5.6);
        //a2.PI = 0;

        System.out.println(a1.area());
        System.out.println(a2.area());

        /*
        Visto que 'pi' agora é uma variável relacionada diretamente a classe,
        é possível alterá-la sem que seja necessário criar uma instância.
        Observe o exemplo a seguir.
         */
        //AreaCirc.PI = 3.1415;
        System.out.println(a1.area());
        System.out.println(a2.area());

        /*
        Nesse próximo exemplo utilizamos um método estático. Observe que não
        foi preciso criar uma instância da classe, visto que o método é estático.
         */
        System.out.println(AreaCirc.area(100));

    }

}
