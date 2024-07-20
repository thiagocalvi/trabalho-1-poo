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
import java.util.ArrayList;

/**
 *
 * @author thiago
 */

// Gerenciador de uso exclusivo do Administrador
// CRUD dos objetos Secretaria e Médico

public class GerenciadorAdm {
    
    private final ColecaoMedicos colecaoMedicos;
    private final ColecaoSecretarias colecaoSecretarias;
    private int idMedicoControle = 0;
    private int idSecretariaControle = 0;
    
    
    public GerenciadorAdm(ColecaoMedicos colecaoMedicos, ColecaoSecretarias colecaoSecretarias){
        this.colecaoMedicos = colecaoMedicos;
        this.colecaoSecretarias = colecaoSecretarias;
    }
    
    
    Scanner read = new Scanner(System.in);
    
    
    //METODOS MEDICO
    public void cadastroMedicosInterno(){

        String[] nomes = {"João Silva", "Maria Oliveira", "Carlos Souza", "Ana Santos", "Pedro Lima"};
        String[] especialidades = {"Cardiologia", "Dermatologia", "Neurologia", "Pediatria", "Ortopedia"};
        String[] telefones = {"(11) 91234-5678", "(21) 98765-4321", "(31) 99876-5432", "(41) 91234-5678", "(51) 98765-4321"};
        String[] emails = {"joao.silva@exemplo.com", "maria.oliveira@exemplo.com", "carlos.souza@exemplo.com", "ana.santos@exemplo.com", "pedro.lima@exemplo.com"};
        int[] crms = {123456, 234567, 345678, 456789, 567890};
        LocalDate[] datasNascimento = {
                LocalDate.of(1980, 1, 1),
                LocalDate.of(1975, 5, 20),
                LocalDate.of(1990, 8, 15),
                LocalDate.of(1985, 3, 10),
                LocalDate.of(1995, 12, 25)};
        for(int i = 0; i < nomes.length; i++){
            Medico medico = new Medico(nomes[i], datasNascimento[i], telefones[i], emails[i], especialidades[i], crms[i]);
            this.idMedicoControle += 1;
            medico.setId(this.idMedicoControle);
            this.colecaoMedicos.add(medico);
        }
           
        System.out.println("Processo finalizado!");
    }
    
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
    
    public void listarMedicos(){
        System.out.println("----------------------------");
        System.out.println("       LISTA MEDICOS        ");
        System.out.println("----------------------------");
        
        ArrayList<Medico> allMedicos = colecaoMedicos.getMedicos();
        
        int index = 1;
        
        for(Medico medico : allMedicos){

            System.out.println("+----------------------------------------+");
            System.out.printf("| Index: %-25s \n", index);
            System.out.printf("| Id: %-25s \n", medico.getId());
            System.out.printf("| Nome: %-25s \n", medico.getNome());
            System.out.printf("| Data de nascimento: %-10s \n", medico.getDataNascimento());
            System.out.printf("| Telefone: %-19s \n", medico.getTelefone());
            System.out.printf("| Email: %-22s \n", medico.getEmail());
            System.out.printf("| Especialidade: %-15s \n", medico.getEspecialidade());
            System.out.printf("| CRM: %-24d \n", medico.getCrm());
            System.out.println("+----------------------------------------+");

            index += 1;
        }

    }

    public void autualizarMedico(){
        System.out.println("----------------------------");
        System.out.println("      ATUALIZAR MEDICO      ");
        System.out.println("----------------------------");
        
        this.listarMedicos();
        
        System.out.println("Informe o id do médico que será atualizado: ");
        int id = read.nextInt();
        
        Medico medico = colecaoMedicos.getMedicoById(id);

        System.out.println("+----------------------------------------+");
        System.out.printf("| Id: %-25s \n", medico.getId());    
        System.out.printf("| Nome: %-25s \n", medico.getNome());
        System.out.printf("| Data de nascimento: %-10s \n", medico.getDataNascimento());
        System.out.printf("| Telefone: %-19s \n", medico.getTelefone());
        System.out.printf("| Email: %-22s \n", medico.getEmail());
        System.out.printf("| Especialidade: %-15s \n", medico.getEspecialidade());
        System.out.printf("| CRM: %-24d \n", medico.getCrm());
        System.out.println("+----------------------------------------+");
        System.out.println();
        
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
        
        if(!nome.equals(medico.getNome()) && nome != ""){
            medico.setNome(nome);    
        }
        if(!dataNascimento.equals(medico.getDataNascimento())){
            medico.setDataNascimento(dataNascimento);
        }
        if(!telefone.equals(medico.getTelefone()) && telefone != ""){
            medico.setTelefone(telefone);
        }
        if(!email.equals(medico.getEmail()) && email != ""){
            medico.setEmail(email);
        }
        if(!especialidade.equals(medico.getEspecialidade()) && especialidade != ""){
            medico.setEspecialidade(especialidade);
        }
        if(crm != medico.getCrm()){
            medico.setCrm(crm);
        }
        
    }
    
