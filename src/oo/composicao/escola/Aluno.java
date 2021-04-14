package oo.composicao.escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String NOME;
    /*
    Quando um Array é definido como final significa que seu endereço de memória
    não pode ser alterado. Ou seja, não será possível atribuir um novo objeto do
    tipo ArrayList a variável cursos, pois isso iria alterar seu endereço na memória.
     */
    final List<Curso> CURSOS = new ArrayList<>();

    Aluno(String nome) {
        this.NOME = nome;
    }

    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.CURSOS) {
            if (nome.equalsIgnoreCase(curso.NOME)) {
                return curso;
            }
        }
        return null;
    }

    void adicionarCurso(Curso curso) {
        this.CURSOS.add(curso);
        curso.ALUNOS.add(this);
    }
}
