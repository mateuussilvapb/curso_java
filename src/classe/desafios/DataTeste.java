package classe.desafios;

public class DataTeste {

    public static void dataTeste(String[] args) {
        
        Data d1 = new Data();

        Data d2 = new Data(31, 12, 2021);

        System.out.printf(d1.dataFormatada());
        System.out.printf(d2.dataFormatada());

    }

}
