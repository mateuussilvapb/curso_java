package fundamentos;

public class AreaCircunferencia {

    public static void calcArea(String[] args) {

        double raio = 3.4;
        // O termo "final" dignifica que essa variável não poderá ser alterada posteriormente, o que a torna uma constante
        final double PI = 3.14159;

        double area = PI * raio * raio;

        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;

        System.out.println(area);
    }

}
