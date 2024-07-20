/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

<<<<<<< HEAD
=======
import Colecao.ColecaoConsultas;
import Colecao.ColecaoMedicos;
import Colecao.ColecaoPacientes;

>>>>>>> 7403a44c771843187f67315dc9536788586f0da5
import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class MenuSecretaria {
    
    private ColecaoMedicos colecaoMedicos;
    private ColecaoPacientes colecaoPacientes;
    private ColecaoConsultas colecaoConsultas;
    
    public MenuSecretaria(ColecaoMedicos colecaoMedicos, ColecaoPacientes colecaoPacientes, ColecaoConsultas colecaoConsultas){
        this.colecaoMedicos = colecaoMedicos;
        this.colecaoPacientes = colecaoPacientes;
        this.colecaoConsultas = colecaoConsultas;
    }

    Scanner read = new Scanner(System.in);
    
    public int chamaConsulta() {
        int option = 0;
        
        System.out.println("USUÁRIO: SECRETÁRIA");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("| Opção |                  Tipo                       |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|   1   |              Marcar consulta                |");
        System.out.println("|   2   |             Atualizar consulta              |");
        System.out.println("|   3   |              Remover consulta               |");
        System.out.println("|   4   | Gerar relatório de consulta do dia seguinte |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|   5   |         Voltar para menu anterior           |");
        System.out.println("|   6   |          Voltar para tela inicial           |");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.print("Escolha a opção: ");
        option = read.nextInt();
        
        switch (option){
            case 1:
                // Colocar a classe secretaria.marcarConsulta
                
                break;
                
            case 2:
                // colocar a classe secretaria.atualizarConsulta
                break;
                
            case 3:
                // colocar a classe secretaria.removerConsulta
                break;
                
            case 4:
                // colocar a classe secretaria.gerarRelatorios
                break;
                
            default:
                break;   
        }
        return option;    
    }
    
    
<<<<<<< HEAD
    public static int chamaPaciente() {
        Scanner read = new Scanner(System.in);
=======
    public int chamaPaciente() {
    
>>>>>>> 7403a44c771843187f67315dc9536788586f0da5
        int option = 0;
        
        System.out.println("USUÁRIO: SECRETÁRIA");
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
                // Colocar a classe secretaria.cadastrarPaciente
                break;
                
            case 2:
                // colocar a classe secretaria.atualizarPaciente
                break;
                
            case 3:
                // colocar a classe secretaria.removerPaciente
                break;
                
            case 4:
                // colocar a classe secretaria.listaPaciente
                break;
                
            default:
                break;   
        }
        return option;    
        
    }
    
      
    public int usuarioSecretaria() {
        
        int option = 0;
        
        System.out.println("USUÁRIO: SECRETÁRIA");
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("| Opção |           Tipo            |");
        System.out.println("|-----------------------------------|");
        System.out.println("|   1   |        Consultas          |");
        System.out.println("|   2   |        Pacientes          |");
        System.out.println("|   3   |      Lista de médicos     |");
        //System.out.println("|   4   |   Lista de secretárias    |"); somente adm pode fazer isso
        System.out.println("|-----------------------------------|");
        System.out.println("|   5   | Voltar para tela inicial  |");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.print("Escolha a opção: ");
        option = read.nextInt();
        
        Main.limpaTela();
        int option1 = 0;
        switch (option){
            case 1:
                while (option1 != 5 && option1 != 6){
                    option1 = chamaConsulta();
                    if (option1 == 6){
                        option = 3;
                    }
                    Main.limpaTela();
                }
                break;
            
            case 2:
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
                break;
                
            //case 4:
                // Exbir todas as secretárias que estão na lista
                //break;
                
            default:
                break;
                
        }
        return option; 
        
        
    }
    
    
    
    
}
