package classe.desafios;

public class Data {

    int dia;
    int mes;
    int ano;

    /*
    Data inicial do unicode. nesse caso, 'this()' foi utilizado commo método. 
    Isso possibilita que um construtor seja invocado dentro de outro construtor.
    O que diferenciará as chamadas de construtores dentro de outros utilizando
    'this()', será a quantidade de parâmetros.
    Só é possível utilizar 'this()' como método dentro de um construtor.
     */
    public Data() {
        this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    /*
    'this' refere-se a instância. Por exemplo, caso um método estático fosse
    criado, não seria possível utilizar 'this' nele, visto que tudo que é estático
    pertence a classe e não a instância. 
     */
    public String dataFormatada() {
        final String formato = "%d/%d/%d\n";
        return String.format(formato,
                this.dia, this.mes, this.ano);
    }

    /*
    Nesse caso, 'this' está sendo usado como objeto, se referindo a um método 
    da classe.
     */
    public void imprimirDataFormatada() {
        System.out.println(this.dataFormatada());
    }

}
