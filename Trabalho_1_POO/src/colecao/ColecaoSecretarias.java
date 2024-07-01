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
public class ColecaoSecretarias {
    private List<Secretaria> secretarias;

    public ColecaoSecretarias(){
        this.secretarias = new ArrayList<Secretaria>();
    }
    
    public List<Secretaria> getSecretarias() {
        return secretarias;
    }
    
        
    public void adicionar(Secretaria secretaria){
        this.secretarias.add(secretaria);
    }
    
    public void remover(Secretaria secretaria){
        this.secretarias.remove(secretaria);
    }
    
    public Secretaria buscar(int  id){
        for(Secretaria secretaria : secretarias){
            if(secretaria.getId() == id){
                return secretaria;
            }
        }
        return null;
    }
}
