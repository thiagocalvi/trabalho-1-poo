/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author MatheusConsoni
 */
public class Secretaria extends Pessoa{
    //Atributos
    private int id;
    private List<Medico> medicos;
    
    //Construtor
    public Secretaria(int id, List<Medico> medicos, String Nome, LocalDate dataNascimento, String Endereco, String telefone, String email) {
        super(Nome, dataNascimento, Endereco, telefone, email);
        this.id = id;
        this.medicos = medicos;
    } 
    
    
     //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
    
}
