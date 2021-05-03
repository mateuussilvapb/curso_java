package excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirNomeAluno(a1);
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getLocalizedMessage());
        }
        try {
            System.out.println(7 / 0);
        } catch (Exception e) {
            /*
            Imprime o ponto no qual a exceção foi lançada. O método não é síncrono,
            O que significa que ele não será executado de forma estruturada.
            */
            e.printStackTrace();
            
            /*
            Captura a mensagem de erro de forma síncrona. É capturado apenas a 
            mensagem que explica o erro.
            */
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        //System.out.println("FIM...");
    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }

}
