/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;
import Modelo.Medico;
import Modelo.Secretaria;
import Gerenciador.GerenciadorMedicos;
import Gerenciador.GerenciadorSecretarias;

/**
 *
 * @author geanm
 */
public class MenuAdm {
    public static int chamaMedico() {
        Scanner read = new Scanner(System.in);
        int option = 0;
        
        System.out.println("USUÁRIO: ADMINISTRADOR");
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("| Opção |           Tipo            |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   1   |      Cadastrar médico     |");
        System.out.println("|   2   |      Atualizar médico     |");
        System.out.println("|   3   |       Remover médico      |");
        System.out.println("|   4   |      Lista de médicos     |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   5   | Voltar para menu anterior |");
        System.out.println("|   6   | Voltar para tela inicial  |");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.print("Escolha a opção: ");
        option = read.nextInt();
        
        GerenciadorMedicos gerenciadorMedicos = new GerenciadorMedicos();
        
        switch (option){
            case 1:
                // Colocar a classe medico.cadastro
                break;
                
            case 2:
                // colocar a classe medico.atualizar
                break;
                
            case 3:
                // colocar a classe medico.remover
                break;
                
            case 4:
                // colocar a classe medico.lista
                break;
                
            default:
                break;   
        }
        
        return option;
    }
    
    public static int chamaSecretaria() {
        Scanner read = new Scanner(System.in);
        int option = 0;
        
        System.out.println("USUÁRIO: ADMINISTRADOR");
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("| Opção |           Tipo            |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   1   |    Cadastrar secretária   |");
        System.out.println("|   2   |    Atualizar secretária   |");
        System.out.println("|   3   |     Remover secretária    |");
        System.out.println("|   4   |     Lista de secretária   |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   5   | Voltar para menu anterior |");
        System.out.println("|   6   | Voltar para tela inicial  |");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.print("Escolha a opção: ");
        option = read.nextInt();
        
        switch (option){
            case 1:
                // Colocar a classe secretaria.cadastro
                break;
                
            case 2:
                // colocar a classe secretaria.atualizar
                break;
                
            case 3:
                // colocar a classe secretaria.remover
                break;
                
            case 4:
                // colocar a classe secretaria.lista
                break;
                
            default:
                break;   
        }
        return option;     
    }
   
    
    public static int usuarioAdm() {
        Scanner read = new Scanner(System.in);
        int option = 0;
    
        System.out.println("USUÁRIO: ADMINISTRADOR");
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("| Opção |          Tipo           |");
        System.out.println("|---------------------------------|");
        System.out.println("|   1   |         Médicos         |");
        System.out.println("|   2   |       Secretárias       |");
        System.out.println("|---------------------------------|");
        System.out.println("|   3   | Volta para tela Inicial |");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Qual dos funcionários você irá modificar ? :  ");
        System.out.print("Opção: ");
        option = read.nextInt();

        Main.limpaTela();
        int option1 = 0;
        switch (option){
            case 1:
                while (option1 != 5 && option1 != 6){
                    option1 = chamaMedico();
                    if (option1 == 6){
                        option = 3;
                    }
                    Main.limpaTela();
                }
                break;
            
            case 2:
                while (option1 != 5 && option1 != 6){
                    option1 = chamaSecretaria();
                    if (option1 == 6){
                        option = 3;
                    }
                    Main.limpaTela();
                }
                break;
       
        }
        return option; 
    }
    
}
