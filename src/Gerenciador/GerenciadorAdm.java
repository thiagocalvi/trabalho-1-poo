/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;

import Colecao.ColecaoMedicos;
import Colecao.ColecaoSecretarias;
import Modelo.Medico;
import Modelo.Secretaria;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author thiago
 */

// Gerenciador de uso exclusivo do Administrador
// CRUD dos objetos Secretaria e Médico

public class GerenciadorAdm {
    
    private ColecaoMedicos colecaoMedicos;
    private ColecaoSecretarias colecaoSecretarias;
    private int idMedicoControle = 0;
    private int idSecretariaControle = 0;
    
    
    public GerenciadorAdm(ColecaoMedicos colecaoMedicos, ColecaoSecretarias colecaoSecretarias){
        this.colecaoMedicos = colecaoMedicos;
        this.colecaoSecretarias = colecaoSecretarias;
    }
    
    
    Scanner read = new Scanner(System.in);
    
    
    //METODOS MEDICO
    public void cadastrarMedico() {
        System.out.println("----------------------------");
        System.out.println("      TELA DE CADASTRO      ");
        System.out.println("----------------------------");
        
        System.out.print("Nome médico: ");
        String nome = read.nextLine();
        
        System.out.println("Data de nascimento DIA/MES/ANO: ");
        System.out.print("00/00/0000 : ");
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
        this.idMedicoControle += 1;
        medico.setId(this.idMedicoControle);
               
        colecaoMedicos.add(medico);
            
        System.out.println("----------------------------");
        System.out.println("    Cadastro finalizado!"    );
        System.out.println("----------------------------");

    }
    
    public void autualizarMedico(){
        
    }
    
    public void removerMedico(){
        
    }

    public void listarMedicos(){
        
    }

    
    //METODOS SECRETARIA
    public void cadastrarSecretaria(){
        System.out.println("----------------------------");
        System.out.println("      TELA DE CADASTRO      ");
        System.out.println("----------------------------");
        
        System.out.print("Nome da secretaria: ");
        String nome = read.nextLine();
        
        System.out.println("Data de nascimento DIA/MES/ANO: ");
        System.out.print("00/00/0000 : ");
        String data = read.nextLine();
        
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));    
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        
        System.out.print("Telefone: ");
        String telefone = read.nextLine();
        
        System.out.print("E-mail:");
        String email = read.nextLine();
        
        
        Secretaria secretaria = new Secretaria(nome, dataNascimento, telefone, email);
               
        colecaoSecretarias.add(secretaria);
            
        System.out.println("----------------------------");
        System.out.println("    Cadastro finalizado!"    );
        System.out.println("----------------------------");        
    }
    
    public void atualizarSecretaria(){
        
    }
    
    public void removerSecretaria(){
        
    }
    
    public void ListarSecretarias(){
        
    }
}
