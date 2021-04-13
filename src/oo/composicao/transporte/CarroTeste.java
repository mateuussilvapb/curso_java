package oo.composicao.transporte;

public class CarroTeste {

    public static void carroTeste(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());
        if (!c1.estaLigado()) {
            c1.ligar();
        }

        System.out.println(c1.estaLigado());

        /*
        O exemplo a seguir só é possível porque a relação é bidirecional, ou seja,
        um carro possui um motor assim como um motor possui um carro.
         */
        System.out.println(c1.MOTOR.CARRO.MOTOR.CARRO.MOTOR.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.MOTOR.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.MOTOR.giros());

    }

}
