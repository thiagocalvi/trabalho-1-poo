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
public class ColecaoPacientes {
    private List<Paciente> pacientes;
    
    public ColecaoPacientes(){
        this.pacientes = new ArrayList<Paciente>();
    }

            
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    
    public void adicionar(Paciente paciente){
        this.pacientes.add(paciente);
    }
    
    public void remover(Paciente paciente){
        this.pacientes.remove(paciente);
    }
    
    public Paciente buscar(int id){
        for(Paciente paciente : pacientes){
            if(paciente.getId() == id){
                return paciente;
            }
        }
        return null;
    }
    
}
