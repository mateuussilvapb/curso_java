package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("MATEUS", 7.1);
        Aluno a2 = new Aluno("MATEUS", 7.1);
        Aluno a3 = new Aluno("SILVA", 8.1);
        Aluno a4 = new Aluno("SOUSA", 10);
        Aluno a5 = new Aluno("DIAS", 6.4);
        Aluno a6 = new Aluno("GARCIA", 7.8);
        Aluno a7 = new Aluno("D'ÁVILA", 5.1);
        Aluno a8 = new Aluno("GUSMÃO", 6.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
        
        System.out.println("--- DISTINCT ---");
        //Pega todos os valores que são únicos no conjunto
        alunos.stream().distinct().forEach(System.out::println);
        
        System.out.println("\n--- SKIP/LIMIT ---");
        //skip pula uma quatidade de elementos pre definida
        alunos.stream().distinct().skip(2).forEach(System.out::println);
        //limit limita a quantidade de lementos a serem usados
        alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
        
    }

}
