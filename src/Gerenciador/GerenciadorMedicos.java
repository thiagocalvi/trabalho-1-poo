/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;
import Colecao.ColecaoConsultas;
import Colecao.ColecaoPacientes;
import Colecao.ColecaoProntuarios;
import Colecao.ColecaoDadosMedicos;

import Modelo.Paciente;
import Modelo.Consulta;
import Modelo.Prontuario;
import Modelo.DadosMedicos;
import Modelo.Medico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author jeanm
 */
public class GerenciadorMedicos {
    
    private ColecaoConsultas colecaoConsultas;
    private ColecaoPacientes colecaoPacientes;
    private ColecaoProntuarios colecaoProntuarios;
    private ColecaoDadosMedicos colecaoDadosMedicos;
    private Medico medico;
    private ArrayList<Consulta> consultasDoDia = new ArrayList();
    private int idDadosMedicosControle = 0;
    private int idProtuarioControle = 0;

    
    
    public GerenciadorMedicos(ColecaoConsultas colecaoConsultas, ColecaoPacientes colecaoPacientes, ColecaoProntuarios colecaoProntuarios, ColecaoDadosMedicos colecaoDadosMedicos){
        this.colecaoConsultas = colecaoConsultas;
        this.colecaoPacientes = colecaoPacientes;
        this.colecaoProntuarios = colecaoProntuarios;
        this.colecaoDadosMedicos = colecaoDadosMedicos;
        
    }
    
    public Medico getMedico(){
        return this.medico;
    }
    
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    
    private void setConsultasDoDia(){
        ArrayList<Consulta> consultas = colecaoConsultas.getConsultas();
        LocalDate dataAtual = LocalDate.now();
        for (Consulta consulta : consultas){
            if(consulta.getMedicoId() == medico.getId() && consulta.getData().equals(dataAtual)){
                this.consultasDoDia.add(consulta);
            }
        }
        
        Collections.sort(consultasDoDia, new Comparator<Consulta>() {
            
            public int compare(Consulta c1, Consulta c2) {
                return c1.getHorario().compareTo(c2.getHorario());
            }
        });
        
    }
    
    Scanner read = new Scanner(System.in);
    
    public void listaConsultasDoDia(){
         
        if (consultasDoDia.isEmpty()) {
            this.setConsultasDoDia();
            if(consultasDoDia.isEmpty()){
                System.out.println("Nenhuma consulta para hoje.");
                return;        
            }
        }

        System.out.println("----------------------------");
        System.out.println("     LISTA DE CONSULTAS     ");
        System.out.println("----------------------------");

        for (Consulta consulta : consultasDoDia) {
            System.out.println("ID: " + consulta.getId());
            System.out.println("Data: " + consulta.getData());
            System.out.println("Horário: " + consulta.getHorario());
            System.out.println("Paciente: " + colecaoPacientes.getPacienteById(consulta.getPacienteId()).getNome());
            System.out.println("----------------------------");
        }
    }
    
    
    
    
    
    public void cadastrarProntuario(Consulta consulta){
        
        System.out.println("----------------------------");
        System.out.println("    CADASTRAR PRONTUÁRIO    ");
        System.out.println("----------------------------");

        // Coletar dados do prontuário
        //System.out.println("Informe a data da consulta (formato: YYYY-MM-DD):");
        //LocalDate dataConsulta = LocalDate.parse(read.nextLine());
        
        LocalDate dataConsulta = consulta.getData();
        
        System.out.println("Informe os sintomas:");
        String sintomas = read.nextLine();

        System.out.println("Informe o diagnóstico:");
        String diagnostico = read.nextLine();

        System.out.println("Informe o tratamento:");
        String tratamento = read.nextLine();

        // Cria um novo prontuário com os dados coletados
        Prontuario prontuario = new Prontuario(dataConsulta, sintomas, diagnostico, tratamento);

        // Adiciona o prontuário à coleção de prontuários
        this.idProtuarioControle += 1;
        prontuario.setId(idProtuarioControle);
        prontuario.setPacienteId(colecaoPacientes.getPacienteById(consulta.getPacienteId()));
        
        colecaoProntuarios.add(prontuario);

        System.out.println("Prontuário cadastrado com sucesso!");
    }
    
    public void atualizarProntuario() {
        System.out.println("----------------------------");
        System.out.println("    ATUALIZAR PRONTUÁRIO    ");
        System.out.println("----------------------------");

        System.out.println("Informe o ID do prontuário a ser atualizado:");
        int id = Integer.parseInt(read.nextLine());

        Prontuario prontuario = colecaoProntuarios.getProntuarioById(id);

        if (prontuario == null) {
            System.out.println("Prontuário não encontrado!");
            return;
        }

        System.out.println("Atualizar a data da consulta? (atual: " + prontuario.getDataConsulta() + ")");
        System.out.println("[0] - Para sim \n[1] - Para não");
        String resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe a nova data da consulta (formato: YYYY-MM-DD):");
            LocalDate dataConsulta = LocalDate.parse(read.nextLine());
            prontuario.setDataConsulta(dataConsulta);
        }

