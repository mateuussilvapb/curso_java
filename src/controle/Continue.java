package controle;

public class Continue {
    
    public static void continuee(String[] args) {
        
        /*
        'continue' interrompe o laço atual e segue para o próximo.
        No exemplo abaixo, quando o número for ímpar, o valor de 'i'
        não será impresso, porque o laço cai no 'continue'.
        */
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        
    }
    
}
