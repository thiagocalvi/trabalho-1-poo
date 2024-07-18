/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;
import Modelo.Consulta;
import Modelo.Paciente;
import Modelo.Medico;


import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author jeanm
 */
public class GerenciadorConsultas {

    private int contadorId = 0;
    
    Scanner read = new Scanner(System.in);
    
    public int gerarId(){
        int id = this.contadorId += 1;
        return id;
    }
    
    // MÉTODOS
    public void cadastrarConsulta(Paciente paciente, Medico medico){
        /*
            Cadastrar consulta
            Recebe o objeto paciente e medico
            
        */
        System.out.println("----------------------------");
        System.out.println("     TELA DE CADASTRO:      ");
        System.out.println("----------------------------");
        System.out.print("Nome: ");
        String nome = read.nextLine();
        
        System.out.println("Data de nascimento DIA/MES/ANO: ");
        System.out.print("00/00/0000 : ");
        String data = read.nextLine();
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));    
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        
        
        // Colocar o metodo colecao.medico 
        
        System.out.println("----------------------------");
        System.out.println("    Consulta cadastrada!    ");
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