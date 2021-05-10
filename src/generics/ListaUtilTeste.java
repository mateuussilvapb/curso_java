package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void listUtTeste(String[] args) {

        List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);
        
        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);
        
        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem);
        
        /*
        A notação 'Integer' antes da invocação do método é opcional. Porém, ao
        utilizar isso, não será possível passar outro tipo que não seja Integer
        */
        Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNumero);
        
        
    }

}
