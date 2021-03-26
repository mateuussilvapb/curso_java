
package exercicios;

import java.util.Calendar;

public class AnoBissexto {
    
    public static void anoBissexto(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("O ano corrente (%d) é bissexto.", year);
        } else {
            System.out.printf("O ano corrente (%d) não é bissexto.", year);
        }
    }
    
}
