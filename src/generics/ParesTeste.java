package generics;

public class ParesTeste {

    public static void paresTeste(String[] args) {
        
        Pares<Integer, String> resultadoConcurso = new Pares<>();
        
        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Mateus");
        resultadoConcurso.adicionar(3, "Guilherme");
        resultadoConcurso.adicionar(4, "Ana");
        resultadoConcurso.adicionar(2, "Recebeca");
        
        System.out.println(resultadoConcurso.getValor(2));
        
    }

}
