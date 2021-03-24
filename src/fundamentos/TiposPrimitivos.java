package fundamentos;

public class TiposPrimitivos {

    public static void tiposPrimitivos(String[] args) {
        //Dados do funcionário

        //Tipos numéricos inteiros em ordem crescente
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulado = 3_134_845_223L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false;

        //Tipo caractere
        char status = 'A'; //Representando que o funcionário está ativo, por exemplo

        //Dias de empresa do funcionário
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens
        System.out.println(numeroDeVoos / 2);

        //Quantidade de pontos por real ganhos
        System.out.println(pontosAcumulado / vendasAcumuladas);

        System.out.println("O ID: " + id + " ganha: " + salario);

        System.out.println("Férias? " + estaDeFerias);

        System.out.println("Status: " + status);
    }
}
