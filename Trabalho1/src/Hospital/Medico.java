/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.time.LocalDate;

/**
 *
 * @author MatheusConsoni
 */
public class Medico extends Pessoa{
    //Atributos
    private String especialidade;
    private int crm;
    
    //Construtor
    public Medico(String especialidade, int crm, String Nome, LocalDate dataNascimento, String Endereco, String telefone, String email) {
        super(Nome, dataNascimento, Endereco, telefone, email);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    //Gets e Sets
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
}
