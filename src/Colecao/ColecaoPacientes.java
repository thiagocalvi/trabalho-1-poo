/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecao;

import Modelo.Paciente;
import java.util.ArrayList;
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

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
}
