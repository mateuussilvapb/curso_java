package fundamentos.operadores;

public class Ternarios {

    public static void ternarios(String[] args) {
        double media = 4.9;
        /*
        No código abaixo a atribuição dependerá de um resultado.
        Caso a variável 'media' seja maior ou igual a 7, 'resultado' receberá
        a sting "Aprovado". Caso contrário, receberá "Reprovado".
        O símbolo '?' separa a condição dos prováveis valores a serem atribuídos.
        O primeiro valor descrito é o caso 'true'. O segundo, 'false'.
         */
        String resultado = media >= 7 ? 
                "aprovado." : media >= 5 ? 
                "em recuperação." : "reprovado.";
        System.out.printf("O aluno está %s\n", resultado);
    }

}
