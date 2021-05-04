package excecao;

public class ChecadaVsNaoChecada {

    public static void checkVsNCheck(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        /*
        Visto que essa exceção é checada, é necessário que ela seja tratada ou
        dentro do próprio método, ou quando ele é invocado.
         */
        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM.");
    }

    //Exceção não checada ou não verificada
    static void geraErro1() {
        //Para lançar o erro é necessário utilizar a palavra reservada throw
        throw new RuntimeException("OCORREU UM ERRO #01");
    }

    //Exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("OCORREU UM ERRO #02");
    }

}
