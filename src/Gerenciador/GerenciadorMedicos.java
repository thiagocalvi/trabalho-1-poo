/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;
import Modelo.Medico;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author jeanm
 */
public class GerenciadorMedicos {
    private String nome;
    private int dia, mes, ano;
    private String telefone;
    private String email;
    private String especialidade;
    private int crm;
    
    
    Scanner read = new Scanner(System.in);
    
    // MÉTODOS
    public void cadastrarMedico() {
        System.out.println("----------------------------");
        System.out.println("TELA DE CADASTRO: ");
        System.out.println("----------------------------");
        System.out.print("Nome: ");
        nome = read.nextLine();
        
        System.out.println("Data de nascimento DIA/MES/ANO: ");
        System.out.print("00/00/0000 : ");
        String data = read.nextLine();
        dia = Integer.parseInt(data.substring(0, 2));
        mes = Integer.parseInt(data.substring(3, 5));
        ano = Integer.parseInt(data.substring(6, 10));    
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        
        System.out.print("Telefone: ");
        telefone = read.nextLine();
        
        System.out.print("E-mail:");
        email = read.nextLine();
        
        System.out.print("Especialidade: ");
        especialidade = read.nextLine();
        
        System.out.print("CRM: ");
        crm = read.nextInt();
        
        Medico medico = new Medico(especialidade, crm, nome, dataNascimento, telefone, email);
        
        // Colocar o metodo colecao.medico 
        
        System.out.println("----------------------------");
        System.out.println("Cadastro finalizado!");
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