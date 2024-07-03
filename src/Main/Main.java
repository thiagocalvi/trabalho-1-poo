/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Colecao.ColecaoMedicos;
import Modelo.Medico;
import java.time.LocalDate;

/**
 *
 * @author thiago
 */
public class Main {
    public static void main(String[] args){
        Medico medico1 = new Medico("Geral", 122322, "Paulo", LocalDate.of(2000,06,22),"Rua tal", "4499999999", "teste@email.com");
        
        ColecaoMedicos  colecaoMedicos = new ColecaoMedicos();
        
        colecaoMedicos.adicionar(medico1);
        
        System.out.println(colecaoMedicos.buscar(122322).getDataNascimento());
        
    }
}
