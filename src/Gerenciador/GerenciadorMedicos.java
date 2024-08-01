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

import Main.Main;

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
    private Paciente paciente;
    private Consulta consultaAtual;
    private ArrayList<Consulta> consultasDoDia = new ArrayList();
    private int idDadosMedicosControle = 0;
    private int idProtuarioControle = 0;

    
    
    public GerenciadorMedicos(ColecaoConsultas colecaoConsultas, ColecaoPacientes colecaoPacientes, ColecaoProntuarios colecaoProntuarios, ColecaoDadosMedicos colecaoDadosMedicos){
        this.colecaoConsultas = colecaoConsultas;
        this.colecaoPacientes = colecaoPacientes;
        this.colecaoProntuarios = colecaoProntuarios;
        this.colecaoDadosMedicos = colecaoDadosMedicos;
        
    }
    
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Medico getMedico(){
        return this.medico;
    }
    
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    
    public Consulta getConsultaAtual(){
        return this.consultaAtual;
    }
    
    public void setConsultaAtual(){
        Consulta consulta = consultasDoDia.remove(0);
        if(consulta != null){
            this.consultaAtual = consulta;    
        }
    }
    
    public void resetConsultaAtual(){
        this.consultaAtual.setConsutaFinalizada(true);
        this.consultaAtual = null;
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


        System.out.println("+----------------------------------+");
        System.out.println("         LISTA DE CONSULTAS         ");
        System.out.println("+----------------------------------+");

        for (Consulta consulta : consultasDoDia) {
            if(!consulta.getConsutaFinalizada()){
                System.out.println("ID: " + consulta.getId());
                System.out.println("Data: " + consulta.getData());
                System.out.println("Horário: " + consulta.getHorario());
                System.out.println("Paciente: " + colecaoPacientes.getPacienteById(consulta.getPacienteId()).getNome());
                System.out.println("----------------------------");    
            }
        }
    }
    
    
    
    
    
    public void cadastrarProntuario(){
        
        System.out.println("+----------------------------------+");
        System.out.println("        CADASTRAR PRONTUÁRIO        ");
        System.out.println("+----------------------------------+");

        // Coletar dados do prontuário
        //System.out.println("Informe a data da consulta (formato: YYYY-MM-DD):");
        //LocalDate dataConsulta = LocalDate.parse(read.nextLine());
        
        LocalDate dataConsulta = consultaAtual.getData();
        
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
        prontuario.setPacienteId(colecaoPacientes.getPacienteById(consultaAtual.getPacienteId()));
        
        consultaAtual.setProtuarioId(prontuario);
        colecaoProntuarios.add(prontuario);

        System.out.println("+====================================+");
        System.out.println("  PRONTUARIO CADASTRADO COM SUCESSO!  ");
        System.out.println("+====================================+"); 
    }
    
    public void atualizarProntuario() {
        //Seria melhor permitir que somente protuario da consulta atual seja atualizado?
        //Listar todos os prontuarios do paciente
        
        //TO-DO
        
        System.out.println("+----------------------------------+");
        System.out.println("        ATUALIZAR PRONTUÁRIO        ");
        System.out.println("+----------------------------------+");

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

        System.out.println("+====================================+");
        System.out.println("  PRONTUARIO ATUALIZADO COM SUCESSO!  ");
        System.out.println("+====================================+"); 
    }
    
    public void removerProntuario() {
        
        //Acredito que essa função seja desnecessário
        
        System.out.println("+----------------------------------+");
        System.out.println("         REMOVER PRONTUÁRIO         ");
        System.out.println("+----------------------------------+");

        System.out.println("Informe o ID do prontuário a ser removido:");
        int id = Integer.parseInt(read.nextLine());

        Prontuario prontuario = colecaoProntuarios.getProntuarioById(id);

        if (prontuario == null) {
            System.out.println("Prontuário não encontrado!");
            return;
        }

        colecaoProntuarios.remove(prontuario);

        System.out.println("+==================================+");
        System.out.println("  PRONTUARIO REMOVIDO COM SUCESSO!  ");
        System.out.println("+==================================+"); 
    }

    public void cadastrarDados(){
        Paciente paciente  = colecaoPacientes.getPacienteById(consultaAtual.getPacienteId());
        
        //Como uma paciente pode ter somente um dado medico deve se fazer essa verifica
        
        //Não sei se essa é a melhor solução
        if(paciente.getDadosMedicosId() != 0){
            System.out.println("O paciente " + paciente.getNome() + " já possui dados médicos cadastrados");
            //Provavelmem sera nescessario um return aqui 
            //Agora o valor que deve se retorna não sei
        }
        else{
            
            System.out.println("+----------------------------------+");
            System.out.println("      CADRASTRAR DADOS MÉDICOS      ");
            System.out.println("+----------------------------------+");

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
            paciente.setDadosMedicosId(dadosMedicos);
            colecaoDadosMedicos.add(dadosMedicos);


            System.out.println("+=======================================+");
            System.out.println("  DADOS MÉDICOS CADASTRADO COM SUCESSO!  ");
            System.out.println("+=======================================+");    
            
        }
        
    }
    
    public void  atualizarDados(){
        
        System.out.println("+----------------------------------+");
        System.out.println("       ATUALIZAR DADOS MÉDICOS      ");
        System.out.println("+----------------------------------+");

        //Não é nescessario pedir o ID dos dados medicos esse dado já esta viculado 
        //ao paciente da consulta atual
        
        //System.out.println("Informe o ID dos dados médicos a serem atualizados:");
        //int id = Integer.parseInt(read.nextLine());
        //DadosMedicos dadosMedicos = colecaoDadosMedicos.getDadosMedicosById(id);

        Paciente paciente  = colecaoPacientes.getPacienteById(consultaAtual.getPacienteId());
        DadosMedicos dadosMedicos = colecaoDadosMedicos.getDadosMedicosById(paciente.getDadosMedicosId());
        
        //Vericar se o paciente da consulta atual tem dados medicos já cadastrados
        if (paciente.getDadosMedicosId() == 0) {
            System.out.println("O paciente não possui dados medicos cadastrados!");
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
        System.out.println("[0] - Para sim \n[1] - Para não");
        String resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe a condição do paciente:");
            boolean fuma = Boolean.parseBoolean(read.nextLine());
            dadosMedicos.setFuma(fuma);
        }

        System.out.println("Atualizar bebe? (true/false) - Atual: " + dadosMedicos.isBebe());
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe a condição do paciente:");
            boolean bebe = Boolean.parseBoolean(read.nextLine());
            dadosMedicos.setBebe(bebe);
        }

        System.out.println("Atualizar colesterol - Atual: " + dadosMedicos.getColesterol());
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe o novo nível de colesterol:");
            String colesterol = read.nextLine();
            dadosMedicos.setColesterol(colesterol);
        }

        System.out.println("Atualizar diabete? (true/false) - Atual: " + dadosMedicos.isDiabete());
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe a condição do paciente:");
            boolean diabete = Boolean.parseBoolean(read.nextLine());
            dadosMedicos.setDiabete(diabete);
        }

        System.out.println("Atualizar doença cardíaca? (true/false) - Atual: " + dadosMedicos.isDoencaCardiaca());
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe a condição do paciente:");
            boolean doencaCardiaca = Boolean.parseBoolean(read.nextLine());
            dadosMedicos.setDoencaCardiaca(doencaCardiaca);
        }
        
        System.out.println("Atualizar cirurgias (separadas por vírgula) - Atual: " + String.join(", ", dadosMedicos.getCirurgias()));
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe as novas cirurgias (separadas por vírgula):");
            List<String> cirurgias = List.of(read.nextLine().split(","));
            dadosMedicos.setCirurgias(cirurgias);
        }

        System.out.println("Atualizar alergias (separadas por vírgula) - Atual: " + String.join(", ", dadosMedicos.getAlergias()));
        System.out.println("[0] - Para sim \n[1] - Para não");
        resposta = read.nextLine();
        if (resposta.equals("0")) {
            System.out.println("Informe as novas alergias (separadas por vírgula):");
            List<String> alergias = List.of(read.nextLine().split(","));
            dadosMedicos.setAlergias(alergias);
        }

        System.out.println("+=======================================+");
        System.out.println("  DADOS MÉDICOS ATUALIZADO COM SUCESSO!  ");
        System.out.println("+=======================================+");   
    }
    
    public void removerDados(){
        System.out.println("+----------------------------------+");
        System.out.println("        REMOVER DADOS MÉDICOS       ");
        System.out.println("+----------------------------------+");

        //Não é nescessario informar o id essa informação já está no paciente da consulta atual
        
        //System.out.println("Informe o ID dos dados médicos a serem removidos:");
        //int id = Integer.parseInt(read.nextLine());
        //colecaoDadosMedicos.removeById(id);

        Paciente paciente  = colecaoPacientes.getPacienteById(consultaAtual.getPacienteId());
        colecaoDadosMedicos.removeById(paciente.getDadosMedicosId());

        
        //Vericar se o paciente da consulta atual tem dados medicos já cadastrados
        if (paciente.getDadosMedicosId() == 0) {
            System.out.println("O paciente não possui dados medicos cadastrados!");
            return;
        }
                
        //TO-DO
        //Quando remover os dados medicos de um paciente deve se setar a atributo dadosMedicosId do paciente para 0
        //Provavelmente criar um set na classes paciente para fazer isso dever resolver
        
        System.out.println("+=====================================+");
        System.out.println("  DADOS MÉDICOS REMOVIDO COM SUCESSO!  ");
        System.out.println("+=====================================+");  
    }

    
    public void listarDados() {
        //TO-DO > FEITO
        //Implementar a correção
        //Listar somente os dados medicos do paciente da consulta atual
        
        System.out.println("+----------------------------------+");
        System.out.println("        LISTAR DADOS MÉDICOS        ");
        System.out.println("+----------------------------------+");
        
        //Como cada paciente terá somente um dado medico associado a ele
        //não é nescessario listar todos os dados medicos de colecaoDadosMedicos
        
        /*
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
        */
        
        Paciente paciente  = colecaoPacientes.getPacienteById(consultaAtual.getPacienteId());
        DadosMedicos dadosMedicos = colecaoDadosMedicos.getDadosMedicosById(paciente.getDadosMedicosId());
        
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

    public void listarAllConsultas(){
        //Listas todas as consultas associadas ao medico
        ArrayList<Consulta> allConsultas = colecaoConsultas.getConsultas();
        for(Consulta consulta : allConsultas){
            if(consulta.getMedicoId() == medico.getId()){
                System.out.println("ID: " + consulta.getId());
                System.out.println("Data: " + consulta.getData());
                System.out.println("Horário: " + consulta.getHorario());
                System.out.println("Tipo: " + consulta.getTipo());
                System.out.println("Paciente: " + colecaoPacientes.getPacienteById(consulta.getPacienteId()).getNome());
                System.out.println("----------------------------");
            }
        }
    }
    
    
    public void receitaMedica() {

        System.out.println("Separe os medicamentos por virgula(',')!");
        System.out.print("Informe os medicamentos para colocar na receita: ");
        String medicamentos = read.nextLine();
        String[] arrayMedicamentos = medicamentos.split(",");
        System.out.println("");        

        System.out.println("Gerando receita... ");
        Main.temporizador(3000);

        System.out.println("");
        System.out.println("+=========================================+");
        System.out.println("              RECEITA MÉDICA               ");
        System.out.println("+=========================================+");
        System.out.println("Consultório: +Melhor");
        System.out.println("Doutor: " + medico.getNome());
        System.out.println("Data: " + LocalDate.now()); 
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("");
        System.out.println("Medicamentos: ");

        for (String medicamento : arrayMedicamentos){
            System.out.println("         " + medicamento);
        }

        System.out.println("+=========================================+");
    }
    
    public void atestadoMedico() {


        System.out.println("Motivo da ausência: ");
        String ausencia = read.nextLine();

        System.out.println("Quantos dias de afastamento?");
        int afastamento = read.nextInt();

        System.out.println("Gerando atestado...");
        Main.temporizador(3000);

        System.out.println("+=========================================+");
        System.out.println("             ATESTADO MÉDICO               ");
        System.out.println("+=========================================+");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Data: " + LocalDate.now());
        System.out.println("Dias de repouso: " + afastamento);
        System.out.println("Médico responsável: " + medico.getNome());
        System.out.println("+=========================================+");
    }
    
    public void declaracaoAcompanhamento(){
        System.out.println("Nome do acompanhante: ");
        String acompanhante = read.nextLine();

        System.out.println("Motivo do acompanhante: ");
        String motivo = read.nextLine();

        System.out.println("Gerando declaraçao de acompanhamento...");
        Main.temporizador(3000);

        System.out.println("+=========================================+");
        System.out.println("        DECLARAÇÃO DE ACOMPANHAMENTO       ");
        System.out.println("+=========================================+");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Acompanhante: " + acompanhante);
        System.out.println("Motivo do acompanhante: " + motivo);
        System.out.println("");
        System.out.println("Data: " + LocalDate.now());
        System.out.println("Médico responsável: " + medico.getNome());
        System.out.println("+=========================================+");

    }
    
    public void relatorioMensal(){
        
        int totalClientes = 0;
        
        System.out.println("+=========================================+");
        System.out.println("        RELATÓRIO MENSAL DE CLIENTES       ");
        System.out.println("+=========================================+");
        
        int mesAtual = LocalDate.now().getMonthValue();
        for (Consulta consulta : colecaoConsultas.getConsultas()){
            if (consulta.getConsutaFinalizada()){
                if (consulta.getData().getMonthValue() == mesAtual){
                    totalClientes ++;
                    
                    System.out.println(colecaoPacientes.getPacienteById(consulta.getPacienteId()).getNome());
                    System.out.println(colecaoPacientes.getPacienteById(consulta.getPacienteId()).getTipoConvenio());
                    System.out.println("+------------------------------------------+");
                }
            }
        }
        System.out.println("+=========================================+");
        System.out.println("Total de Clientes atendidos nesse mês: " + totalClientes);
        
    }
}

//TO-DO - FEITO
//Implementar os métodos para gerar os relatórios