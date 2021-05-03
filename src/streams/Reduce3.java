package streams;

import excecao.Aluno;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void red3(String[] args) {

        Aluno a1 = new Aluno("ANA", 7.1);
        Aluno a2 = new Aluno("LUNA", 6.1);
        Aluno a3 = new Aluno("GUI", 8.1);
        Aluno a4 = new Aluno("GABI", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Function<Aluno, Double> apenasNota = a -> a.getNota();
        BiFunction<Media, Double, Media> calcularMedia
                = (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia
                = (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A média da turma é: " + media.getValor());
    }

}
