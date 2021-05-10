package generics;

/*
Utilizando esse tipo de nomenclatura é possível restringir os tipos que serão
utilizados. No exemplo, quando a classe 'CaixaNumero' for utilizada, só será 
possível relacionar valores numéricos ao objeto criado.
*/
public class CaixaNumero<N extends Number> extends Caixa<N> {

}
