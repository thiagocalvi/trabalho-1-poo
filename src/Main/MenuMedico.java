/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Colecao.ColecaoConsultas;
import Colecao.ColecaoPacientes;
import Colecao.ColecaoProntuarios;
import Colecao.ColecaoMedicos;
import Colecao.ColecaoDadosMedicos;

import Gerenciador.GerenciadorMedicos;
import Modelo.Medico;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author geanm
 */

public class MenuMedico { 
    
    private ColecaoConsultas colecaoConsultas;
    private ColecaoPacientes colecaoPacientes;
    private ColecaoProntuarios colecaoProntuarios;
    private ColecaoMedicos colecaoMedicos;
    private GerenciadorMedicos gerenciadorMedicos;
    private ColecaoDadosMedicos colecaoDadosMedicos; 
    
    public MenuMedico(ColecaoConsultas colecaoConsultas, ColecaoPacientes colecaoPacientes, ColecaoProntuarios colecaoProntuarios, ColecaoMedicos colecaoMedicos, ColecaoDadosMedicos colecaoDadosMedicos){
        this.colecaoConsultas = colecaoConsultas;
        this.colecaoPacientes = colecaoPacientes;
        this.colecaoProntuarios = colecaoProntuarios;
        this.colecaoMedicos = colecaoMedicos;
        this.gerenciadorMedicos = new GerenciadorMedicos(colecaoConsultas, colecaoPacientes, colecaoProntuarios, colecaoDadosMedicos);
        
    }
    
    static Scanner read = new Scanner(System.in);
    
