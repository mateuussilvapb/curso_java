package streams;

import excecao.Aluno;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void red2(String[] args) {

        Aluno a1 = new Aluno("ANA", 7.1);
        Aluno a2 = new Aluno("LUNA", 6.1);
        Aluno a3 = new Aluno("GUI", 8.1);
        Aluno a4 = new Aluno("GABI", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Function<Aluno, Double> nota = a -> a.getNota();
        BinaryOperator<Double> somatoria = (a, b) -> a + b;

        alunos.stream()
                .filter(aprovado)
                .map(nota)
                .reduce(somatoria)
                .ifPresent(System.out::println);

    }

}
