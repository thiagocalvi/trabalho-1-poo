/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author MatheusConsoni
 */
public class Paciente extends Pessoa{
    //Atributos
    private int id;
    private tipoConvenio tipoConvenio;
    private DadosMedicos dadosMedicos;
    
    //tipoConvenio
    public enum tipoConvenio{
        PARTICULAR,
        PLANOSAUDE
    };
    
    //Construtor
    public Paciente(int id, tipoConvenio tipoConvenio, DadosMedicos dadosMedicos, String Nome, LocalDate dataNascimento, String Endereco, String telefone, String email) {
        super(Nome, dataNascimento, Endereco, telefone, email);
        this.id = id;
        this.tipoConvenio = tipoConvenio;
        this.dadosMedicos = dadosMedicos;
    }
    
    //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public tipoConvenio getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(tipoConvenio tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }
    
    public DadosMedicos getDadosMedicos() {
        return dadosMedicos;
    }

    public void setDadosMedicos(DadosMedicos dadosMedicos) {
        this.dadosMedicos = dadosMedicos;
    }
    
    
}