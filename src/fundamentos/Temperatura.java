package fundamentos;

public class Temperatura {

    public static void converterTemperaturas(String[] args) {
        final int AJUSTE = 32;
        final double MULTIPLICADOR = 5.0 / 9.0;
        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * MULTIPLICADOR;
        System.out.println("O valor em fahrenheit é: " + fahrenheit + "Fº"
                + "\nO resultado em celsius é: " + celsius +"Cº");
    }
}
