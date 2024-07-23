/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;
import Modelo.Secretaria;
import Modelo.Paciente;
import Modelo.Medico;
import Modelo.Consulta;

import Colecao.ColecaoConsultas;
import Colecao.ColecaoMedicos;
import Colecao.ColecaoPacientes;

/**
 *
 * @author jeanm
 */
public class GerenciadorSecretarias {
    
    private ColecaoConsultas colecaoConsultas;
    private ColecaoMedicos colecaoMedicos; 
    private ColecaoPacientes colecaoPacientes;
    private Secretaria secretaria;
    private int idConsultaControle = 0;
    
    public GerenciadorSecretarias(ColecaoConsultas colecaoConsultas, ColecaoMedicos colecaoMedicos, ColecaoPacientes colecaoPacientes){
        this.colecaoConsultas = colecaoConsultas;
        this.colecaoMedicos = colecaoMedicos;
        this.colecaoPacientes = colecaoPacientes;
    }
    
    public Secretaria getSecretaria(){
        return this.secretaria;
    }
    
    public void setSecretaria(Secretaria secretaria){
        this.secretaria = secretaria;
    }
}