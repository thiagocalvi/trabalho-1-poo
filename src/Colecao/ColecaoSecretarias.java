/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecao;

import Modelo.Secretaria;
import java.util.ArrayList;
/**
 *
 * @author thiago
 */
public class ColecaoSecretarias {
    private static ArrayList<Secretaria> secretarias;

    public static ArrayList getSecretarias() {
        return secretarias;
    }
    
    public static void add(Secretaria secretaria){
        secretarias.add(secretaria);
    }
    
    public static void remove(Secretaria secretaria){
        secretarias.remove(secretaria);
    }
    
}