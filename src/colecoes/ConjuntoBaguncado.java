package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void conjuntoBaguncado(String[] args) {

        HashSet conjunto = new HashSet();

        /*
        'set' são conjuntos de dados que armazenam diversos tipos de dados. 
        Eles não são idexáveis. Os dados não podem ser repetidos. Ele é ordenado 
        de forma opcional. Além disso, os 'set's não aceitam tipos primitivos. 
        Porém, ele os converte para 'wrappers'.
         */
        conjunto.add(1.2); //double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1); //int -> Integer1
        conjunto.add('A'); //char -> Charactere

        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        conjunto.add("Teste");
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        conjunto.add("teste");
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        /*
        Ao remover elementos do conjunto, o método retornará 'true' ou 'false',
        idicando se conseguiu ou não realizar a remoção do elemento.
         */
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("teste"));
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        System.out.println(conjunto.contains("Teste"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        /*
        Método para unir dois conjuntos.
         */
        conjunto.addAll(nums);
        System.out.println(conjunto);

        /*
        Método de intersecção (apenas os elementos em comum) entre dois 
        conjuntos.
         */
        nums.remove(2);
        nums.remove(3);
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        
        /*
        Método para eliminar todos os elementos de um conjunto.
        */
        conjunto.clear();
        System.out.println(conjunto);
    }

}
