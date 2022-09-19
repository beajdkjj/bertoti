/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Especificacao {
    
    private String marca;
    private String modelo;
    private String composicao;

    //construtor
    public Especificacao(String marca, String modelo, String composicao) {
        this.marca = marca;
        this.modelo = modelo;
        this.composicao = composicao;
    }

    //get and set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public boolean comparar(Especificacao especificacao){
        if(marca.equals(especificacao.marca)&& 
                modelo.equals(especificacao.modelo) && 
                composicao.equals(especificacao.composicao)){
            return true;
        } else{
            return false;   
        }
    }
}
