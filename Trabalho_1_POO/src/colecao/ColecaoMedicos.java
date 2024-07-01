/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecao;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author thiago
 */
public class ColecaoMedicos {
    private List<Medico> medicos;

    
    public ColecaoMedicos(){
        this.medicos = new ArrayList<Medico>();
    }
        
    
    //Retorna todos os medicos cadastrados
    public List<Medico> getMedicos(){
        return medicos;
    }
    
    
    //Adiciona um medico na coleção
    public void adicionar(Medico medico){
        this.medicos.add(medico);
    }
    
    //Remove um medico da coleção
    public void remover(Medico medico){
        this.medicos.remove(medico);
    }
    
    //Busca um medico pelo crm
    public Medico buscar(int crm){
        for(Medico medico : medicos){
            if(medico.getCrm() == crm){
                return medico;
            }
        }
        return null; //se o medico não for encontrado
    }
}
