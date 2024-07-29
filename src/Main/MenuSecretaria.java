/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Gerenciador.GerenciadorSecretarias;

import Colecao.ColecaoConsultas;
import Colecao.ColecaoMedicos;
import Colecao.ColecaoPacientes;
import Colecao.ColecaoSecretarias;

import Modelo.Secretaria;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author geanm
 */
public class MenuSecretaria {
    
    private ColecaoMedicos colecaoMedicos;
    private ColecaoPacientes colecaoPacientes;
    private ColecaoConsultas colecaoConsultas;
    private ColecaoSecretarias colecaoSecretarias;
    private GerenciadorSecretarias gerenciadorSecretarias;
    
    public MenuSecretaria(ColecaoMedicos colecaoMedicos, ColecaoPacientes colecaoPacientes, ColecaoConsultas colecaoConsultas, ColecaoSecretarias colecaoSecretarias){
        this.colecaoMedicos = colecaoMedicos;
        this.colecaoPacientes = colecaoPacientes;
        this.colecaoConsultas = colecaoConsultas;
        this.colecaoSecretarias = colecaoSecretarias; 
        this.gerenciadorSecretarias = new GerenciadorSecretarias(colecaoConsultas, colecaoMedicos, colecaoPacientes);
    }

    Scanner read = new Scanner(System.in);
    
    public int chamaConsulta() {
        int option = 0;
        
        System.out.println("USUÁRIO: SECRETÁRIA");
        System.out.println("Secretária: " + gerenciadorSecretarias.getSecretaria().getNome());
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Opção |                  Tipo                       |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|   1   |              Marcar consulta                |");
        System.out.println("|   2   |             Atualizar consulta              |");
        System.out.println("|   3   |              Remover consulta               |");
        System.out.println("|   4   |             Lista de consultas              |");        
        System.out.println("|   5   | Gerar relatório de consulta do dia seguinte |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|   6   |         Voltar para menu anterior           |");
        System.out.println("|   7   |          Voltar para tela inicial           |");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.print("Escolha a opção: ");
        option = read.nextInt();
        
        switch (option){
            case 1:
                // Cadastrar consulta
                gerenciadorSecretarias.cadastrarConsulta();
                
                break;
                
            case 2:
                // Atualizar consulta
                gerenciadorSecretarias.atualizarConsulta();
                break;
                
            case 3:
                // Remover Consulta
                gerenciadorSecretarias.removerConsulta(); ;
                break;
                
            case 4:
                // Lista de consultas
                gerenciadorSecretarias.listarConsultas();
                break;
                
            case 5:
                // Gerar Relatorios
                break;
                
            case 6:
                break;
                
            case 7:
                break;
                
            default:
                break;   
        }
        return option;    
    }
    
    
    public int chamaPaciente() {
    
        int option = 0;
        
        System.out.println("USUÁRIO: SECRETÁRIA");
        System.out.println("Secretária: " + gerenciadorSecretarias.getSecretaria().getNome());
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("| Opção |             Tipo              |");
        System.out.println("|---------------------------------------|");
        System.out.println("|   1   |       Cadastrar paciente      |");
        System.out.println("|   2   |       Atualizar paciente      |");
        System.out.println("|   3   |        Remover paciente       |");
        System.out.println("|   4   |       Lista de pacientes      |");
        System.out.println("|---------------------------------------|");
        System.out.println("|   5   |  Voltar para menu anterior    |");
        System.out.println("|   6   |   Voltar para tela inicial    |");
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.print("Escolha a opção: ");
        option = read.nextInt();
        
        switch (option){
            case 1:
                // Cadastrar paciente
                gerenciadorSecretarias.cadastrarPaciente();
                break;
                
            case 2:
                // Atualizar paciente
                gerenciadorSecretarias.atualizarPaciente();
                break;
                
            case 3:
                // Remover paciente
                gerenciadorSecretarias.removerPaciente();
                break;
                
            case 4:
                // Lista paciente
                gerenciadorSecretarias.listarPacientes();
                break;
             
            case 5:
                break;
                
            case 6:
                break;
                
            default:
                break;   
        }
        return option;    
        
    }
    
    public int menuInicial() {
        int option = 0;
        
        System.out.println("USUÁRIO: SECRETÁRIA");
        System.out.println("Secretária: " + gerenciadorSecretarias.getSecretaria().getNome());
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("| Opção |           Tipo            |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   1   |         Consultas         |");
        System.out.println("|   2   |         Pacientes         |");
        System.out.println("|   3   |      Lista de médicos     |");
        System.out.println("|   4   |      Enviar mensagens     |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   5   |       Sair da conta       |");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.print("Escolha a opção: ");
        option = read.nextInt();
        
        Main.limpaTela();
        int option1 = 0;
        switch (option){
            case 1:
                // Menu Consulta
                while (option1 != 6 && option1 != 7){
                    option1 = chamaConsulta();
                    if (option1 == 6){
                        option = 3;
                    }
                    Main.limpaTela();
                }
                break;
            
            case 2:
                // Menu Paciente
                while (option1 != 5 && option1 != 6){
                    option1 = chamaPaciente();
                    if (option1 == 6){
                        option = 3;
                    }    
                    Main.limpaTela();
                }
                break;
       
            case 3:
                // Exibir todos os médicos que estão na lista
                 gerenciadorSecretarias.listarMedicos();
                break;
                    
            case 4: 
                // Envia as mensagens para os clientes avisando sobre a consulta do dia seguinte
                break;
                        
            case 5:
                break;
                
            default:
                break;
                
        }
        return option;
    }
    
    
      
    public int usuarioSecretaria() {
        
        //Listar todas as secretarias
        ArrayList<Secretaria> allSecretarias = colecaoSecretarias.getSecretarias();
        
        
        for(Secretaria secretaria : allSecretarias){
            System.out.println("+----------------------------------------+");
            System.out.printf("| Identificador: %-25s \n", secretaria.getId());
            System.out.printf("| Nome: %-25s \n", secretaria.getNome());
            System.out.println("+----------------------------------------+");
        } 
        System.out.println("\n \n");
        System.out.println("USUÁRIO: SECRETÁRIA");
        System.out.println("");
        System.out.print("LOGIN DA SECRETARIA (IDENTIFICADOR) ou (0 para sair):");
        int id = read.nextInt();
        System.out.println("");
        
        if(id == 0){
            return 2;
        }
        
        Secretaria secretaria = colecaoSecretarias.getSecretariaById(id);
        
        System.out.println("-----------------------------------------");
        System.out.printf("| Nome: %-25s \n", secretaria.getNome());
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Para entrar na conta \n[2] - Para voltar na tela inicial");
        System.out.println("-----------------------------------------");  
        System.out.println("");
        System.out.print("Opção: ");
        int option = read.nextInt();    
        
        
        Main.limpaTela();   
        int option1 = 0;
        switch (option){
            case 1:
                gerenciadorSecretarias.setSecretaria(secretaria);
                
                while (option1 != 5){
                    option1 = menuInicial();
                    Main.limpaTela();
                }
                break;
            
            case 2:
                break;
                
            default:
                break;
            
        }
        return option; 
    } 
}
