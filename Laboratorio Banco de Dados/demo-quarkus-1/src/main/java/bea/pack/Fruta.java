package bea.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Fruta {
    public Double valor;


    public String nome;
    public Integer qtd;
    @Id 
    @GeneratedValue
    public Long id;
    
    public Fruta() {
    }

    public Fruta(String nome, int qtd, Double valor) {
        this.nome = nome;
        this.qtd = qtd;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}

