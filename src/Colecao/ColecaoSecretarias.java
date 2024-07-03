/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecao;

import Modelo.Secretaria;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author thiago
 */
public class ColecaoSecretarias {
    private List<Secretaria> secretarias;

    public ColecaoSecretarias(){
        this.secretarias = new ArrayList<Secretaria>();
    }

    public List<Secretaria> getSecretarias() {
        return secretarias;
    }

    public void setSecretarias(List<Secretaria> secretarias) {
        this.secretarias = secretarias;
    }
}
