package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void minMax(String[] args) {

        Aluno a1 = new Aluno("ANA", 7.1);
        Aluno a2 = new Aluno("LUNA", 6.1);
        Aluno a3 = new Aluno("GUI", 8.1);
        Aluno a4 = new Aluno("GABI", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (al1, al2) -> {
            if (al1.getNota() > al2.getNota()) {
                return 1;
            } else if (al2.getNota() > al1.getNota()) {
                return -1;
            } else {
                return 0;
            }
        };
        
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
        
        
    }

}
