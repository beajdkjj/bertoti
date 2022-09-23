/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Medicacao {

    static Object getMed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String nome;
    private Especificacao espec;

    //construtor
    public Medicacao(String nome, Especificacao espec) {
        this.nome = nome;
        this.espec = espec;
    }
    
    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especificacao getEspec() {
        return espec;
    }

    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }

    void add(Medicacao medicacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
