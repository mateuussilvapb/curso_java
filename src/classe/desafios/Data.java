package classe.desafios;

public class Data {

    int dia;
    int mes;
    int ano;

    String dataFormatada() {

        return String.format("%d/%d/%d\n",
                dia, mes, ano);
        
    }

}
