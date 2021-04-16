package oo.heranca.desafio;

public class Teste {

    public static void teste(String[] args) {
     
        Carro corolla = new Corolla();
        Carro ferrari = new Ferrari();
        
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        corolla.frear();
        
        System.out.println(corolla);
        System.out.println(ferrari);
    }

}
