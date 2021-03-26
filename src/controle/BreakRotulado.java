package controle;

public class BreakRotulado {

    public static void breakRotulado(String[] args) {

        /*
        O 'break' rotulado indica qual das repetições devem ser interrompidas.
        No exemplo em questão, o 'break' está interrompendo o laço mais externo.
        Isso porque ambos os laços foram 'rotulados' (por assim dizer) e logo
        após o 'break' foi indicado qual laço deveria ser interrompido.
        
        ATENÇÃO: NÃO É RECOMENDADO UTILIZAR TANTO O BREAK E CONTINUE, VISTO QUE 
        ISSO DIFICULTA O ENTENDIMENTO DO CÓDIGO. EM ALGUNS POUCOS CASOS SÃO NECESSÁRIOS,
        PORÉM DEVEM SER EVITADOS.
        */
        externo: for (int i = 0; i < 3; i++) {

            interno: for (int j = 0; j < 3; j++) {

                if (i == 1) {
                    break externo;
                }

                System.out.printf("[%d %d] ", i, j);

            }

            System.out.println();

        }
        
        System.out.println("Fim!");

    }

}
