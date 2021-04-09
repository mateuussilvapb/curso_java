package classe.equalsEHashcode;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        /*
        'instanceof' verifica se o objeto passado é de um tipo especificado.
        Nesse caso, do tipo 'Usuario'.
         */
        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }
    

}
