/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecao;

import java.util.List;

/**
 *
 * @author thiago
 */
public class ColecaoProntuarios {
    private List<Prontuario> prontuarios;
    
    public ColecaoProntuarios(){
        this.prontuarios = new ArrayList<Prontuario>();
    }
    
    public List<Prontuario> getProntuarios() {
        return prontuarios;
    }
        
    public void adicionar(Prontuario prontuario){
        this.prontuarios.add(prontuario);
    }
    
    public void remover(Prontuario prontuario){
        this.prontuarios.remove(prontuario);
    }
    
    public Prontuario buscar(int id){
        for(Prontuario prontuario : prontuarios){
            if(prontuario.getId() == id){
                return prontuario;
            }
        }
        return null;
    }
}