    public void removerMedico(){
        System.out.println("----------------------------");
        System.out.println("       REMOVER MEDICO       ");
        System.out.println("----------------------------");
        
        this.listarMedicos();
        
        System.out.println("Informe o id do médico que será removido: ");
        int id = read.nextInt();
        
        colecaoMedicos.removeById(id);
    }
    

    
    //METODOS SECRETARIA
    public void cadastroSecretariaIterno(){
        
        String[] nomes = {"João Silva", "Maria Oliveira", "Carlos Souza", "Ana Santos", "Pedro Lima"};
        LocalDate[] datasNascimento = {
            LocalDate.of(1985, 5, 15),
            LocalDate.of(1990, 8, 20),
            LocalDate.of(1978, 12, 10),
            LocalDate.of(1982, 3, 5),
            LocalDate.of(1995, 7, 22)
        };
        String[] telefones = {"555-1234", "555-5678", "555-8765", "555-4321", "555-6789"};
        String[] emails = {
            "joao.silva@example.com",
            "maria.oliveira@example.com",
            "carlos.souza@example.com",
            "ana.santos@example.com",
            "pedro.lima@example.com"
        };
        for(int i = 0; i < nomes.length; i++){
            Secretaria secretaria = new Secretaria(nomes[i], datasNascimento[i], telefones[i], emails[i]);
            this.idSecretariaControle += 1;
            secretaria.setId(this.idSecretariaControle);
               
            colecaoSecretarias.add(secretaria);
        }
    
    
    }
    
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
        this.idSecretariaControle += 1;
        secretaria.setId(idSecretariaControle);
        
        colecaoSecretarias.add(secretaria);
            
        System.out.println("----------------------------");
        System.out.println("    Cadastro finalizado!"    );
        System.out.println("----------------------------");        
    }
   
    public void listarSecretarias(){
        System.out.println("----------------------------");
        System.out.println("     LISTA SECRETARIAS      ");
        System.out.println("----------------------------");
        
        ArrayList<Secretaria> allSecretarias = colecaoSecretarias.getSecretarias();
        
        int index = 1;
        
        for(Secretaria secretaria : allSecretarias){

            System.out.println("+----------------------------------------+");
            System.out.printf("| Index: %-25s \n", index);
            System.out.printf("| Id: %-25s \n", secretaria.getId());
            System.out.printf("| Nome: %-25s \n", secretaria.getNome());
            System.out.printf("| Data de nascimento: %-10s \n", secretaria.getDataNascimento());
            System.out.printf("| Telefone: %-19s \n", secretaria.getTelefone());
            System.out.printf("| Email: %-22s \n", secretaria.getEmail());
            System.out.println("+----------------------------------------+");

            index += 1;
        }
    }
    
    public void atualizarSecretaria(){
        System.out.println("----------------------------");
        System.out.println("    ATUALIZAR SECRETARIA    ");
        System.out.println("----------------------------");
        
        this.listarSecretarias();
        
        System.out.println("Informe o id da secretaria que será atualizado: ");
        int id = read.nextInt();
        
        Secretaria secretaria = colecaoSecretarias.getSecretariaById(id);

        System.out.println("+----------------------------------------+");
        System.out.printf("| Id: %-25s \n", secretaria.getId());    
        System.out.printf("| Nome: %-25s \n", secretaria.getNome());
        System.out.printf("| Data de nascimento: %-10s \n", secretaria.getDataNascimento());
        System.out.printf("| Telefone: %-19s \n", secretaria.getTelefone());
        System.out.printf("| Email: %-22s \n", secretaria.getEmail());
        System.out.println("+----------------------------------------+");
        System.out.println();
        
        System.out.print("Nome secretaria: ");
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
        
        if(!nome.equals(secretaria.getNome()) && nome != ""){
            secretaria.setNome(nome);    
        }
        if(!dataNascimento.equals(secretaria.getDataNascimento())){
            secretaria.setDataNascimento(dataNascimento);
        }
        if(!telefone.equals(secretaria.getTelefone()) && telefone != ""){
            secretaria.setTelefone(telefone);
        }
        if(!email.equals(secretaria.getEmail()) && email != ""){
            secretaria.setEmail(email);
        }
    }
    
    public void removerSecretaria(){
        System.out.println("----------------------------");
        System.out.println("     REMOVER SCRETARIA      ");
        System.out.println("----------------------------");
        
        this.listarSecretarias();
        
        System.out.println("Informe o id do secretaria que será removido: ");
        int id = read.nextInt();
        
        colecaoSecretarias.removeById(id);
    }
    

}
