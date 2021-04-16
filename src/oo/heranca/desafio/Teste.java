package oo.heranca.desafio;

public class Teste {

    public static void main(String[] args) {
     
        Carro corolla = new Corolla();
        Carro ferrari = new Ferrari();
        
        ferrari.acelerar();
        corolla.acelerar();
        ferrari.frear();
        corolla.frear();
        
        System.out.println(corolla);
        System.out.println(ferrari);
    }

}