    public static int menuDadosAdicionais() {
        System.out.println("USUÁRIO: MÉDICO");
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("|           DADOS ADICIONAIS          |");
        System.out.println("---------------------------------------");
        System.out.println("| Opção |            Tipo             |");
        System.out.println("|-------------------------------------|");
        System.out.println("|   1   |          Cadastrar          |");
        System.out.println("|   2   |          Atualizar          |");
        System.out.println("|   3   |           Remover           |");
        System.out.println("|   4   | Voltar para a tela anterior |");
        System.out.println("---------------------------------------");        
        System.out.println("");

        System.out.println("Opção: ");
        int option = read.nextInt();
        
        Main.limpaTela();
        switch (option){
            case 1:
                // Implementar o cadastro dos dados adicionais
                break;
                
            case 2:
                // Implementar o atualizar
                break;
                
            case 3:
                // Implementar o remover
                break;
                
            case 4:
                break;
                
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        return option;
    }
    
    
    public static int menuProntuario() {
        System.out.println("USUÁRIO: MÉDICO");
        System.out.println("");       
        System.out.println("---------------------------------------");
        System.out.println("|              PRONTUÁRIO             |");
        System.out.println("---------------------------------------");
        System.out.println("| Opção |            Tipo             |");
        System.out.println("|-------------------------------------|");
        System.out.println("|   1   |          Cadastrar          |");
        System.out.println("|   2   |          Atualizar          |");
        System.out.println("|   3   |           Remover           |");
        System.out.println("|   4   | Voltar para a tela anterior |");
        System.out.println("---------------------------------------");
        System.out.println("");
        
        System.out.println("Opção: ");
        int option = read.nextInt();
        
        Main.limpaTela();
        switch (option){
            case 1:
                // Implementar o cadastro
                break;
                
            case 2:
                // Implementar o atualizar
                break;
                
            case 3:
                // Implementar o remover
                break;
                
            case 4:
                break;
                
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        return option;
    }
    
    
    
    public static int menuConsulta() {
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("|            Consulta          |");
        System.out.println("--------------------------------");
        System.out.println("| Opção |        Tipo          |");
        System.out.println("|------------------------------|");
        System.out.println("|   1   |   Dados adicionais   |");
        System.out.println("|   2   |      Prontuário      |");
        System.out.println("|   3   |   Gerar relatórios   |");
        System.out.println("|   4   |  Finalizar consulta  |");
        System.out.println("--------------------------------");        
        System.out.println("");

        System.out.print("Opção: ");
        int option = read.nextInt();

        if (option != 4){
            Main.limpaTela();
        }

        int option1 = 0;
        switch (option){
            case 1:
                while (option1 != 4){
                    option1 = menuDadosAdicionais();
                    Main.limpaTela();
                }
                break;
                
            case 2:
                while (option1 != 4){
                    option1 = menuProntuario();
                    Main.limpaTela();
                }
                break;
                
            case 3:
                // Implementar os gerenciadores de relatórios.
                Main.limpaTela();
                break;
                
            case 4:
                System.out.println("Você realmente deseja 'FINALIZAR' a consulta?");
                System.out.println("[0] - Para sim \n[1] - Para não");
                int option2 = read.nextInt();
                
                if (option2 == 1){
                    System.out.println("CONSULTA NÃO FINALIZADA!");
                    option = 0;
                } else if (option2 == 0){
                    System.out.println("CONSULTA FINALIZADA!");
                }
                break;
                
            default:
                System.out.println("Opção inválida!");
                break;
        }
 
        return option;      
    }
    
    
    public int chamaConsultaMarcada() {
        int option = 0;

        System.out.println("USUÁRIO: MÉDICO");
        System.out.println("Doutor(a): " + gerenciadorMedicos.getMedico().getNome());
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Consultas do dia: ");
        System.out.println("");
        
        // Pegar a lista de paciente referente as consultas do dia naquele médico e exibir aqui
        gerenciadorMedicos.listaConsultasDoDia();
        
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println("Iniciar consulta ?"); // Colocar o nome do paciente que será atendido
        System.out.println("[1] - Para sim \n[2] - Para não");
        option = read.nextInt();
        
        Main.limpaTela();
        
        int option1 = 0;
        switch (option){
            case 1:
                while (option1 != 4){
                    option1 = menuConsulta();
                    Main.limpaTela();
            }            
        }
        return option;
    } 
    
    
    public int menuInicial() {
        
        System.out.println("");
        System.out.println("USUÁRIO: MÉDICO");
        System.out.println("Doutor(a): " + gerenciadorMedicos.getMedico().getNome());
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("| Opção |          Tipo            |");
        System.out.println("|----------------------------------|");
        System.out.println("|   1   |    Consulta marcadas     |");
        System.out.println("|----------------------------------|");
        System.out.println("|   2   |      Sair da conta       |");
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.print("Opção: ");
        int option = read.nextInt();
        
        Main.limpaTela();
        int option1 = 0;
        switch (option){
            case 1:
                while (option1 != 2){
                    option1 = chamaConsultaMarcada();
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
    
    
    public int usuarioMedico() {
        
        // Listar todos os médicos
        ArrayList<Medico> allMedicos = colecaoMedicos.getMedicos();
        
        System.out.println("+-----------------------------------------+");
        for(Medico medico : allMedicos){
            System.out.printf("| Identificador: %-25s \n", medico.getId());
            System.out.printf("| Nome: %-25s \n", medico.getNome());
            System.out.printf("| Especialidade: %-15s \n", medico.getEspecialidade());
            System.out.printf("| CRM: %-24d \n", medico.getCrm());
            System.out.println("+-----------------------------------------+");
        }

        System.out.println("\n \n");
        System.out.println("USUÁRIO: MÉDICO");
        System.out.println("");
        System.out.print("LOGIN DO MÉDICO (IDENTIFICADOR) ou (0 para sair):");
        int id = read.nextInt();
        System.out.println("");
        
        if(id == 0){
            return 2;
        }
            
        Medico medico = colecaoMedicos.getMedicoById(id);
        
        System.out.println("-----------------------------------------");
        System.out.printf("| Nome: %-25s \n", medico.getNome());
        System.out.printf("| CRM: %-24d \n", medico.getCrm());
        System.out.println("-----------------------------------------");
        System.out.println("[1] - Para entrar na conta \n[2] - Para voltar na tela inicial");
        System.out.println("------------------------------------");  
        System.out.println("");
        System.out.print("Opção: ");
        int option = read.nextInt();
                
        Main.limpaTela();
        int option1 = 0;
        switch (option){
            case 1:
                gerenciadorMedicos.setMedico(medico);
                
                while (option1 != 2){
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