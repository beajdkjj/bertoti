/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */

import java.util.LinkedList;
import java.util.List;

public class Farmacia {
    private List<Medicacao> medicacoes = new LinkedList<Medicacao>();
   
    public void cadastrarMedicacao(Medicacao medicacao){
        medicacao.add(medicacao);
    }
    public List<Medicacao> buscarMedicacaoPorEspecificacao(Especificacao espec){
        List<Medicacao> medEncontrados = new LinkedList<Medicacao>();
        for(Medicacao medicacao: medicacoes){
            if(medicacao.getEspec().comparar(espec)) medEncontrados.add(medicacao);
            
        }
        return medEncontrados; 
    }
    public Medicacao buscarMedicacaoPorEsp(String medicacao){
        for(Medicacao espec:medicacoes){
            if (espec.getMed().equals(medicacao)){
                return espec; 
        }     
    }
        return null;
}
}
