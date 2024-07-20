/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Colecao.ColecaoMedicos;
import Colecao.ColecaoSecretarias;

import Gerenciador.GerenciadorAdm;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class MenuAdm {
    
    private ColecaoMedicos colecaoMedicos;
    private ColecaoSecretarias colecaoSecretarias;
    private GerenciadorAdm gerenciadorAdm;
    
    public MenuAdm(ColecaoMedicos colecaoMedicos, ColecaoSecretarias colecaoSecretarias){
        this.colecaoMedicos = colecaoMedicos;
        this.colecaoSecretarias = colecaoSecretarias;
        this.gerenciadorAdm  = new GerenciadorAdm(this.colecaoMedicos, this.colecaoSecretarias); 
    }
    
    
    static Scanner read = new Scanner(System.in); 
    
    public int chamaMedico() {
        
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
        
        switch (option){
            case 1:
               //Cadastrar médico
                System.out.println("Gostaria de usar uma base de dados interna?");
                System.out.println("[0] - Para sim \n[1] - Para não");
                int opt = read.nextInt();
                
                if(opt == 0){
                    gerenciadorAdm.cadastroMedicosInterno();
                }
                else{
                    gerenciadorAdm.cadastrarMedico();                
                }
                break;
                
            case 2:
                //Atualizar médico
                gerenciadorAdm.autualizarMedico();
                break;
                
            case 3:
                //Remover médico
                gerenciadorAdm.removerMedico();
                break;
                
            case 4:
                //Listar médicos
                gerenciadorAdm.listarMedicos();
                break;
                
            default:
                break;   
        }
        
        return option;
    }
    
    public int chamaSecretaria() {
        
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
                //Cadastrar secretaria
                System.out.println("Gostaria de usar uma base de dados interna?");
                System.out.println("[0] - Para sim \n[1] - Para não");
                int opt = read.nextInt();
                
                if(opt == 0){
                    gerenciadorAdm.cadastroSecretariaIterno();
                }
                else{
                    gerenciadorAdm.cadastrarSecretaria();                
                }
               
                break;
                
            case 2:
                //Atualizar secretaria
                gerenciadorAdm.atualizarSecretaria();
                break;
                
            case 3:
                //Remover secretaria
                gerenciadorAdm.removerSecretaria();
                break;
                
            case 4:
                //Listar secretarias
                gerenciadorAdm.listarSecretarias();
                break;
                
            default:
                break;   
        }
        return option;     
    }
   
    public int usuarioAdm() {
       
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
                    if (option1 != 4){
                        Main.limpaTela();    
                    }
                }
                break;
            
            case 2:
                while (option1 != 5 && option1 != 6){
                    option1 = chamaSecretaria();
                    if (option1 == 6){
                        option = 3;
                    }
                    if (option1 != 4){
                        Main.limpaTela();    
                    }
                }
                break;
       
        }
        return option; 
    }
    
}