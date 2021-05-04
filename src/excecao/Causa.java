package excecao;

public class Causa {

    public static void causa(String[] args) {
        try {
            metodoA(null);
        } catch (Exception e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
        metodoA(null);
    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno está NULO");
        }
        System.out.println(aluno.getNome());
    }

}
