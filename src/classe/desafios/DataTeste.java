package classe.desafios;

public class DataTeste {

    public static void dataTeste(String[] args) {
        
        Data d1 = new Data();
        d1.dia = 05;
        d1.mes = 03;
        d1.ano = 1997;

        Data d2 = new Data();
        d2.dia = 17;
        d2.mes = 12;
        d2.ano = 1995;

        System.out.printf(d1.dataFormatada());
        System.out.printf(d2.dataFormatada());

    }

}
