/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author geanm
 */
public class MenuMedico {
    public static String chamaConsulta() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("--------------------------------");
        System.out.println("Consultas do dia: ");
        // Pegar a lista referente as consultas do dia e exibir aqui
        
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.print("Iniciar a consulta com o paciente [SIM/NAO]?  ");
        String resp = read.next();
        
        if ("SIM".equals(resp.toUpperCase())){
            
        }
        
        return resp;
    }
    
    
    
    
    
    
    
    
    
    
    public static int usuarioMedico() {
        Scanner read = new Scanner(System.in);
        int option = 0;
        
        System.out.println("");
        System.out.println("USUÁRIO: MÉDICO");
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("| Opção |          Tipo            |");
        System.out.println("|----------------------------------|");
        System.out.println("|   1   |    Consulta marcadas     |");
        System.out.println("|----------------------------------|");
        System.out.println("|   2   | Voltar para tela Inicial |");
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.print("Opção: ");
        option = read.nextInt();
        
        String resposta =  "";
        switch (option){
            case 1:
                while (!"NAO".equals(resposta.toUpperCase())){
                    resposta = chamaConsulta();
                    }
                    Main.limpaTela();               
                break;
             
            default:
                break;   
        }
        return option;     
        
        
    }
}
