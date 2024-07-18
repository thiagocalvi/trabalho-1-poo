/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecao;

import Modelo.Medico;
import java.util.ArrayList;
/**
 *
 * @author thiago
 */
public class ColecaoMedicos {
    private static final ArrayList medicos = new ArrayList<Medico>();  

    public static ArrayList getMedicos() {
        return medicos;
    }
    
    public static void add(Medico medico){
        medicos.add(medico);
    }
    
    public static void remove(Medico medico){
        medicos.remove(medicos);
    }
    
}
