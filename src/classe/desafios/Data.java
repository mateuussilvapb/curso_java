package classe.desafios;

public class Data {

    int dia;
    int mes;
    int ano;

    //Data inicial do unicode
    Data() {
        dia = 01;
        mes = 01;
        ano = 1970;
    }
    
    public Data (int diaInicial, int mesInicial, int anoInicial){
       dia = diaInicial;
       mes = mesInicial;
       ano = anoInicial;
    }

    String dataFormatada() {

        return String.format("%d/%d/%d\n",
                dia, mes, ano);

    }

}
