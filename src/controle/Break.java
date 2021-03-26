package controle;

public class Break {

    public static void breakk(String[] args) {
        
        //'break' interrompe o fluxo normal do funcionamento do laço
        for (int i = 0; i < 10; i++) {
            
            if (i == 5) {
                break;
            }
            
            System.out.println(i);
            
        }
        
        System.out.println("\nFim.");
    }
    
}
