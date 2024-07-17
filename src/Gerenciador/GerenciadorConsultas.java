/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;
import Modelo.Consulta;
import Modelo.Medico;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author jeanm
 */
public class GerenciadorConsultas {
    private int id;
    private LocalDate data;
    private LocalTime horario;
    
    
    
    
    // MÉTODOS
    public void cadastrarConsulta(Consulta consulta){
        System.out.println("----------------------------");
        System.out.println("TELA DE CADASTRO: ");
        System.out.println("----------------------------");
        System.out.print("Nome: ");
        nome = read.nextLine();
        
        System.out.println("Data de nascimento DIA/MES/ANO: ");
        System.out.print("00/00/0000 : ");
        String data = read.nextLine();
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));    
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        
        System.out.print("Endereço: ");
        endereco = read.nextLine(); 
        
        System.out.print("Telefone: ");
        telefone = read.nextLine();
        
        System.out.print("E-mail:");
        email = read.nextLine();
        
        System.out.print("Especialidade: ");
        especialidade = read.nextLine();
        
        System.out.print("CRM: ");
        crm = read.nextInt();
        
        Medico medico = new Medico(especialidade, crm, nome, dataNascimento, endereco, telefone, email);
        
        // Colocar o metodo colecao.medico 
        
        System.out.println("----------------------------");
        System.out.println("Cadastro finalizado!");
        System.out.println("----------------------------");

    }
    
    public void atualizarConsulta(Consulta consulta){
        
    }
    
    public void removerConsulta(Consulta consulta){
        
    }
    
    public Consulta buscarConsulta(int valor){
        
        return null;
        
    }
    
    public ArrayList gerarRelatorioConsultasDiaSeguinte(){
        
        return null;
        
    }
}