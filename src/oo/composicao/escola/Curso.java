package oo.composicao.escola;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String NOME;
    final List<Aluno> ALUNOS = new ArrayList<>();

    Curso(String nome) {
        this.NOME = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.ALUNOS.add(aluno);
        aluno.CURSOS.add(this);
    }

}
