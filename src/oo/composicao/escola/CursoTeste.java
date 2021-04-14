package oo.composicao.escola;

public class CursoTeste {

    public static void cursoTeste(String[] args) {

        Aluno aluno1 = new Aluno("Mateus");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Zeneuda");

        Curso curso1 = new Curso("JAVA OO");
        Curso curso2 = new Curso("WEB COMPLETO");
        Curso curso3 = new Curso("REAC NATIVE");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso3.ALUNOS) {
            System.out.println("Estou matriculado no curso de "
                    + curso3.NOME + "...");
            System.out.println("...e o meu nome é " + aluno.NOME);
            System.out.println();
        }

        for (Curso curso : aluno1.CURSOS) {
            System.out.println(curso.NOME);
        }

    }

}
