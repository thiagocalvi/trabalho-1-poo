/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecao;

import Modelo.Prontuario;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author thiago
 */
public class ColecaoProntuarios {
    private List<Prontuario> prontuarios;
    
    public ColecaoProntuarios(){
        this.prontuarios = new ArrayList<Prontuario>();
    }

    public List<Prontuario> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(List<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }
    
}
