package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

    public static void testeV(String[] args) {

        try {
            Aluno aluno = new Aluno("Chaga", -7);
            Validar.aluno(aluno);
        } catch (StringVaziaException | NumeroForaIntervalo e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM.");
    }

}
