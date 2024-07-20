/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Colecao.*;


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
        
        //Inicializando as coleções
        ColecaoConsultas colecaoConsultas = new ColecaoConsultas();
        ColecaoPacientes colecaoPacientes = new ColecaoPacientes();
        ColecaoProntuarios colecaoProntuarios = new ColecaoProntuarios();
        ColecaoMedicos colecaoMedicos = new ColecaoMedicos();
        ColecaoSecretarias colecaoSecretarias = new ColecaoSecretarias();
        
        //Inicializando os menus
        MenuAdm menuAdm = new MenuAdm(colecaoMedicos, colecaoSecretarias);
        MenuSecretaria menuSecretaria = new MenuSecretaria(colecaoMedicos, colecaoPacientes, colecaoConsultas);
        MenuMedico menuMedico = new MenuMedico(colecaoConsultas, colecaoPacientes, colecaoProntuarios);


        //System.out.println("Atenção: Para o correto funcionamento  do sistema é necessario cadastrar pelomenos 1 de cada usuarios:");
        //System.out.println("- Seretaria\n- Medico");
        //System.out.println("Um pré cadastro desses usuarios está disponivel, para utilizar entre como administrador");
            
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
                      option1 = menuAdm.usuarioAdm();
                      limpaTela();
                    }
                    break;

                case 2:                    
                    while (option1 != 5){
                        option1 = menuSecretaria.usuarioSecretaria();
                        limpaTela();
                    }                  
                    break;

                case 3:          
                    while (option1 != 5){
                        option1 = menuMedico.usuarioMedico();
                        limpaTela();
                    }       
                    break;
                    
                default:
                    break;
            }
        } 
               
    }      
}  

