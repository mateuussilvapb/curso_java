package streams.desafio.filter;

import java.util.Objects;

public class Cliente {

    private String nome;
    private double divida;
    private boolean atrasou;

    public Cliente(String nome, double divida, boolean atrasou) {
        this.nome = nome;
        this.divida = divida;
        this.atrasou = atrasou;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public boolean isAtrasou() {
        return atrasou;
    }

    public void setAtrasou(boolean atrasou) {
        this.atrasou = atrasou;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.divida) ^ (Double.doubleToLongBits(this.divida) >>> 32));
        hash = 19 * hash + (this.atrasou ? 1 : 0);
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
        final Cliente other = (Cliente) obj;
        if (Double.doubleToLongBits(this.divida) != Double.doubleToLongBits(other.divida)) {
            return false;
        }
        if (this.atrasou != other.atrasou) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
}