        System.out.println("Atualizar os sintomas? (atual: " + prontuario.getSintomas() + ")");
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe os novos sintomas:");
            String sintomas = read.nextLine();
            prontuario.setSintomas(sintomas);
        }

        System.out.println("Atualizar o diagnóstico? (atual: " + prontuario.getDiagnostico() + ")");
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe o novo diagnóstico:");
            String diagnostico = read.nextLine();
            prontuario.setDiagnostico(diagnostico);
        }

        System.out.println("Atualizar o tratamento? (atual: " + prontuario.getTratamento() + ")");
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe o novo tratamento:");
            String tratamento = read.nextLine();
            prontuario.setTratamento(tratamento);
        }

        System.out.println("Prontuário atualizado com sucesso!");
    }
    
    public void removerProntuario() {
        System.out.println("----------------------------");
        System.out.println("     REMOVER PRONTUÁRIO     ");
        System.out.println("----------------------------");

        System.out.println("Informe o ID do prontuário a ser removido:");
        int id = Integer.parseInt(read.nextLine());

        Prontuario prontuario = colecaoProntuarios.getProntuarioById(id);

        if (prontuario == null) {
            System.out.println("Prontuário não encontrado!");
            return;
        }

        colecaoProntuarios.remove(prontuario);

        System.out.println("Prontuário removido com sucesso!");
    }

    public void cadastrarDados(){
        
        System.out.println("----------------------------");
        System.out.println("      DADOS ADICIONAIS      ");
        System.out.println("----------------------------");
        
        System.out.println("Insira um dado adicional:");
        String info = read.nextLine();
        
        System.out.println("Inserir outro dado?");
        System.out.println("[0] - Para sim \n[1] - Para não");
        String resposta = read.nextLine();
        
        while (resposta != "1"){
            System.out.println("----------------------------");
            System.out.println("      DADOS ADICIONAIS      ");
            System.out.println("----------------------------");

            System.out.println("Insira um dado adicional:");
            String infoAdicional = read.nextLine();

            System.out.println("Inserir outro dado?");
            System.out.println("[0] - Para sim \n[1] - Para não");
            String respostaAdicional = read.nextLine();
        }
    }
    
    public void  atualizarDados(){
        
        System.out.println("----------------------------");
        System.out.println("      DADOS ADICIONAIS      ");
        System.out.println("----------------------------");
        
        System.out.println("Selecione um dado para alteração:");
        String info = read.nextLine();
        
        System.out.println("Alterar outro dado?");
        System.out.println("[0] - Para sim \n[1] - Para não");
        String resposta = read.nextLine();
        
        while (resposta != "1"){
            System.out.println("----------------------------");
            System.out.println("      DADOS ADICIONAIS      ");
            System.out.println("----------------------------");

            System.out.println("Selecione um dado para alteração:");
            String infoAdicional = read.nextLine();

            System.out.println("Alterar outro dado?");
            System.out.println("[0] - Para sim \n[1] - Para não");
            String respostaAdicional = read.nextLine();
        }
    }
    
    public void removerDados(){
        System.out.println("----------------------------");
        System.out.println("      DADOS ADICIONAIS      ");
        System.out.println("----------------------------");
        
        System.out.println("Selecione um dado para remoção:");
        String info = read.nextLine();
        
        System.out.println("Remover outro dado?");
        System.out.println("[0] - Para sim \n[1] - Para não");
        String resposta = read.nextLine();
        
        while (resposta != "1"){
            System.out.println("----------------------------");
            System.out.println("      DADOS ADICIONAIS      ");
            System.out.println("----------------------------");

            System.out.println("Selecione um dado para remoção:");
            String infoAdicional = read.nextLine();

            System.out.println("Alterar outro dado?");
            System.out.println("[0] - Para sim \n[1] - Para não");
            String respostaAdicional = read.nextLine();
        }
    }

    public void listarAllConsultas(){
        //Listas todas as consultas associadas ao medico
        ArrayList<Consulta> allConsultas = colecaoConsultas.getConsultas();
        for(Consulta consulta : allConsultas){
            if(consulta.getMedicoId() == medico.getId()){
                System.out.println("ID: " + consulta.getId());
                System.out.println("Data: " + consulta.getData());
                System.out.println("Horário: " + consulta.getHorario());
                System.out.println("Paciente: " + colecaoPacientes.getPacienteById(consulta.getPacienteId()).getNome());
                System.out.println("----------------------------");
            }
        }
    }


}