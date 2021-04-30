package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void match(String[] args) {
        Aluno a1 = new Aluno("ANA", 5.1);
        Aluno a2 = new Aluno("LUNA", 8.1);
        Aluno a3 = new Aluno("GUI", 4.1);
        Aluno a4 = new Aluno("GABI", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        
        //todos os resultados compatíveis com o parâmetro
        System.out.println(alunos.stream().allMatch(aprovado));
        //algum resultado compatível com o parâmetro
        System.out.println(alunos.stream().anyMatch(aprovado));
        //nenhum resultado compatível com o parâmetro
        System.out.println(alunos.stream().noneMatch(aprovado));
    }

}
