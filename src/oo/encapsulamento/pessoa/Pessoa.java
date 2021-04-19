package oo.encapsulamento.pessoa;

public class Pessoa {

    private int idade;
    private String nome;

    Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        //idade = Math.abs(idade);
        if (idade < 0) {
            System.out.println("A IDADE INFORMADA É INVÁLIDA. "
                    + "\nDIGITE UMA IDADE MAIOR QUE 0.");
        } else if (idade > 122) {
            System.out.println("A IDADE INFORMADA É INVÁLIDA. "
                    + "\nDIGITE UMA IDADE MENOR QUE 122.");
        } else {
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Olá. Me chamo " + getNome()
                + ".\nTenho " + getIdade() + " anos de idade.";
    }
}
