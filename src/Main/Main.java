/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.DadosMedicos;
import Modelo.Consulta;
import Modelo.Secretaria;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import java.util.Scanner;
/**
 *
 * @author thiago
 */
public class Main {
    public static void limpaTela() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        int option = 0;
        
        while (option != 4){
            System.out.println("TELA INICIAL");
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("| Opção |      Tipo        |");
            System.out.println("|--------------------------|");
            System.out.println("|   1   |  Administrador   |");
            System.out.println("|   2   |    Secretária    |");
            System.out.println("|   3   |      Médico      |");
            System.out.println("|   4   | Sair do Programa |");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.print("Qual usuário você vai logar (Opção): ");
            option = read.nextInt();

            limpaTela();
            int option1 = 0;
            switch (option) {
                case 1:
                    while (option1 != 3) {
                      option1 = MenuAdm.usuarioAdm();
                      limpaTela();
                    }
                    break;

                case 2:                    
                    while (option1 != 5){
                        option1 = MenuSecretaria.usuariaSecretaria();
                        limpaTela();
                    }                  
                    break;

                case 3:                    
                    while (option1 != 5){
                        option1 = MenuMedico.usuarioMedico();
                        limpaTela();
                    }       
                    break;
                    
                default:
                    break;
            }
        } 
               
    }      
}  

