package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("ANA", 7.1);
        Aluno a2 = new Aluno("LUNA", 6.1);
        Aluno a3 = new Aluno("GUI", 8.1);
        Aluno a4 = new Aluno("GABI", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Function<Aluno, Double> apenasNota = a -> a.getNota();
        BiFunction<Media, Double, Media> calcularMedia
                = (media, nota) -> media.adicionar(nota);
        
        alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .;

    }

}
