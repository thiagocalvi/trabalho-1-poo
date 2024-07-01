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
public class Paciente extends Pessoa{
    //Atributos
    private int id;
    private enum tipoConvenio{
        PARTICULAR,
        PLANOSAUDE
    };
    private DadosMedicos dadosMedicos;
    
    //Construtor
    public Paciente(int id, DadosMedicos dadosMedicos, String Nome, LocalDate dataNascimento, String Endereco, String telefone, String email) {
        super(Nome, dataNascimento, Endereco, telefone, email);
        this.id = id;
        this.dadosMedicos = dadosMedicos;
    }
    
    //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DadosMedicos getDadosMedicos() {
        return dadosMedicos;
    }

    public void setDadosMedicos(DadosMedicos dadosMedicos) {
        this.dadosMedicos = dadosMedicos;
    }
    
    
}
