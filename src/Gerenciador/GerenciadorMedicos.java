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
import java.util.List;
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
            
            @Override
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
        //Listar todos os prontuarios do paciente
        
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
        System.out.println("  CADRASTRAR DADOS MÉDICOS  ");
        System.out.println("----------------------------");
        
        System.out.println("O paciente fuma? (true/false)");
        boolean fuma = Boolean.parseBoolean(read.nextLine());

        System.out.println("O paciente bebe? (true/false)");
        boolean bebe = Boolean.parseBoolean(read.nextLine());

        System.out.println("Nível de colesterol:");
        String colesterol = read.nextLine();

        System.out.println("O paciente é diabético? (true/false)");
        boolean diabete = Boolean.parseBoolean(read.nextLine());

        System.out.println("O paciente tem doença cardíaca? (true/false)");
        boolean doencaCardiaca = Boolean.parseBoolean(read.nextLine());

        System.out.println("Informe as cirurgias realizadas (separadas por vírgula):");
        List<String> cirurgias = List.of(read.nextLine().split(","));

        System.out.println("Informe as alergias (separadas por vírgula):");
        List<String> alergias = List.of(read.nextLine().split(","));

        DadosMedicos dadosMedicos = new DadosMedicos(fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgias, alergias);
        this.idDadosMedicosControle += 1;
        dadosMedicos.setId(idDadosMedicosControle);
        colecaoDadosMedicos.add(dadosMedicos);

        System.out.println("Dados médicos cadastrados com sucesso!");
    }
    
    public void  atualizarDados(){
        
        System.out.println("----------------------------");
        System.out.println("   ATUALIZAR DADOS MÉDICOS  ");
        System.out.println("----------------------------");

        System.out.println("Informe o ID dos dados médicos a serem atualizados:");
        int id = Integer.parseInt(read.nextLine());
        DadosMedicos dadosMedicos = colecaoDadosMedicos.getDadosMedicosById(id);

        if (dadosMedicos == null) {
            System.out.println("Dados médicos não encontrados!");
            return;
        }

        System.out.println("Dados atuais:");
        System.out.println("Fuma: " + dadosMedicos.isFuma());
        System.out.println("Bebe: " + dadosMedicos.isBebe());
        System.out.println("Colesterol: " + dadosMedicos.getColesterol());
        System.out.println("Diabete: " + dadosMedicos.isDiabete());
        System.out.println("Doença Cardíaca: " + dadosMedicos.isDoencaCardiaca());
        System.out.println("Cirurgias: " + String.join(", ", dadosMedicos.getCirurgias()));
        System.out.println("Alergias: " + String.join(", ", dadosMedicos.getAlergias()));

        System.out.println("Atualizar fuma? (true/false) - Atual: " + dadosMedicos.isFuma());
        boolean fuma = Boolean.parseBoolean(read.nextLine());
        dadosMedicos.setFuma(fuma);

        System.out.println("Atualizar bebe? (true/false) - Atual: " + dadosMedicos.isBebe());
        boolean bebe = Boolean.parseBoolean(read.nextLine());
        dadosMedicos.setBebe(bebe);

        System.out.println("Atualizar colesterol - Atual: " + dadosMedicos.getColesterol());
        String colesterol = read.nextLine();
        dadosMedicos.setColesterol(colesterol);

        System.out.println("Atualizar diabete? (true/false) - Atual: " + dadosMedicos.isDiabete());
        boolean diabete = Boolean.parseBoolean(read.nextLine());
        dadosMedicos.setDiabete(diabete);

        System.out.println("Atualizar doença cardíaca? (true/false) - Atual: " + dadosMedicos.isDoencaCardiaca());
        boolean doencaCardiaca = Boolean.parseBoolean(read.nextLine());
        dadosMedicos.setDoencaCardiaca(doencaCardiaca);

        System.out.println("Atualizar cirurgias (separadas por vírgula) - Atual: " + String.join(", ", dadosMedicos.getCirurgias()));
        List<String> cirurgias = List.of(read.nextLine().split(","));
        dadosMedicos.setCirurgias(cirurgias);

        System.out.println("Atualizar alergias (separadas por vírgula) - Atual: " + String.join(", ", dadosMedicos.getAlergias()));
        List<String> alergias = List.of(read.nextLine().split(","));
        dadosMedicos.setAlergias(alergias);

        System.out.println("Dados médicos atualizados com sucesso!");
    }
    
    public void removerDados(){
        System.out.println("----------------------------");
        System.out.println("    REMOVER DADOS MÉDICOS   ");
        System.out.println("----------------------------");

        System.out.println("Informe o ID dos dados médicos a serem removidos:");
        int id = Integer.parseInt(read.nextLine());
        colecaoDadosMedicos.removeById(id);

        System.out.println("Dados médicos removidos com sucesso!");
    }

    
    public void listarDados() {
        System.out.println("----------------------------");
        System.out.println("    LISTAR DADOS MÉDICOS    ");
        System.out.println("----------------------------");

        ArrayList<DadosMedicos> todosDados = colecaoDadosMedicos.getDadosMedicos();
        
        for (DadosMedicos dadosMedicos : todosDados) {
            System.out.println("ID: " + dadosMedicos.getId());
            System.out.println("Fuma: " + dadosMedicos.isFuma());
            System.out.println("Bebe: " + dadosMedicos.isBebe());
            System.out.println("Colesterol: " + dadosMedicos.getColesterol());
            System.out.println("Diabete: " + dadosMedicos.isDiabete());
            System.out.println("Doença Cardíaca: " + dadosMedicos.isDoencaCardiaca());
            System.out.println("Cirurgias: " + String.join(", ", dadosMedicos.getCirurgias()));
            System.out.println("Alergias: " + String.join(", ", dadosMedicos.getAlergias()));
            System.out.println("----------------------------");
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