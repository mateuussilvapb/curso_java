package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcessos() {
        //segredo 
        //facoDentroDeCasa
        //formaDeFalar 
        //todosSabem

        //System.out.println(esposa.segredo);
        //System.out.println(mae.facoDentroDeCasa);
        /*
        Quando se herda algo de outro pacote que é protected, não é necesário
        acessar a informação criando um objeto do tipo da classe pai, visto que
        a informação foi herdada.
         */
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }

}
