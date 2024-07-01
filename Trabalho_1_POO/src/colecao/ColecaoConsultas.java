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
public class ColecaoConsultas {
    private List<Consulta> consultas;

    
    public ColecaoConsultas(){
        this.consultas = new ArrayList<Consulta>();
    }
    
    
    public List<Consulta> getConsultas() {
        return consultas;
    }
    
        
    public void adicionar(Consulta consulta){
        this.consultas.add(consulta);
    }
    
    public void remover(Consulta consulta){
        this.consultas.remove(consulta);
    }
    
    public Consulta buscar(int id){
        for(Consulta consulta : consultas){
            if(consulta.getId == id){
                return consulta;
            }
        }
        return null;
    }
}
