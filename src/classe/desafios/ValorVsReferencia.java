package classe.desafios;

public class ValorVsReferencia {

    public static void valorVsReferencia(String[] args) {

        //Atribuição por valor. Nesse caso, 'b' está recebendo o valor 2.
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " / " + b + "\n");

        /*
        Atribuição por referência. Nesse caso, ambas as variáveis estão apontando
        para um mesmo endereço. O que é armazenado na variável é a referência
        (no caso, 'd1' e 'd2') e o endereço dos dados. Se o valor de 'd1' for
        alterado, 'd2' também será, pois estão apontando para o mesmo endereço.
         */
        Data d1 = new Data(05, 04, 2021);
        Data d2 = d1;

        d1.dia = 31;
        d2.mes = 03;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    //Um método estático só pode acessar outro método estático
    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;
    }

}
