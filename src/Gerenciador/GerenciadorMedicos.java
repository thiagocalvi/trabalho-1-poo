/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;
import Colecao.ColecaoConsultas;
import Colecao.ColecaoPacientes;
import Colecao.ColecaoProntuarios;
import Colecao.ColecaoDadosMedicos;

import Modelo.Paciente;
import Modelo.Consulta;
import Modelo.Prontuario;
import Modelo.DadosMedicos;
import Modelo.Medico;

import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author jeanm
 */
public class GerenciadorMedicos {
    
    private ColecaoConsultas colecaoConsultas;
    private ColecaoPacientes colecaoPacientes;
    private ColecaoProntuarios colecaoProntuarios;
    private ColecaoDadosMedicos colecaoDadosMedicos; 
    private Medico medico;
    private int idDadosMedicosControle = 0;
    private int idProtuarioControle = 0;

    
    
    public GerenciadorMedicos(ColecaoConsultas colecaoConsultas, ColecaoPacientes colecaoPacientes, ColecaoProntuarios colecaoProntuarios, ColecaoDadosMedicos colecaoDadosMedicos){
        this.colecaoConsultas = colecaoConsultas;
        this.colecaoPacientes = colecaoPacientes;
        this.colecaoProntuarios = colecaoProntuarios;
        this.colecaoDadosMedicos = colecaoDadosMedicos;
    }
    
    public Medico getMedico(){
        return this.medico;
    }
    
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    
    Scanner read = new Scanner(System.in);
    
    

}