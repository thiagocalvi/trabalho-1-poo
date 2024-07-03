/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecao;

import Modelo.Consulta;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author thiago
 */
public class ColecaoConsultas {
    private List<Consulta> consultas;

    
    public ColecaoConsultas(){
        this.consultas = new ArrayList<Consulta>();
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
}
