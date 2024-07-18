/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;
import Colecao.ColecaoMedicos;
import Modelo.Medico;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author jeanm
 */
public class GerenciadorMedicos {
    
    private ColecaoMedicos colecaoMedicos;
    
    public GerenciadorMedicos(ColecaoMedicos colecaoMedicos){
        this.colecaoMedicos = colecaoMedicos;
    }
    
    Scanner read = new Scanner(System.in);
    
    // MÉTODOS
    public void cadastrarMedico() {
        System.out.println("----------------------------");
        System.out.println("      TELA DE CADASTRO      ");
        System.out.println("----------------------------");
        
        System.out.print("Nome médico: ");
        String nome = read.nextLine();
        
        System.out.println("Data de nascimento DIA/MES/ANO: ");
        //System.out.print("00/00/0000 : ");
        String data = read.nextLine();
        
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));    
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        
        System.out.print("Telefone: ");
        String telefone = read.nextLine();
        
        System.out.print("E-mail:");
        String email = read.nextLine();
        
        System.out.print("Especialidade: ");
        String especialidade = read.nextLine();
        
        System.out.print("CRM: ");
        int crm = read.nextInt();
        
        Medico medico = new Medico(nome, dataNascimento, telefone, email, especialidade, crm);
               
        
        colecaoMedicos.getMedicos().add(medico);
        
        System.out.print(colecaoMedicos.getMedicos().get(0));
        
        // Colocar o metodo colecao.medico 
        
        System.out.println("----------------------------");
        System.out.println("    Cadastro finalizado!"    );
        System.out.println("----------------------------");

    }
    
    public void atualizarMedico(int id){
        
    }
    
    public void removerMedico(int id){
        
    }
    
    public Medico buscarMedico(int id){
        
        
        
        
        return null;
        
    }
    
    
    
}