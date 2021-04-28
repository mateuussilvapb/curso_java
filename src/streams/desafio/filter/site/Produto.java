package streams.desafio.filter.site;

import java.util.Objects;

public class Produto {

    final private String nome;
    private double desconto;
    private boolean freteGratis;

    public Produto(String nome, double desconto, boolean freteGratis) {
        this.nome = nome;
        if (desconto < 1.0 && desconto > 0.0) {
            this.desconto = desconto;
        } else if (desconto > 0.0 && desconto < 100) {
            this.desconto = desconto / 100;
        } else {
            System.out.println("ERRO! O DESCONTO INFORMADO É INVÁLIDO!");
        }
        this.freteGratis = freteGratis;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.desconto) ^ (Double.doubleToLongBits(this.desconto) >>> 32));
        hash = 79 * hash + (this.freteGratis ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (Double.doubleToLongBits(this.desconto) != Double.doubleToLongBits(other.desconto)) {
            return false;
        }
        if (this.freteGratis != other.freteGratis) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto < 1.0 && desconto > 0.0) {
            this.desconto = desconto;
        } else if (desconto > 0.0 && desconto < 100) {
            this.desconto = desconto / 100;
        } else {
            System.out.println("ERRO! O DESCONTO INFORMADO É INVÁLIDO!");
        }
    }

    public boolean isFreteGratis() {
        return freteGratis;
    }

    public void setFreteGratis(boolean freteGratis) {
        this.freteGratis = freteGratis;
    }

    public String getNome() {
        return nome;
    }

}
